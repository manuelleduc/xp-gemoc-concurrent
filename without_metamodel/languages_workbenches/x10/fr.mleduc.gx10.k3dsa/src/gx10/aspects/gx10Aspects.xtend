package gx10.aspects

import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import fr.inria.diverse.k3.al.annotationprocessor.ReplaceAspectMethod
import gx10.Program
import gx10.Method
import gx10.Block
import gx10.Statement
import gx10.ControlStructure
import gx10.IntExpression
import gx10.BoolExpression
import gx10.If
import gx10.While
import gx10.True
import gx10.False
import gx10.Not
import gx10.And
import gx10.IntConst
import gx10.Plus
import gx10.Async
import gx10.MethodCall
import gx10.Expression
import gx10.Finish
import gx10.Print
import gx10.BoolVar
import gx10.IntVar
import gx10.IntVarAccess
import gx10.BoolVarAccess

import static extension gx10.aspects.ProgramAspect.*
import static extension gx10.aspects.MethodAspect.*
import static extension gx10.aspects.BlockAspect.*
import static extension gx10.aspects.StatementAspect.*
import static extension gx10.aspects.ControlStructureAspect.*
import static extension gx10.aspects.IntExpressionAspect.*
import static extension gx10.aspects.BoolExpressionAspect.*
import static extension gx10.aspects.IfAspect.*
import static extension gx10.aspects.WhileAspect.*
import static extension gx10.aspects.TrueAspect.*
import static extension gx10.aspects.FalseAspect.*
import static extension gx10.aspects.NotAspect.*
import static extension gx10.aspects.AndAspect.*
import static extension gx10.aspects.IntConstAspect.*
import static extension gx10.aspects.PlusAspect.*
import static extension gx10.aspects.AsyncAspect.*
import static extension gx10.aspects.MethodCallAspect.*
import static extension gx10.aspects.ExpressionAspect.*
import static extension gx10.aspects.FinishAspect.*
import static extension gx10.aspects.PrintAspect.*
import static extension gx10.aspects.BoolVarAspect.*
import static extension gx10.aspects.IntVarAspect.*
import static extension gx10.aspects.IntVarAccessAspect.*
import static extension gx10.aspects.BoolVarAccessAspect.*
import static extension gx10.aspects.EqualAspect.*
import java.util.Map
import org.eclipse.emf.ecore.EObject
import gx10.Equal

class Context {

	private Map<String, Integer> intContext = newHashMap()
	private Map<String, Boolean> boolContext = newHashMap()

	public def void addInt(String name, int value) {
		intContext.put(name, value)
	}

	public def int getInt(String name) {
		intContext.get(name)
	}
	
	public def void addBool(String name, boolean value) {
		boolContext.put(name, value)
	}

	public def boolean getBool(String name) {
		boolContext.get(name)
	}
}

@Aspect(className=Program)
class ProgramAspect {
}

@Aspect(className=Method)
class MethodAspect {
}

@Aspect(className=Block)
class BlockAspect extends StatementAspect {

	public val Context context = new Context

}

@Aspect(className=Statement)
abstract class StatementAspect {
}

@Aspect(className=ControlStructure)
abstract class ControlStructureAspect extends StatementAspect {
}

@Aspect(className=IntExpression)
abstract class IntExpressionAspect extends ExpressionAspect {
	@ReplaceAspectMethod
	def int getCurrentValue() {
		return 0
	}
}

@Aspect(className=BoolExpression)
abstract class BoolExpressionAspect extends ExpressionAspect {
	@ReplaceAspectMethod
	def boolean getCurrentValue() {
		return false
	}

}

@Aspect(className=If)
class IfAspect extends ControlStructureAspect {
}

@Aspect(className=While)
class WhileAspect extends ControlStructureAspect {
}

@Aspect(className=True)
class TrueAspect extends BoolExpressionAspect {
	def boolean getCurrentValue() {
		true
	}

}

@Aspect(className=False)
class FalseAspect extends BoolExpressionAspect {
	def boolean getCurrentValue() {
		false
	}

}

@Aspect(className=Not)
class NotAspect extends BoolExpressionAspect {
}

@Aspect(className=And)
class AndAspect extends BoolExpressionAspect {
}

@Aspect(className=IntConst)
class IntConstAspect extends IntExpressionAspect {
	def int getCurrentValue() {
		_self.value
	}

}

@Aspect(className=Plus)
class PlusAspect extends IntExpressionAspect {
	
	int currentValuePlus = 0;
	
	def void evaluate() {
		_self.currentValuePlus = _self.leftPlus.currentValue + _self.rightPlus.currentValue
	}
	
	def int getCurrentValue() {
		_self.currentValuePlus
	}
}

@Aspect(className=Async)
class AsyncAspect extends StatementAspect {
}

@Aspect(className=MethodCall)
class MethodCallAspect extends ExpressionAspect {
	def void call() {
		println("Calling " + _self.methodToCall.name)
	}

}

@Aspect(className=Expression)
abstract class ExpressionAspect extends StatementAspect {
}

@Aspect(className=Finish)
class FinishAspect extends StatementAspect {
}

@Aspect(className=Print)
class PrintAspect extends StatementAspect {
	def void print() {

		val toPrintVal = if (_self.toPrint instanceof IntExpression) {
				(_self.toPrint as IntExpression).currentValue

			} else {
				(_self.toPrint as BoolExpression).currentValue

			}

		println(">>>>>>>>>>>>>>>>>>>>>>> " + String.valueOf(toPrintVal))
	}

}

@Aspect(className=BoolVar)
class BoolVarAspect extends ExpressionAspect {
	def void evaluate() {
		_self.inBlock.context.addBool(_self.name, _self.boolVarExpr.currentValue)
	}
}

@Aspect(className=IntVar)
class IntVarAspect extends ExpressionAspect {
	def void evaluate() {
		_self.inBlock.context.addInt(_self.name, _self.intVarExpr.currentValue)
	}
}

@Aspect(className=IntVarAccess)
class IntVarAccessAspect extends IntExpressionAspect {
	def int getCurrentValue() {
		var EObject currentStatement = _self.eContainer
		while(!(currentStatement instanceof Block)) {
			currentStatement = currentStatement.eContainer
		}
	
		(currentStatement as Block).context.getInt(_self.intVarRef.name)
	}

}

@Aspect(className=BoolVarAccess)
class BoolVarAccessAspect extends BoolExpressionAspect {
	def boolean getCurrentValue() {
		var EObject currentStatement = _self.eContainer
		while(!(currentStatement instanceof Block)) {
			currentStatement = currentStatement.eContainer
		}
	
		(currentStatement as Block).context.getBool(_self.boolVarRef.name)
	}
}

@Aspect(className=Equal)
class EqualAspect extends BoolExpressionAspect {
	def void evaluate() {
		
	}

}

