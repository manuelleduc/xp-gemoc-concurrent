/**
 */
package gseq.util;

import gseq.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see gseq.GseqPackage
 * @generated
 */
public class GseqAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static GseqPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GseqAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = GseqPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GseqSwitch<Adapter> modelSwitch =
		new GseqSwitch<Adapter>() {
			@Override
			public Adapter caseProgram(Program object) {
				return createProgramAdapter();
			}
			@Override
			public Adapter caseMethod(Method object) {
				return createMethodAdapter();
			}
			@Override
			public Adapter caseOperation(Operation object) {
				return createOperationAdapter();
			}
			@Override
			public Adapter casePrint(Print object) {
				return createPrintAdapter();
			}
			@Override
			public Adapter caseMethodCall(MethodCall object) {
				return createMethodCallAdapter();
			}
			@Override
			public Adapter caseBooleanExpression(BooleanExpression object) {
				return createBooleanExpressionAdapter();
			}
			@Override
			public Adapter caseIf(If object) {
				return createIfAdapter();
			}
			@Override
			public Adapter caseTrue(True object) {
				return createTrueAdapter();
			}
			@Override
			public Adapter caseFalse(False object) {
				return createFalseAdapter();
			}
			@Override
			public Adapter caseEquality(Equality object) {
				return createEqualityAdapter();
			}
			@Override
			public Adapter caseNot(Not object) {
				return createNotAdapter();
			}
			@Override
			public Adapter caseAnd(And object) {
				return createAndAdapter();
			}
			@Override
			public Adapter caseIntegerExpression(IntegerExpression object) {
				return createIntegerExpressionAdapter();
			}
			@Override
			public Adapter caseConst(Const object) {
				return createConstAdapter();
			}
			@Override
			public Adapter caseVar(Var object) {
				return createVarAdapter();
			}
			@Override
			public Adapter caseAssign(Assign object) {
				return createAssignAdapter();
			}
			@Override
			public Adapter casePlus(Plus object) {
				return createPlusAdapter();
			}
			@Override
			public Adapter caseGreaterThan(GreaterThan object) {
				return createGreaterThanAdapter();
			}
			@Override
			public Adapter caseWhile(While object) {
				return createWhileAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link gseq.Program <em>Program</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gseq.Program
	 * @generated
	 */
	public Adapter createProgramAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gseq.Method <em>Method</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gseq.Method
	 * @generated
	 */
	public Adapter createMethodAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gseq.Operation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gseq.Operation
	 * @generated
	 */
	public Adapter createOperationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gseq.Print <em>Print</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gseq.Print
	 * @generated
	 */
	public Adapter createPrintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gseq.MethodCall <em>Method Call</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gseq.MethodCall
	 * @generated
	 */
	public Adapter createMethodCallAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gseq.BooleanExpression <em>Boolean Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gseq.BooleanExpression
	 * @generated
	 */
	public Adapter createBooleanExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gseq.If <em>If</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gseq.If
	 * @generated
	 */
	public Adapter createIfAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gseq.True <em>True</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gseq.True
	 * @generated
	 */
	public Adapter createTrueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gseq.False <em>False</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gseq.False
	 * @generated
	 */
	public Adapter createFalseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gseq.Equality <em>Equality</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gseq.Equality
	 * @generated
	 */
	public Adapter createEqualityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gseq.Not <em>Not</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gseq.Not
	 * @generated
	 */
	public Adapter createNotAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gseq.And <em>And</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gseq.And
	 * @generated
	 */
	public Adapter createAndAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gseq.IntegerExpression <em>Integer Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gseq.IntegerExpression
	 * @generated
	 */
	public Adapter createIntegerExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gseq.Const <em>Const</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gseq.Const
	 * @generated
	 */
	public Adapter createConstAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gseq.Var <em>Var</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gseq.Var
	 * @generated
	 */
	public Adapter createVarAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gseq.Assign <em>Assign</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gseq.Assign
	 * @generated
	 */
	public Adapter createAssignAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gseq.Plus <em>Plus</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gseq.Plus
	 * @generated
	 */
	public Adapter createPlusAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gseq.GreaterThan <em>Greater Than</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gseq.GreaterThan
	 * @generated
	 */
	public Adapter createGreaterThanAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gseq.While <em>While</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gseq.While
	 * @generated
	 */
	public Adapter createWhileAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //GseqAdapterFactory
