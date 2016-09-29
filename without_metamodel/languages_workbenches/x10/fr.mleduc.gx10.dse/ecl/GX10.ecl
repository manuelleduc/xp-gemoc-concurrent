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
	
		
context MethodCall
	def : callPreparation : Event = self.call()
	def : callEvt : Event = self
	
	
	
context Statement
	inv statementStartThenStop:
		Relation Precedes(self.startStatement, self.endStatement) -- WeakAlternates
		
	inv waitForPreviousToFinish:
		(self.inBlock <> null and self.inBlock.blockStatements->indexOf(self) > 1) implies
		(Relation Precedes(self.inBlock.blockStatements->at(self.inBlock.blockStatements->indexOf(self)-1).endStatement, self.startStatement))
		
	 
	
context Method
	inv methodStartThenEnd:
		Relation Precedes(self.startMethodEvt, self.endMethodEvt)  -- WeakAlternates
		
	inv methodBlockStartAtStart:
		Relation Precedes(self.startMethodEvt, self.methodBlock.startStatement) -- Coincides
		
	inv methodStopWhenBlockStop:
		Relation Precedes(self.methodBlock.endStatement, self.endMethodEvt) -- Coincides
		
	inv methodStartOnCall0:
		(self.inProgram.startMethod = self and self.calledBy->size() > 0) implies
		let allEventWhichCall0 : Event = Expression Union(self.calledBy.callEvt) in
		let inps0 : Event = self.inProgram.startMethod.startMethodEvt in
		let allEventsUnion : Event = Expression Union(inps0, allEventWhichCall0) in
		(Relation Coincides(allEventsUnion, self.startMethodEvt))
--		
	inv methodStartOnCall1:
		(self.inProgram.startMethod = self and self.calledBy->size() = 0) implies
		(Relation Coincides(self.inProgram.startMethod.startMethodEvt, self.startMethodEvt))
	
	inv methodStartOnCall2:
		(self.inProgram.startMethod <> self and self.calledBy->size() > 0) implies
		let allEventWhichCall2 : Event = Expression Union(self.calledBy.callEvt) in
		(Relation Coincides(allEventWhichCall2, self.startMethodEvt))
		
context MethodCall

	inv methodStartBeforePrepareCall:
		Relation Precedes(self.startStatement, self.callPreparation)

	inv methodCallStartMethod:
		Relation Precedes(self.callPreparation, self.callEvt)
		
	inv methodCallStopWhenCalledEnd:
		Relation Precedes(self.methodToCall.endMethodEvt, self.endStatement)
		
context Print
	inv printEvaluateBeforePrint0:
		Relation Precedes(self.startStatement, self.toPrint.startStatement)
		
	inv printEvaluateBeforePrint1:
		Relation Precedes(self.toPrint.endStatement, self.print)
		
	inv printFinishAfterPrint:
		Relation Precedes(self.print, self.endStatement)

		
context Block
	inv blockStatementsOrdered:
		Relation Precedes(self.blockStatements.startStatement)
		
	inv firstInstructionStartWhenBlockReady:
		(self.blockStatements->size() > 0) implies
		(Relation Precedes(self.startStatement, self.blockStatements->first().startStatement))
		
	inv blockStatementWaitForAllToFinish:
		(self.blockStatements->size() > 0) implies 
		let blockLastofAllStatements : Event = Expression Sup(self.blockStatements.endStatement) in
		(Relation Precedes(blockLastofAllStatements, self.endStatement))

context Program
	inv initBeforeAll:
		Relation Precedes(self.start, self.startMethod.startMethodEvt)
		
	inv initOnlyOnce:
		let oneStartOnly : Event = Expression OneTickAndNoMore(self.start) 
		in Relation Coincides(self.start, oneStartOnly)

endpackage
