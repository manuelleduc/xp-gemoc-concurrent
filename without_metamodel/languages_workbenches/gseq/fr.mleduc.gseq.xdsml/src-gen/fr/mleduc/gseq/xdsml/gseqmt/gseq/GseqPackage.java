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
	 * The feature id for the '<em><b>To Print</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRINT__TO_PRINT = OPERATION_FEATURE_COUNT + 0;

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
	 * The meta object id for the '{@link fr.mleduc.gseq.xdsml.gseqmt.gseq.impl.BooleanExpressionImpl <em>Boolean Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.mleduc.gseq.xdsml.gseqmt.gseq.impl.BooleanExpressionImpl
	 * @see fr.mleduc.gseq.xdsml.gseqmt.gseq.impl.GseqPackageImpl#getBooleanExpression()
	 * @generated
	 */
	int BOOLEAN_EXPRESSION = 5;

	/**
	 * The feature id for the '<em><b>Executed By</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_EXPRESSION__EXECUTED_BY = OPERATION__EXECUTED_BY;

	/**
	 * The number of structural features of the '<em>Boolean Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_EXPRESSION_FEATURE_COUNT = OPERATION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.mleduc.gseq.xdsml.gseqmt.gseq.impl.IfImpl <em>If</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.mleduc.gseq.xdsml.gseqmt.gseq.impl.IfImpl
	 * @see fr.mleduc.gseq.xdsml.gseqmt.gseq.impl.GseqPackageImpl#getIf()
	 * @generated
	 */
	int IF = 6;

	/**
	 * The feature id for the '<em><b>Executed By</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF__EXECUTED_BY = OPERATION__EXECUTED_BY;

	/**
	 * The feature id for the '<em><b>If Condition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF__IF_CONDITION = OPERATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Then Branch</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF__THEN_BRANCH = OPERATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Else Branch</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF__ELSE_BRANCH = OPERATION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>If</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_FEATURE_COUNT = OPERATION_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link fr.mleduc.gseq.xdsml.gseqmt.gseq.impl.TrueImpl <em>True</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.mleduc.gseq.xdsml.gseqmt.gseq.impl.TrueImpl
	 * @see fr.mleduc.gseq.xdsml.gseqmt.gseq.impl.GseqPackageImpl#getTrue()
	 * @generated
	 */
	int TRUE = 7;

	/**
	 * The feature id for the '<em><b>Executed By</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRUE__EXECUTED_BY = BOOLEAN_EXPRESSION__EXECUTED_BY;

	/**
	 * The number of structural features of the '<em>True</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRUE_FEATURE_COUNT = BOOLEAN_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.mleduc.gseq.xdsml.gseqmt.gseq.impl.FalseImpl <em>False</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.mleduc.gseq.xdsml.gseqmt.gseq.impl.FalseImpl
	 * @see fr.mleduc.gseq.xdsml.gseqmt.gseq.impl.GseqPackageImpl#getFalse()
	 * @generated
	 */
	int FALSE = 8;

	/**
	 * The feature id for the '<em><b>Executed By</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FALSE__EXECUTED_BY = BOOLEAN_EXPRESSION__EXECUTED_BY;

	/**
	 * The number of structural features of the '<em>False</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FALSE_FEATURE_COUNT = BOOLEAN_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.mleduc.gseq.xdsml.gseqmt.gseq.impl.EqualityImpl <em>Equality</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.mleduc.gseq.xdsml.gseqmt.gseq.impl.EqualityImpl
	 * @see fr.mleduc.gseq.xdsml.gseqmt.gseq.impl.GseqPackageImpl#getEquality()
	 * @generated
	 */
	int EQUALITY = 9;

	/**
	 * The feature id for the '<em><b>Executed By</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUALITY__EXECUTED_BY = BOOLEAN_EXPRESSION__EXECUTED_BY;

	/**
	 * The feature id for the '<em><b>Left Equality</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUALITY__LEFT_EQUALITY = BOOLEAN_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Right Equality</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUALITY__RIGHT_EQUALITY = BOOLEAN_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Equality</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUALITY_FEATURE_COUNT = BOOLEAN_EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link fr.mleduc.gseq.xdsml.gseqmt.gseq.impl.NotImpl <em>Not</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.mleduc.gseq.xdsml.gseqmt.gseq.impl.NotImpl
	 * @see fr.mleduc.gseq.xdsml.gseqmt.gseq.impl.GseqPackageImpl#getNot()
	 * @generated
	 */
	int NOT = 10;

	/**
	 * The feature id for the '<em><b>Executed By</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT__EXECUTED_BY = BOOLEAN_EXPRESSION__EXECUTED_BY;

	/**
	 * The feature id for the '<em><b>Not Expression</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT__NOT_EXPRESSION = BOOLEAN_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Not</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_FEATURE_COUNT = BOOLEAN_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link fr.mleduc.gseq.xdsml.gseqmt.gseq.impl.AndImpl <em>And</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.mleduc.gseq.xdsml.gseqmt.gseq.impl.AndImpl
	 * @see fr.mleduc.gseq.xdsml.gseqmt.gseq.impl.GseqPackageImpl#getAnd()
	 * @generated
	 */
	int AND = 11;

	/**
	 * The feature id for the '<em><b>Executed By</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND__EXECUTED_BY = BOOLEAN_EXPRESSION__EXECUTED_BY;

	/**
	 * The feature id for the '<em><b>Left And</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND__LEFT_AND = BOOLEAN_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Right And</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND__RIGHT_AND = BOOLEAN_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>And</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_FEATURE_COUNT = BOOLEAN_EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link fr.mleduc.gseq.xdsml.gseqmt.gseq.impl.IntegerExpressionImpl <em>Integer Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.mleduc.gseq.xdsml.gseqmt.gseq.impl.IntegerExpressionImpl
	 * @see fr.mleduc.gseq.xdsml.gseqmt.gseq.impl.GseqPackageImpl#getIntegerExpression()
	 * @generated
	 */
	int INTEGER_EXPRESSION = 12;

	/**
	 * The feature id for the '<em><b>Executed By</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_EXPRESSION__EXECUTED_BY = OPERATION__EXECUTED_BY;

	/**
	 * The number of structural features of the '<em>Integer Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_EXPRESSION_FEATURE_COUNT = OPERATION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.mleduc.gseq.xdsml.gseqmt.gseq.impl.ConstImpl <em>Const</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.mleduc.gseq.xdsml.gseqmt.gseq.impl.ConstImpl
	 * @see fr.mleduc.gseq.xdsml.gseqmt.gseq.impl.GseqPackageImpl#getConst()
	 * @generated
	 */
	int CONST = 13;

	/**
	 * The feature id for the '<em><b>Executed By</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONST__EXECUTED_BY = INTEGER_EXPRESSION__EXECUTED_BY;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONST__VALUE = INTEGER_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Const</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONST_FEATURE_COUNT = INTEGER_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link fr.mleduc.gseq.xdsml.gseqmt.gseq.impl.VarImpl <em>Var</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.mleduc.gseq.xdsml.gseqmt.gseq.impl.VarImpl
	 * @see fr.mleduc.gseq.xdsml.gseqmt.gseq.impl.GseqPackageImpl#getVar()
	 * @generated
	 */
	int VAR = 14;

	/**
	 * The feature id for the '<em><b>Executed By</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR__EXECUTED_BY = INTEGER_EXPRESSION__EXECUTED_BY;

	/**
	 * The feature id for the '<em><b>Var Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR__VAR_NAME = INTEGER_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Var</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR_FEATURE_COUNT = INTEGER_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link fr.mleduc.gseq.xdsml.gseqmt.gseq.impl.AssignImpl <em>Assign</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.mleduc.gseq.xdsml.gseqmt.gseq.impl.AssignImpl
	 * @see fr.mleduc.gseq.xdsml.gseqmt.gseq.impl.GseqPackageImpl#getAssign()
	 * @generated
	 */
	int ASSIGN = 15;

	/**
	 * The feature id for the '<em><b>Executed By</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGN__EXECUTED_BY = OPERATION__EXECUTED_BY;

	/**
	 * The feature id for the '<em><b>Var Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGN__VAR_NAME = OPERATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Assigned Expression</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGN__ASSIGNED_EXPRESSION = OPERATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Assign</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGN_FEATURE_COUNT = OPERATION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link fr.mleduc.gseq.xdsml.gseqmt.gseq.Printable <em>Printable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.mleduc.gseq.xdsml.gseqmt.gseq.Printable
	 * @see fr.mleduc.gseq.xdsml.gseqmt.gseq.impl.GseqPackageImpl#getPrintable()
	 * @generated
	 */
	int PRINTABLE = 16;

	/**
	 * The number of structural features of the '<em>Printable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRINTABLE_FEATURE_COUNT = 0;


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
	 * Returns the meta object for the reference '{@link fr.mleduc.gseq.xdsml.gseqmt.gseq.Print#getToPrint <em>To Print</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To Print</em>'.
	 * @see fr.mleduc.gseq.xdsml.gseqmt.gseq.Print#getToPrint()
	 * @see #getPrint()
	 * @generated
	 */
	EReference getPrint_ToPrint();

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
	 * Returns the meta object for class '{@link fr.mleduc.gseq.xdsml.gseqmt.gseq.BooleanExpression <em>Boolean Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boolean Expression</em>'.
	 * @see fr.mleduc.gseq.xdsml.gseqmt.gseq.BooleanExpression
	 * @generated
	 */
	EClass getBooleanExpression();

	/**
	 * Returns the meta object for class '{@link fr.mleduc.gseq.xdsml.gseqmt.gseq.If <em>If</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>If</em>'.
	 * @see fr.mleduc.gseq.xdsml.gseqmt.gseq.If
	 * @generated
	 */
	EClass getIf();

	/**
	 * Returns the meta object for the reference '{@link fr.mleduc.gseq.xdsml.gseqmt.gseq.If#getIfCondition <em>If Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>If Condition</em>'.
	 * @see fr.mleduc.gseq.xdsml.gseqmt.gseq.If#getIfCondition()
	 * @see #getIf()
	 * @generated
	 */
	EReference getIf_IfCondition();

	/**
	 * Returns the meta object for the reference '{@link fr.mleduc.gseq.xdsml.gseqmt.gseq.If#getThenBranch <em>Then Branch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Then Branch</em>'.
	 * @see fr.mleduc.gseq.xdsml.gseqmt.gseq.If#getThenBranch()
	 * @see #getIf()
	 * @generated
	 */
	EReference getIf_ThenBranch();

	/**
	 * Returns the meta object for the reference '{@link fr.mleduc.gseq.xdsml.gseqmt.gseq.If#getElseBranch <em>Else Branch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Else Branch</em>'.
	 * @see fr.mleduc.gseq.xdsml.gseqmt.gseq.If#getElseBranch()
	 * @see #getIf()
	 * @generated
	 */
	EReference getIf_ElseBranch();

	/**
	 * Returns the meta object for class '{@link fr.mleduc.gseq.xdsml.gseqmt.gseq.True <em>True</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>True</em>'.
	 * @see fr.mleduc.gseq.xdsml.gseqmt.gseq.True
	 * @generated
	 */
	EClass getTrue();

	/**
	 * Returns the meta object for class '{@link fr.mleduc.gseq.xdsml.gseqmt.gseq.False <em>False</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>False</em>'.
	 * @see fr.mleduc.gseq.xdsml.gseqmt.gseq.False
	 * @generated
	 */
	EClass getFalse();

	/**
	 * Returns the meta object for class '{@link fr.mleduc.gseq.xdsml.gseqmt.gseq.Equality <em>Equality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Equality</em>'.
	 * @see fr.mleduc.gseq.xdsml.gseqmt.gseq.Equality
	 * @generated
	 */
	EClass getEquality();

	/**
	 * Returns the meta object for the reference '{@link fr.mleduc.gseq.xdsml.gseqmt.gseq.Equality#getLeftEquality <em>Left Equality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Left Equality</em>'.
	 * @see fr.mleduc.gseq.xdsml.gseqmt.gseq.Equality#getLeftEquality()
	 * @see #getEquality()
	 * @generated
	 */
	EReference getEquality_LeftEquality();

	/**
	 * Returns the meta object for the reference '{@link fr.mleduc.gseq.xdsml.gseqmt.gseq.Equality#getRightEquality <em>Right Equality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Right Equality</em>'.
	 * @see fr.mleduc.gseq.xdsml.gseqmt.gseq.Equality#getRightEquality()
	 * @see #getEquality()
	 * @generated
	 */
	EReference getEquality_RightEquality();

	/**
	 * Returns the meta object for class '{@link fr.mleduc.gseq.xdsml.gseqmt.gseq.Not <em>Not</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Not</em>'.
	 * @see fr.mleduc.gseq.xdsml.gseqmt.gseq.Not
	 * @generated
	 */
	EClass getNot();

	/**
	 * Returns the meta object for the reference '{@link fr.mleduc.gseq.xdsml.gseqmt.gseq.Not#getNotExpression <em>Not Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Not Expression</em>'.
	 * @see fr.mleduc.gseq.xdsml.gseqmt.gseq.Not#getNotExpression()
	 * @see #getNot()
	 * @generated
	 */
	EReference getNot_NotExpression();

	/**
	 * Returns the meta object for class '{@link fr.mleduc.gseq.xdsml.gseqmt.gseq.And <em>And</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>And</em>'.
	 * @see fr.mleduc.gseq.xdsml.gseqmt.gseq.And
	 * @generated
	 */
	EClass getAnd();

	/**
	 * Returns the meta object for the reference '{@link fr.mleduc.gseq.xdsml.gseqmt.gseq.And#getLeftAnd <em>Left And</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Left And</em>'.
	 * @see fr.mleduc.gseq.xdsml.gseqmt.gseq.And#getLeftAnd()
	 * @see #getAnd()
	 * @generated
	 */
	EReference getAnd_LeftAnd();

	/**
	 * Returns the meta object for the reference '{@link fr.mleduc.gseq.xdsml.gseqmt.gseq.And#getRightAnd <em>Right And</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Right And</em>'.
	 * @see fr.mleduc.gseq.xdsml.gseqmt.gseq.And#getRightAnd()
	 * @see #getAnd()
	 * @generated
	 */
	EReference getAnd_RightAnd();

	/**
	 * Returns the meta object for class '{@link fr.mleduc.gseq.xdsml.gseqmt.gseq.IntegerExpression <em>Integer Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Integer Expression</em>'.
	 * @see fr.mleduc.gseq.xdsml.gseqmt.gseq.IntegerExpression
	 * @generated
	 */
	EClass getIntegerExpression();

	/**
	 * Returns the meta object for class '{@link fr.mleduc.gseq.xdsml.gseqmt.gseq.Const <em>Const</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Const</em>'.
	 * @see fr.mleduc.gseq.xdsml.gseqmt.gseq.Const
	 * @generated
	 */
	EClass getConst();

	/**
	 * Returns the meta object for the attribute '{@link fr.mleduc.gseq.xdsml.gseqmt.gseq.Const#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see fr.mleduc.gseq.xdsml.gseqmt.gseq.Const#getValue()
	 * @see #getConst()
	 * @generated
	 */
	EAttribute getConst_Value();

	/**
	 * Returns the meta object for class '{@link fr.mleduc.gseq.xdsml.gseqmt.gseq.Var <em>Var</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Var</em>'.
	 * @see fr.mleduc.gseq.xdsml.gseqmt.gseq.Var
	 * @generated
	 */
	EClass getVar();

	/**
	 * Returns the meta object for the attribute '{@link fr.mleduc.gseq.xdsml.gseqmt.gseq.Var#getVarName <em>Var Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Var Name</em>'.
	 * @see fr.mleduc.gseq.xdsml.gseqmt.gseq.Var#getVarName()
	 * @see #getVar()
	 * @generated
	 */
	EAttribute getVar_VarName();

	/**
	 * Returns the meta object for class '{@link fr.mleduc.gseq.xdsml.gseqmt.gseq.Assign <em>Assign</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Assign</em>'.
	 * @see fr.mleduc.gseq.xdsml.gseqmt.gseq.Assign
	 * @generated
	 */
	EClass getAssign();

	/**
	 * Returns the meta object for the attribute '{@link fr.mleduc.gseq.xdsml.gseqmt.gseq.Assign#getVarName <em>Var Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Var Name</em>'.
	 * @see fr.mleduc.gseq.xdsml.gseqmt.gseq.Assign#getVarName()
	 * @see #getAssign()
	 * @generated
	 */
	EAttribute getAssign_VarName();

	/**
	 * Returns the meta object for the reference '{@link fr.mleduc.gseq.xdsml.gseqmt.gseq.Assign#getAssignedExpression <em>Assigned Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Assigned Expression</em>'.
	 * @see fr.mleduc.gseq.xdsml.gseqmt.gseq.Assign#getAssignedExpression()
	 * @see #getAssign()
	 * @generated
	 */
	EReference getAssign_AssignedExpression();

	/**
	 * Returns the meta object for class '{@link fr.mleduc.gseq.xdsml.gseqmt.gseq.Printable <em>Printable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Printable</em>'.
	 * @see fr.mleduc.gseq.xdsml.gseqmt.gseq.Printable
	 * @generated
	 */
	EClass getPrintable();

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
		 * The meta object literal for the '<em><b>To Print</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRINT__TO_PRINT = eINSTANCE.getPrint_ToPrint();

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

		/**
		 * The meta object literal for the '{@link fr.mleduc.gseq.xdsml.gseqmt.gseq.impl.BooleanExpressionImpl <em>Boolean Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.mleduc.gseq.xdsml.gseqmt.gseq.impl.BooleanExpressionImpl
		 * @see fr.mleduc.gseq.xdsml.gseqmt.gseq.impl.GseqPackageImpl#getBooleanExpression()
		 * @generated
		 */
		EClass BOOLEAN_EXPRESSION = eINSTANCE.getBooleanExpression();

		/**
		 * The meta object literal for the '{@link fr.mleduc.gseq.xdsml.gseqmt.gseq.impl.IfImpl <em>If</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.mleduc.gseq.xdsml.gseqmt.gseq.impl.IfImpl
		 * @see fr.mleduc.gseq.xdsml.gseqmt.gseq.impl.GseqPackageImpl#getIf()
		 * @generated
		 */
		EClass IF = eINSTANCE.getIf();

		/**
		 * The meta object literal for the '<em><b>If Condition</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IF__IF_CONDITION = eINSTANCE.getIf_IfCondition();

		/**
		 * The meta object literal for the '<em><b>Then Branch</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IF__THEN_BRANCH = eINSTANCE.getIf_ThenBranch();

		/**
		 * The meta object literal for the '<em><b>Else Branch</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IF__ELSE_BRANCH = eINSTANCE.getIf_ElseBranch();

		/**
		 * The meta object literal for the '{@link fr.mleduc.gseq.xdsml.gseqmt.gseq.impl.TrueImpl <em>True</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.mleduc.gseq.xdsml.gseqmt.gseq.impl.TrueImpl
		 * @see fr.mleduc.gseq.xdsml.gseqmt.gseq.impl.GseqPackageImpl#getTrue()
		 * @generated
		 */
		EClass TRUE = eINSTANCE.getTrue();

		/**
		 * The meta object literal for the '{@link fr.mleduc.gseq.xdsml.gseqmt.gseq.impl.FalseImpl <em>False</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.mleduc.gseq.xdsml.gseqmt.gseq.impl.FalseImpl
		 * @see fr.mleduc.gseq.xdsml.gseqmt.gseq.impl.GseqPackageImpl#getFalse()
		 * @generated
		 */
		EClass FALSE = eINSTANCE.getFalse();

		/**
		 * The meta object literal for the '{@link fr.mleduc.gseq.xdsml.gseqmt.gseq.impl.EqualityImpl <em>Equality</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.mleduc.gseq.xdsml.gseqmt.gseq.impl.EqualityImpl
		 * @see fr.mleduc.gseq.xdsml.gseqmt.gseq.impl.GseqPackageImpl#getEquality()
		 * @generated
		 */
		EClass EQUALITY = eINSTANCE.getEquality();

		/**
		 * The meta object literal for the '<em><b>Left Equality</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EQUALITY__LEFT_EQUALITY = eINSTANCE.getEquality_LeftEquality();

		/**
		 * The meta object literal for the '<em><b>Right Equality</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EQUALITY__RIGHT_EQUALITY = eINSTANCE.getEquality_RightEquality();

		/**
		 * The meta object literal for the '{@link fr.mleduc.gseq.xdsml.gseqmt.gseq.impl.NotImpl <em>Not</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.mleduc.gseq.xdsml.gseqmt.gseq.impl.NotImpl
		 * @see fr.mleduc.gseq.xdsml.gseqmt.gseq.impl.GseqPackageImpl#getNot()
		 * @generated
		 */
		EClass NOT = eINSTANCE.getNot();

		/**
		 * The meta object literal for the '<em><b>Not Expression</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NOT__NOT_EXPRESSION = eINSTANCE.getNot_NotExpression();

		/**
		 * The meta object literal for the '{@link fr.mleduc.gseq.xdsml.gseqmt.gseq.impl.AndImpl <em>And</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.mleduc.gseq.xdsml.gseqmt.gseq.impl.AndImpl
		 * @see fr.mleduc.gseq.xdsml.gseqmt.gseq.impl.GseqPackageImpl#getAnd()
		 * @generated
		 */
		EClass AND = eINSTANCE.getAnd();

		/**
		 * The meta object literal for the '<em><b>Left And</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AND__LEFT_AND = eINSTANCE.getAnd_LeftAnd();

		/**
		 * The meta object literal for the '<em><b>Right And</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AND__RIGHT_AND = eINSTANCE.getAnd_RightAnd();

		/**
		 * The meta object literal for the '{@link fr.mleduc.gseq.xdsml.gseqmt.gseq.impl.IntegerExpressionImpl <em>Integer Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.mleduc.gseq.xdsml.gseqmt.gseq.impl.IntegerExpressionImpl
		 * @see fr.mleduc.gseq.xdsml.gseqmt.gseq.impl.GseqPackageImpl#getIntegerExpression()
		 * @generated
		 */
		EClass INTEGER_EXPRESSION = eINSTANCE.getIntegerExpression();

		/**
		 * The meta object literal for the '{@link fr.mleduc.gseq.xdsml.gseqmt.gseq.impl.ConstImpl <em>Const</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.mleduc.gseq.xdsml.gseqmt.gseq.impl.ConstImpl
		 * @see fr.mleduc.gseq.xdsml.gseqmt.gseq.impl.GseqPackageImpl#getConst()
		 * @generated
		 */
		EClass CONST = eINSTANCE.getConst();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONST__VALUE = eINSTANCE.getConst_Value();

		/**
		 * The meta object literal for the '{@link fr.mleduc.gseq.xdsml.gseqmt.gseq.impl.VarImpl <em>Var</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.mleduc.gseq.xdsml.gseqmt.gseq.impl.VarImpl
		 * @see fr.mleduc.gseq.xdsml.gseqmt.gseq.impl.GseqPackageImpl#getVar()
		 * @generated
		 */
		EClass VAR = eINSTANCE.getVar();

		/**
		 * The meta object literal for the '<em><b>Var Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VAR__VAR_NAME = eINSTANCE.getVar_VarName();

		/**
		 * The meta object literal for the '{@link fr.mleduc.gseq.xdsml.gseqmt.gseq.impl.AssignImpl <em>Assign</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.mleduc.gseq.xdsml.gseqmt.gseq.impl.AssignImpl
		 * @see fr.mleduc.gseq.xdsml.gseqmt.gseq.impl.GseqPackageImpl#getAssign()
		 * @generated
		 */
		EClass ASSIGN = eINSTANCE.getAssign();

		/**
		 * The meta object literal for the '<em><b>Var Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSIGN__VAR_NAME = eINSTANCE.getAssign_VarName();

		/**
		 * The meta object literal for the '<em><b>Assigned Expression</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSIGN__ASSIGNED_EXPRESSION = eINSTANCE.getAssign_AssignedExpression();

		/**
		 * The meta object literal for the '{@link fr.mleduc.gseq.xdsml.gseqmt.gseq.Printable <em>Printable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.mleduc.gseq.xdsml.gseqmt.gseq.Printable
		 * @see fr.mleduc.gseq.xdsml.gseqmt.gseq.impl.GseqPackageImpl#getPrintable()
		 * @generated
		 */
		EClass PRINTABLE = eINSTANCE.getPrintable();

	}

} //GseqPackage
