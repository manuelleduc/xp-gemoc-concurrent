import 'platform:/resource/fr.mleduc.gseq.model/model/gseq.ecore'
import _'http://www.eclipse.org/emf/2002/Ecore'

ECLimport "platform:/plugin/fr.inria.aoste.timesquare.ccslkernel.model/ccsllibrary/kernel.ccslLib"
ECLimport "platform:/plugin/fr.inria.aoste.timesquare.ccslkernel.model/ccsllibrary/CCSL.ccslLib"
ECLimport "platform:/resource/fr.mleduc.gseq.mocc/mocc/GSeq.ccslLib"


package gseq

context Program
	def : start : Event = self.init()
	
context Method
	def : callIt : Event = self.call()
	def : endOf : Event = self
	
context Operation
	def : execute : Event = self.execute()

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
		Relation Precedes(self.operations->last().execute, self.endOf)
	inv endOfAfterAllEndOf:
		Relation Precedes(self.operations->select(e | (e).oclIsKindOf(MethodCall))->last().oclAsType(MethodCall).methodToCall.endOf, self.endOf)	
		
context MethodCall
	inv waitForCallEndBeforeNext:
		( (self.methodToCall.operations->size() > 0) and (self.executedBy.operations->size() > self.executedBy.operations->indexOf(self))) implies
		(Relation Precedes(self.methodToCall.endOf, 
			self.executedBy.operations->at(self.executedBy.operations->indexOf(self)+1).execute)
		)
		
	
	
context Program
	inv initBeforeAll:
		Relation Precedes(self.start, self.startMethod.callIt)
		
	inv initOnlyOnce:
		let oneStartOnly : Event = Expression OneTickAndNoMore(self.start) 
		in Relation Coincides(self.start, oneStartOnly)

endpackage