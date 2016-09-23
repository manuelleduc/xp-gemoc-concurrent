package gseq.aspects

import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import gseq.Program
import gseq.Method
import gseq.Operation
import gseq.Print
import gseq.MethodCall

import static extension gseq.aspects.ProgramAspect.*
import static extension gseq.aspects.MethodAspect.*
import static extension gseq.aspects.OperationAspect.*
import static extension gseq.aspects.PrintAspect.*
import static extension gseq.aspects.MethodCallAspect.*

@Aspect(className=Program)
class ProgramAspect {
	def void init() {
		println("program started")
	}
}

@Aspect(className=Method)
class MethodAspect {
	def void call() {
		println("method " + _self.name + " called")
	}
}

@Aspect(className=Operation)
abstract class OperationAspect {

}

@Aspect(className=Print)
class PrintAspect extends OperationAspect {
	def void execute() {
		println("printed : " + _self.value)
	}
}

@Aspect(className=MethodCall)
class MethodCallAspect extends OperationAspect {
	def void execute() {
		println("I wanna call " + _self.methodToCall.name)
	}
}



