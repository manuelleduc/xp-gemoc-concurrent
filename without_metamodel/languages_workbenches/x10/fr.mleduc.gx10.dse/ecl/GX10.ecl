import 'platform:/resource/fr.mleduc.gx10.model/model/gx10.ecore'

ECLimport "platform:/plugin/fr.inria.aoste.timesquare.ccslkernel.model/ccsllibrary/kernel.ccslLib"
ECLimport "platform:/plugin/fr.inria.aoste.timesquare.ccslkernel.model/ccsllibrary/CCSL.ccslLib"
ECLimport "platform:/resource/fr.mleduc.gx10.mocc/mocc/GX10.ccslLib"

package gx10

context Program
	def : start : Event = self
	
context Method
	def : startMethodEvt : Event = self
	def : endMethodEvt : Event = self
	
context Statement
	def : startStatement : Event = self
	def : endStatement : Event = self
	
context Print
	def : print : Event = self.print()
	
context Block
	def : initBlock : Event = self.initBlock()

context IntVar
	def : evaluate : Event = self.evaluate()

context BoolVar
	def : evaluate : Event = self.evaluate()
	
context Plus
	def : evaluate : Event = self.evaluate()
		
context Equal
	def : evaluate : Event = self.evaluate()

context MethodCall
	def : callPreparation : Event = self.call()

context ControlStructure
	def : doEvaluateIf : Event = self.controlStructureCondition.getCurrentValue() [res] switch case self.res = true force evaluateTrue;
	                                                                    					   case self.res = false force evaluateFalse;
	def : evaluateTrue : Event = self
	def : evaluateFalse : Event = self
	

context Statement
	inv statementStartThenStop:
		Relation Precedes(self.startStatement, self.endStatement) -- WeakAlternates
		
	inv waitForPreviousToFinish:
		(self.inBlock <> null and self.inBlock.blockStatements->indexOf(self) > 1) implies
		(Relation Precedes(self.inBlock.blockStatements->at(self.inBlock.blockStatements->indexOf(self)-1).endStatement, self.startStatement))
		
	inv firstStartAfterBlockStart:
		(self.inBlock <> null and self.inBlock.blockStatements->first() = self) implies
		(Relation Precedes(self.inBlock.startStatement, self.startStatement))
		
	inv lastEndWhenBlockEnd:
		(self.inBlock <> null and self.inBlock.blockStatements->indexOf(self) = self.inBlock.blockStatements->size()) implies
		(Relation Precedes(self.endStatement, self.inBlock.endStatement))
	 
context ControlStructure
	inv ifTrueThenElseElse:
		Relation BooleanGuardedTransitionRule(self.doEvaluateIf, self.evaluateTrue, self.evaluateFalse)

context If
	
	inv ifConditionEvaluatedAfterStart:
		Relation Precedes(self.startStatement, self.controlStructureCondition.startStatement)
		
	inv ifMakeBranchingAfterEvalutation:
		Relation Precedes(self.controlStructureCondition.endStatement, self.doEvaluateIf)
		
	inv ifThenBranchStartIfEvaluateTrue:
		Relation Precedes(self.evaluateTrue, self.thenBlock.startStatement)
		
	inv ifElseBranchStartIfEvaluateFalse:
		Relation Precedes(self.evaluateFalse, self.elseBlock.startStatement)
	
	inv idEndWhenOneBranchEnd:
		let ifOnBrancheEnded:Event = Expression Inf(self.thenBlock.endStatement, self.elseBlock.endStatement) in
		(Relation Precedes(ifOnBrancheEnded, self.endStatement)) 	


context While

	-- expression is evaluated whenever we start the loop or a while loop ends
	inv whileEvaluateBeforeBranching:
		let allWhileLoopEnds : Event = Expression Union(self.startStatement, self.whileBlock.endStatement) in 
		(Relation Precedes(allWhileLoopEnds, self.controlStructureCondition.startStatement))
		
	inv whileWaitEndEvalBeforeBranching:
		Relation Precedes(self.controlStructureCondition.endStatement, self.doEvaluateIf)
		
	inv whileStartLoopOnEvalTrue:
		Relation Precedes(self.evaluateTrue, self.whileBlock.startStatement)
		
	inv whileEndOnEvalFalse:
		Relation Precedes(self.evaluateFalse, self.endStatement)
	
