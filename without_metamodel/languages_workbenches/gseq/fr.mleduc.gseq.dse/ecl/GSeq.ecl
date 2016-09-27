import 'platform:/resource/fr.mleduc.gseq.model/model/gseq.ecore'
import _'http://www.eclipse.org/emf/2002/Ecore'

ECLimport "platform:/plugin/fr.inria.aoste.timesquare.ccslkernel.model/ccsllibrary/kernel.ccslLib"
ECLimport "platform:/plugin/fr.inria.aoste.timesquare.ccslkernel.model/ccsllibrary/CCSL.ccslLib"
ECLimport "platform:/resource/fr.mleduc.gseq.mocc/mocc/GSeq.ccslLib"


package gseq

context Program
	def : start : Event = self.init()

context BooleanExpression
	def : bvalue : Event = self.bvalue()

context Method
	def : callIt : Event = self.call()
	def : endOf : Event = self
	
context Operation
	def : execute : Event = self.execute()
	def : endOfOperation : Event = self

context Print
	def : print : Event = self.print()

context Operation
	inv openrationStartThenEnd:
		Relation Precedes(self.execute, self.endOfOperation)

context If
	def : doEvaluateIf : Event = self.conditionIf.bvalue() [res] switch case self.res = true force evaluateTrue;
	                                                                    case self.res = false force evaluateFalse;
	def : evaluateTrue : Event = self
	def : evaluateFalse : Event = self



context Method

    -- all the operation of a method must be executed in sequence 
	inv oppOrdered:
		Relation Precedes(self.operations.execute)
		
	inv firstOppAfterCall:
		(self.operations->size() > 0) implies
		let firstOppMethod : Event = self.operations->first().execute in
		Relation Precedes(self.callIt, firstOppMethod)
		
	inv methodStartOnCall0:
		(self.inProgram.startMethod = self and self.calledBy->size() > 0) implies
	    let allEventWhichCall0 : Event = Expression Union(self.calledBy.execute) in
	    let inps : Event = self.inProgram.start in
	    let allEventWhichCall00 : Event = Expression Union(allEventWhichCall0, inps) in
		(Relation Precedes(allEventWhichCall00, self.callIt))
		
	inv methodStartOnCall1:
		(self.inProgram.startMethod = self and self.calledBy->size() = 0) implies
		let inps1 : Event = self.inProgram.start in
		(Relation Precedes(inps1, self.callIt))
		
	inv methodStartOnCall2:
		(self.inProgram.startMethod <> self and self.calledBy->size() > 0) implies
	    let allEventWhichCall1 : Event = Expression Union(self.calledBy.execute) in
		Relation Precedes(allEventWhichCall1, self.callIt)
		
	inv endOfAfterAll:
		Relation Precedes(self.operations->last().endOfOperation, self.endOf)
	inv endOfAfterAllEndOf:
		(self.operations->select(e | (e).oclIsKindOf(MethodCall))->size() > 0) implies
		(Relation Precedes(self.operations->select(e | (e).oclIsKindOf(MethodCall))->last().oclAsType(MethodCall).methodToCall.endOf, self.endOf))	
	
		
context Assign
	inv assignEvaluteBeforeSelf:
		Relation Precedes(self.execute, self.assignedExpression.execute)
	
	inv evaluationFinishBeforeSelf:
		Relation Precedes(self.assignedExpression.endOfOperation, self.endOfOperation)



context If

	inv doEvaluateIfMoment:
		Relation Coincides(self.execute, self.doEvaluateIf)

	inv ifTrueThenElseElse:
		Relation BooleanGuardedTransitionRule(self.doEvaluateIf, self.evaluateTrue, self.evaluateFalse)
		
	inv ifConditionAfterSelfExecute:
		Relation Precedes(self.execute, self.conditionIf.execute)
	
	inv ifThenBranchAfterSelfExecute:
		Relation Precedes(self.evaluateTrue, self.thenBranch.execute)
	
	inv ifElseBranchAfterSelfExecute:
		(self.elseBranch <> null) implies (Relation Precedes(self.evaluateFalse, self.elseBranch.execute))
		
--	inv endOfOperationAfterAllContaingEndsOfOperation:
--		let unionsTheElse : Event = Expression Inf(self.thenBranch.endOfOperation, self.elseBranch.endOfOperation)
--		in Relation Precedes(unionsTheElse, self.endOfOperation)

	inv endOfAfterEndOfCondition:
		Relation Precedes(self.conditionIf.endOfOperation, self.endOfOperation)
		
	inv ifEndOfConditionBeforeBranching:
		let unionsTheElse2 : Event = Expression Inf(self.thenBranch.execute, self.elseBranch.execute) in
		Relation Precedes(self.conditionIf.endOfOperation, unionsTheElse2)

context BooleanExpression
	inv beBvalueAfterExecute:
		Relation Precedes(self.execute, self.bvalue)
		
	inv beBValueBeforeEnd:
		Relation Precedes(self.bvalue, self.endOfOperation)


context MethodCall
	inv waitForCallEndBeforeNext:
		( (self.methodToCall.operations->size() > 0) and (self.executedBy <> null) and (self.executedBy.operations->size() > self.executedBy.operations->indexOf(self))) implies
		(Relation Precedes(self.methodToCall.endOf, 
			self.executedBy.operations->at(self.executedBy.operations->indexOf(self)+1).execute)
		)
		
context Plus
	inv subpartsBeforeSumRight:
		Relation Precedes(self.rightPlus.execute, self.execute)
	inv subpartsBeforeSumLeft:
		Relation Precedes(self.leftPlus.execute, self.rightPlus.execute)
		
	inv subpartsEndBeforeSum:
		Relation Precedes(self.leftPlus.endOfOperation, self.rightPlus.execute)
		
	inv sibPartBeforeEndSumRigth:
		Relation Precedes(self.rightPlus.endOfOperation, self.execute)
	
context Print
	inv printToPrintBeforeSelf:
		(self.toPrint.oclIsKindOf(Operation)) implies
		(Relation Precedes(self.execute, self.toPrint.oclAsType(Operation).execute))
	
	inv printPrintAfterOperationExecuted:
		(self.toPrint.oclIsKindOf(Operation)) implies
		(Relation Precedes(self.toPrint.oclAsType(Operation).execute, self.print))
	
	
context Program
	inv initBeforeAll:
		Relation Precedes(self.start, self.startMethod.callIt)
		
	inv initOnlyOnce:
		let oneStartOnly : Event = Expression OneTickAndNoMore(self.start) 
		in Relation Coincides(self.start, oneStartOnly)

endpackage