package gseq.aspects

import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import gseq.Program
import gseq.Method
import gseq.Operation
import gseq.Print
import gseq.MethodCall
import gseq.True
import gseq.False
import gseq.BooleanExpression

import static extension gseq.aspects.ProgramAspect.*
import static extension gseq.aspects.MethodAspect.*
import static extension gseq.aspects.OperationAspect.*
import static extension gseq.aspects.PrintAspect.*
import static extension gseq.aspects.MethodCallAspect.*
import static extension gseq.aspects.BooleanExpressionAspect.*
import static extension gseq.aspects.TrueAspect.*
import gseq.Equality

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
		println("printed : " + _self.toPrint.pretty())
	}
}

@Aspect(className=MethodCall)
class MethodCallAspect extends OperationAspect {
	def void execute() {
		println("I wanna call " + _self.methodToCall.name)
	}
}

@Aspect(className=BooleanExpression)
class BooleanExpressionAspect extends OperationAspect {
}

@Aspect(className=True)
class TrueAspect extends BooleanExpressionAspect {
	def String pretty() {
		"true"
	}
	
	def boolean bvalue() { true }
}

@Aspect(className=False)
class FalseAspect extends BooleanExpressionAspect {
	def String pretty() {
		"false"
	}
	
	def boolean bvalue() { false }
}


@Aspect(className=Equality)
class EqualityAspect extends BooleanExpressionAspect {
	def boolean bvalue() { 
		_self.leftEquality.ivalue() == _self.rightEquality.ivalue()
	}
}