context Method
	inv methodStartThenEnd:
		Relation Precedes(self.startMethodEvt, self.endMethodEvt)  -- WeakAlternates
		
	inv methodBlockStartAtStart:
		Relation Precedes(self.startMethodEvt, self.methodBlock.startStatement) -- Coincides
		
	inv methodStopWhenBlockStop:
		Relation Precedes(self.methodBlock.endStatement, self.endMethodEvt) -- Coincides
		
	inv methodStartOnCall0:
		(self.inProgram.startMethod = self and self.calledBy->size() > 0) implies
		let allEventWhichCall0 : Event = Expression Union(self.calledBy.callPreparation) in
		let inps0 : Event = self.inProgram.startMethod.startMethodEvt in
		let allEventsUnion : Event = Expression Union(inps0, allEventWhichCall0) in
		(Relation Precedes(allEventsUnion, self.startMethodEvt))

	inv methodStartOnCall1:
		(self.inProgram.startMethod = self and self.calledBy->size() = 0) implies
		(Relation Coincides(self.inProgram.startMethod.startMethodEvt, self.startMethodEvt))
	
	inv methodStartOnCall2:
		(self.inProgram.startMethod <> self and self.calledBy->size() > 0) implies
		let allEventWhichCall2 : Event = Expression Union(self.calledBy.callPreparation) in
		(Relation Precedes(allEventWhichCall2, self.startMethodEvt))
		
	inv methodEndOnCall2:
		(self.inProgram.startMethod <> self and self.calledBy->size() > 0) implies
		let allEventWhichCall22 : Event = Expression Union(self.calledBy.endStatement) in
		(Relation Precedes(self.endMethodEvt, allEventWhichCall22))
	
		
context MethodCall

	inv methodStartBeforePrepareCall:
		Relation Precedes(self.startStatement, self.callPreparation)

context IntVar
	inv intVarEvaluateBefore0:
		Relation Precedes(self.startStatement, self.intVarExpr.startStatement)
		
	inv intVarEvaluateBefore1:
		Relation Precedes(self.intVarExpr.endStatement, self.evaluate)
		
	inv intVarEvaluateBeforet:
		Relation Precedes(self.evaluate, self.endStatement)

context BoolVar
	inv boolVarEvaluateBefore0:
		Relation Precedes(self.startStatement, self.boolVarExpr.startStatement)
		
	inv boolVarEvaluateBefore1:
		Relation Precedes(self.boolVarExpr.endStatement, self.evaluate)
		
	inv boolVarEvaluateBeforet:
		Relation Precedes(self.evaluate, self.endStatement)

context Print
	inv printEvaluateBeforePrint0:
		Relation Precedes(self.startStatement, self.toPrint.startStatement)
		
	inv printEvaluateBeforePrint1:
		Relation Precedes(self.toPrint.endStatement, self.print)
		
	inv printFinishAfterPrint:
		Relation Precedes(self.print, self.endStatement)
		

		
context Plus
	inv plusStartThenLeftEvaluation:
		Relation Precedes(self.startStatement, self.leftPlus.startStatement)
	inv plusStartRightAfterEndFinished:
		Relation Precedes(self.leftPlus.endStatement, self.rightPlus.startStatement)
	inv plusEvaluateOnceRightEnd:
		Relation Precedes(self.rightPlus.endStatement, self.evaluate)
	inv plusFinishOnceEvaluated:
		Relation Precedes(self.evaluate, self.endStatement)

context Not
	inv notStartThenExpressionStart:
		Relation Precedes(self.startStatement, self.notExpression.startStatement)
	inv notEndAfterExpressionEnd:
		Relation Precedes(self.notExpression.endStatement, self.endStatement)

context Equal
	inv equalStartThenLeftEvaluation:
		Relation Precedes(self.startStatement, self.leftEqual.startStatement)
	inv equalStartRightAfterEndFinished:
		Relation Precedes(self.leftEqual.endStatement, self.rightEqual.startStatement)
	inv equalEvaluateOnceRightEnd:
		Relation Precedes(self.rightEqual.endStatement, self.evaluate)
	inv equallFinishOnceEvaluated:
		Relation Precedes(self.evaluate, self.endStatement)

		
context Block
	inv blockInitFirstAfterStart:
		Relation Precedes(self.startStatement, self.initBlock)
	inv firstInstructionStartWhenBlockReady:
		(self.blockStatements->size() > 0) implies
		(Relation Precedes(self.initBlock, self.blockStatements->first().startStatement))
		
	inv blockStatementWaitForAllToFinish:
		(self.blockStatements->size() > 0) implies 
		(Relation Precedes(self.blockStatements->last().endStatement, self.endStatement))

context Program
	inv initBeforeAll:
		Relation Precedes(self.start, self.startMethod.startMethodEvt)
		
	inv initOnlyOnce:
		let oneStartOnly : Event = Expression OneTickAndNoMore(self.start) 
		in Relation Coincides(self.start, oneStartOnly)

endpackage
