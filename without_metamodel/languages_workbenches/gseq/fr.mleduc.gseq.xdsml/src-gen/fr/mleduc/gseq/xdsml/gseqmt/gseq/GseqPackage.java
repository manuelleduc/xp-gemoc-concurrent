/**
 */
package fr.mleduc.gseq.xdsml.gseqmt.gseq;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see fr.mleduc.gseq.xdsml.gseqmt.gseq.GseqFactory
 * @model kind="package"
 * @generated
 */
public interface GseqPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "gseq";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://gseqmt/";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "gseq";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	GseqPackage eINSTANCE = fr.mleduc.gseq.xdsml.gseqmt.gseq.impl.GseqPackageImpl.init();

	/**
	 * The meta object id for the '{@link fr.mleduc.gseq.xdsml.gseqmt.gseq.impl.ProgramImpl <em>Program</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.mleduc.gseq.xdsml.gseqmt.gseq.impl.ProgramImpl
	 * @see fr.mleduc.gseq.xdsml.gseqmt.gseq.impl.GseqPackageImpl#getProgram()
	 * @generated
	 */
	int PROGRAM = 0;

	/**
	 * The feature id for the '<em><b>Methods</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM__METHODS = 0;

	/**
	 * The feature id for the '<em><b>Start Method</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM__START_METHOD = 1;

	/**
	 * The number of structural features of the '<em>Program</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link fr.mleduc.gseq.xdsml.gseqmt.gseq.impl.MethodImpl <em>Method</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.mleduc.gseq.xdsml.gseqmt.gseq.impl.MethodImpl
	 * @see fr.mleduc.gseq.xdsml.gseqmt.gseq.impl.GseqPackageImpl#getMethod()
	 * @generated
	 */
	int METHOD = 1;

	/**
	 * The feature id for the '<em><b>Operations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__OPERATIONS = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__NAME = 1;

	/**
	 * The feature id for the '<em><b>In Program</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__IN_PROGRAM = 2;

	/**
	 * The feature id for the '<em><b>Called By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__CALLED_BY = 3;

	/**
	 * The number of structural features of the '<em>Method</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link fr.mleduc.gseq.xdsml.gseqmt.gseq.impl.OperationImpl <em>Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.mleduc.gseq.xdsml.gseqmt.gseq.impl.OperationImpl
	 * @see fr.mleduc.gseq.xdsml.gseqmt.gseq.impl.GseqPackageImpl#getOperation()
	 * @generated
	 */
	int OPERATION = 2;

	/**
	 * The feature id for the '<em><b>Executed By</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__EXECUTED_BY = 0;

	/**
	 * The number of structural features of the '<em>Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link fr.mleduc.gseq.xdsml.gseqmt.gseq.impl.PrintImpl <em>Print</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.mleduc.gseq.xdsml.gseqmt.gseq.impl.PrintImpl
	 * @see fr.mleduc.gseq.xdsml.gseqmt.gseq.impl.GseqPackageImpl#getPrint()
	 * @generated
	 */
	int PRINT = 3;

	/**
	 * The feature id for the '<em><b>Executed By</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRINT__EXECUTED_BY = OPERATION__EXECUTED_BY;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRINT__VALUE = OPERATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Print</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRINT_FEATURE_COUNT = OPERATION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link fr.mleduc.gseq.xdsml.gseqmt.gseq.impl.MethodCallImpl <em>Method Call</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.mleduc.gseq.xdsml.gseqmt.gseq.impl.MethodCallImpl
	 * @see fr.mleduc.gseq.xdsml.gseqmt.gseq.impl.GseqPackageImpl#getMethodCall()
	 * @generated
	 */
	int METHOD_CALL = 4;

	/**
	 * The feature id for the '<em><b>Executed By</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_CALL__EXECUTED_BY = OPERATION__EXECUTED_BY;

	/**
	 * The feature id for the '<em><b>Method To Call</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_CALL__METHOD_TO_CALL = OPERATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Method Call</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_CALL_FEATURE_COUNT = OPERATION_FEATURE_COUNT + 1;


	/**
	 * Returns the meta object for class '{@link fr.mleduc.gseq.xdsml.gseqmt.gseq.Program <em>Program</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Program</em>'.
	 * @see fr.mleduc.gseq.xdsml.gseqmt.gseq.Program
	 * @generated
	 */
	EClass getProgram();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.mleduc.gseq.xdsml.gseqmt.gseq.Program#getMethods <em>Methods</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Methods</em>'.
	 * @see fr.mleduc.gseq.xdsml.gseqmt.gseq.Program#getMethods()
	 * @see #getProgram()
	 * @generated
	 */
	EReference getProgram_Methods();

	/**
	 * Returns the meta object for the reference '{@link fr.mleduc.gseq.xdsml.gseqmt.gseq.Program#getStartMethod <em>Start Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Start Method</em>'.
	 * @see fr.mleduc.gseq.xdsml.gseqmt.gseq.Program#getStartMethod()
	 * @see #getProgram()
	 * @generated
	 */
	EReference getProgram_StartMethod();

	/**
	 * Returns the meta object for class '{@link fr.mleduc.gseq.xdsml.gseqmt.gseq.Method <em>Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Method</em>'.
	 * @see fr.mleduc.gseq.xdsml.gseqmt.gseq.Method
	 * @generated
	 */
	EClass getMethod();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.mleduc.gseq.xdsml.gseqmt.gseq.Method#getOperations <em>Operations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Operations</em>'.
	 * @see fr.mleduc.gseq.xdsml.gseqmt.gseq.Method#getOperations()
	 * @see #getMethod()
	 * @generated
	 */
	EReference getMethod_Operations();

	/**
	 * Returns the meta object for the attribute '{@link fr.mleduc.gseq.xdsml.gseqmt.gseq.Method#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see fr.mleduc.gseq.xdsml.gseqmt.gseq.Method#getName()
	 * @see #getMethod()
	 * @generated
	 */
	EAttribute getMethod_Name();

	/**
	 * Returns the meta object for the container reference '{@link fr.mleduc.gseq.xdsml.gseqmt.gseq.Method#getInProgram <em>In Program</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>In Program</em>'.
	 * @see fr.mleduc.gseq.xdsml.gseqmt.gseq.Method#getInProgram()
	 * @see #getMethod()
	 * @generated
	 */
	EReference getMethod_InProgram();

	/**
	 * Returns the meta object for the reference list '{@link fr.mleduc.gseq.xdsml.gseqmt.gseq.Method#getCalledBy <em>Called By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Called By</em>'.
	 * @see fr.mleduc.gseq.xdsml.gseqmt.gseq.Method#getCalledBy()
	 * @see #getMethod()
	 * @generated
	 */
	EReference getMethod_CalledBy();

	/**
	 * Returns the meta object for class '{@link fr.mleduc.gseq.xdsml.gseqmt.gseq.Operation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operation</em>'.
	 * @see fr.mleduc.gseq.xdsml.gseqmt.gseq.Operation
	 * @generated
	 */
	EClass getOperation();

	/**
	 * Returns the meta object for the container reference '{@link fr.mleduc.gseq.xdsml.gseqmt.gseq.Operation#getExecutedBy <em>Executed By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Executed By</em>'.
	 * @see fr.mleduc.gseq.xdsml.gseqmt.gseq.Operation#getExecutedBy()
	 * @see #getOperation()
	 * @generated
	 */
	EReference getOperation_ExecutedBy();

	/**
	 * Returns the meta object for class '{@link fr.mleduc.gseq.xdsml.gseqmt.gseq.Print <em>Print</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Print</em>'.
	 * @see fr.mleduc.gseq.xdsml.gseqmt.gseq.Print
	 * @generated
	 */
	EClass getPrint();

	/**
	 * Returns the meta object for the attribute '{@link fr.mleduc.gseq.xdsml.gseqmt.gseq.Print#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see fr.mleduc.gseq.xdsml.gseqmt.gseq.Print#getValue()
	 * @see #getPrint()
	 * @generated
	 */
	EAttribute getPrint_Value();

	/**
	 * Returns the meta object for class '{@link fr.mleduc.gseq.xdsml.gseqmt.gseq.MethodCall <em>Method Call</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Method Call</em>'.
	 * @see fr.mleduc.gseq.xdsml.gseqmt.gseq.MethodCall
	 * @generated
	 */
	EClass getMethodCall();

	/**
	 * Returns the meta object for the reference '{@link fr.mleduc.gseq.xdsml.gseqmt.gseq.MethodCall#getMethodToCall <em>Method To Call</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Method To Call</em>'.
	 * @see fr.mleduc.gseq.xdsml.gseqmt.gseq.MethodCall#getMethodToCall()
	 * @see #getMethodCall()
	 * @generated
	 */
	EReference getMethodCall_MethodToCall();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	GseqFactory getGseqFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link fr.mleduc.gseq.xdsml.gseqmt.gseq.impl.ProgramImpl <em>Program</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.mleduc.gseq.xdsml.gseqmt.gseq.impl.ProgramImpl
		 * @see fr.mleduc.gseq.xdsml.gseqmt.gseq.impl.GseqPackageImpl#getProgram()
		 * @generated
		 */
		EClass PROGRAM = eINSTANCE.getProgram();

		/**
		 * The meta object literal for the '<em><b>Methods</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROGRAM__METHODS = eINSTANCE.getProgram_Methods();

		/**
		 * The meta object literal for the '<em><b>Start Method</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROGRAM__START_METHOD = eINSTANCE.getProgram_StartMethod();

		/**
		 * The meta object literal for the '{@link fr.mleduc.gseq.xdsml.gseqmt.gseq.impl.MethodImpl <em>Method</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.mleduc.gseq.xdsml.gseqmt.gseq.impl.MethodImpl
		 * @see fr.mleduc.gseq.xdsml.gseqmt.gseq.impl.GseqPackageImpl#getMethod()
		 * @generated
		 */
		EClass METHOD = eINSTANCE.getMethod();

		/**
		 * The meta object literal for the '<em><b>Operations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METHOD__OPERATIONS = eINSTANCE.getMethod_Operations();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METHOD__NAME = eINSTANCE.getMethod_Name();

		/**
		 * The meta object literal for the '<em><b>In Program</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METHOD__IN_PROGRAM = eINSTANCE.getMethod_InProgram();

		/**
		 * The meta object literal for the '<em><b>Called By</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METHOD__CALLED_BY = eINSTANCE.getMethod_CalledBy();

		/**
		 * The meta object literal for the '{@link fr.mleduc.gseq.xdsml.gseqmt.gseq.impl.OperationImpl <em>Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.mleduc.gseq.xdsml.gseqmt.gseq.impl.OperationImpl
		 * @see fr.mleduc.gseq.xdsml.gseqmt.gseq.impl.GseqPackageImpl#getOperation()
		 * @generated
		 */
		EClass OPERATION = eINSTANCE.getOperation();

		/**
		 * The meta object literal for the '<em><b>Executed By</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION__EXECUTED_BY = eINSTANCE.getOperation_ExecutedBy();

		/**
		 * The meta object literal for the '{@link fr.mleduc.gseq.xdsml.gseqmt.gseq.impl.PrintImpl <em>Print</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.mleduc.gseq.xdsml.gseqmt.gseq.impl.PrintImpl
		 * @see fr.mleduc.gseq.xdsml.gseqmt.gseq.impl.GseqPackageImpl#getPrint()
		 * @generated
		 */
		EClass PRINT = eINSTANCE.getPrint();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRINT__VALUE = eINSTANCE.getPrint_Value();

		/**
		 * The meta object literal for the '{@link fr.mleduc.gseq.xdsml.gseqmt.gseq.impl.MethodCallImpl <em>Method Call</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.mleduc.gseq.xdsml.gseqmt.gseq.impl.MethodCallImpl
		 * @see fr.mleduc.gseq.xdsml.gseqmt.gseq.impl.GseqPackageImpl#getMethodCall()
		 * @generated
		 */
		EClass METHOD_CALL = eINSTANCE.getMethodCall();

		/**
		 * The meta object literal for the '<em><b>Method To Call</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METHOD_CALL__METHOD_TO_CALL = eINSTANCE.getMethodCall_MethodToCall();

	}

} //GseqPackage
