/**
 */
package gx10;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see gx10.Gx10Factory
 * @model kind="package"
 * @generated
 */
public interface Gx10Package extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "gx10";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://mleduc.fr/gx10";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "gx10";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Gx10Package eINSTANCE = gx10.impl.Gx10PackageImpl.init();

	/**
	 * The meta object id for the '{@link gx10.impl.ProgramImpl <em>Program</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gx10.impl.ProgramImpl
	 * @see gx10.impl.Gx10PackageImpl#getProgram()
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
	 * The number of operations of the '<em>Program</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gx10.impl.MethodImpl <em>Method</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gx10.impl.MethodImpl
	 * @see gx10.impl.Gx10PackageImpl#getMethod()
	 * @generated
	 */
	int METHOD = 1;

	/**
	 * The feature id for the '<em><b>In Program</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__IN_PROGRAM = 0;

	/**
	 * The feature id for the '<em><b>Method Block</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__METHOD_BLOCK = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__NAME = 2;

	/**
	 * The feature id for the '<em><b>Called By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__CALLED_BY = 3;

	/**
	 * The feature id for the '<em><b>Method Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__METHOD_PARAMETERS = 4;

	/**
	 * The number of structural features of the '<em>Method</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Method</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gx10.impl.StatementImpl <em>Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gx10.impl.StatementImpl
	 * @see gx10.impl.Gx10PackageImpl#getStatement()
	 * @generated
	 */
	int STATEMENT = 3;

	/**
	 * The feature id for the '<em><b>In Block</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT__IN_BLOCK = 0;

	/**
	 * The number of structural features of the '<em>Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gx10.impl.BlockImpl <em>Block</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gx10.impl.BlockImpl
	 * @see gx10.impl.Gx10PackageImpl#getBlock()
	 * @generated
	 */
	int BLOCK = 2;

	/**
	 * The feature id for the '<em><b>In Block</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK__IN_BLOCK = STATEMENT__IN_BLOCK;

	/**
	 * The feature id for the '<em><b>Block Statements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK__BLOCK_STATEMENTS = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Init Block</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK___INIT_BLOCK = STATEMENT_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_OPERATION_COUNT = STATEMENT_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link gx10.impl.ControlStructureImpl <em>Control Structure</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gx10.impl.ControlStructureImpl
	 * @see gx10.impl.Gx10PackageImpl#getControlStructure()
	 * @generated
	 */
	int CONTROL_STRUCTURE = 4;

	/**
	 * The feature id for the '<em><b>In Block</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_STRUCTURE__IN_BLOCK = STATEMENT__IN_BLOCK;

	/**
	 * The feature id for the '<em><b>Control Structure Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_STRUCTURE__CONTROL_STRUCTURE_CONDITION = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Control Structure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_STRUCTURE_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Control Structure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_STRUCTURE_OPERATION_COUNT = STATEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gx10.impl.ExpressionImpl <em>Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gx10.impl.ExpressionImpl
	 * @see gx10.impl.Gx10PackageImpl#getExpression()
	 * @generated
	 */
	int EXPRESSION = 17;

	/**
	 * The feature id for the '<em><b>In Block</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION__IN_BLOCK = STATEMENT__IN_BLOCK;

	/**
	 * The number of structural features of the '<em>Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_OPERATION_COUNT = STATEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gx10.impl.IntExpressionImpl <em>Int Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gx10.impl.IntExpressionImpl
	 * @see gx10.impl.Gx10PackageImpl#getIntExpression()
	 * @generated
	 */
	int INT_EXPRESSION = 5;

	/**
	 * The feature id for the '<em><b>In Block</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT_EXPRESSION__IN_BLOCK = EXPRESSION__IN_BLOCK;

	/**
	 * The feature id for the '<em><b>In Method Call Parameter</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT_EXPRESSION__IN_METHOD_CALL_PARAMETER = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Int Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Current Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT_EXPRESSION___GET_CURRENT_VALUE = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Int Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT_EXPRESSION_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link gx10.impl.BoolExpressionImpl <em>Bool Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gx10.impl.BoolExpressionImpl
	 * @see gx10.impl.Gx10PackageImpl#getBoolExpression()
	 * @generated
	 */
	int BOOL_EXPRESSION = 6;

	/**
	 * The feature id for the '<em><b>In Block</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOL_EXPRESSION__IN_BLOCK = EXPRESSION__IN_BLOCK;

	/**
	 * The number of structural features of the '<em>Bool Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOL_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Current Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOL_EXPRESSION___GET_CURRENT_VALUE = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Bool Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOL_EXPRESSION_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link gx10.impl.IfImpl <em>If</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gx10.impl.IfImpl
	 * @see gx10.impl.Gx10PackageImpl#getIf()
	 * @generated
	 */
	int IF = 7;

	/**
	 * The feature id for the '<em><b>In Block</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF__IN_BLOCK = CONTROL_STRUCTURE__IN_BLOCK;

	/**
	 * The feature id for the '<em><b>Control Structure Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF__CONTROL_STRUCTURE_CONDITION = CONTROL_STRUCTURE__CONTROL_STRUCTURE_CONDITION;

	/**
	 * The feature id for the '<em><b>Then Block</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF__THEN_BLOCK = CONTROL_STRUCTURE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Else Block</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF__ELSE_BLOCK = CONTROL_STRUCTURE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>If</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_FEATURE_COUNT = CONTROL_STRUCTURE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>If</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_OPERATION_COUNT = CONTROL_STRUCTURE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gx10.impl.WhileImpl <em>While</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gx10.impl.WhileImpl
	 * @see gx10.impl.Gx10PackageImpl#getWhile()
	 * @generated
	 */
	int WHILE = 8;

	/**
	 * The feature id for the '<em><b>In Block</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHILE__IN_BLOCK = CONTROL_STRUCTURE__IN_BLOCK;

	/**
	 * The feature id for the '<em><b>Control Structure Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHILE__CONTROL_STRUCTURE_CONDITION = CONTROL_STRUCTURE__CONTROL_STRUCTURE_CONDITION;

	/**
	 * The feature id for the '<em><b>While Block</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHILE__WHILE_BLOCK = CONTROL_STRUCTURE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>While</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHILE_FEATURE_COUNT = CONTROL_STRUCTURE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>While</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHILE_OPERATION_COUNT = CONTROL_STRUCTURE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gx10.impl.TrueImpl <em>True</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gx10.impl.TrueImpl
	 * @see gx10.impl.Gx10PackageImpl#getTrue()
	 * @generated
	 */
	int TRUE = 9;

	/**
	 * The feature id for the '<em><b>In Block</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRUE__IN_BLOCK = BOOL_EXPRESSION__IN_BLOCK;

	/**
	 * The number of structural features of the '<em>True</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRUE_FEATURE_COUNT = BOOL_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Current Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRUE___GET_CURRENT_VALUE = BOOL_EXPRESSION___GET_CURRENT_VALUE;

	/**
	 * The number of operations of the '<em>True</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRUE_OPERATION_COUNT = BOOL_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gx10.impl.FalseImpl <em>False</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gx10.impl.FalseImpl
	 * @see gx10.impl.Gx10PackageImpl#getFalse()
	 * @generated
	 */
	int FALSE = 10;

	/**
	 * The feature id for the '<em><b>In Block</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FALSE__IN_BLOCK = BOOL_EXPRESSION__IN_BLOCK;

	/**
	 * The number of structural features of the '<em>False</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FALSE_FEATURE_COUNT = BOOL_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Current Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FALSE___GET_CURRENT_VALUE = BOOL_EXPRESSION___GET_CURRENT_VALUE;

	/**
	 * The number of operations of the '<em>False</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FALSE_OPERATION_COUNT = BOOL_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gx10.impl.NotImpl <em>Not</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gx10.impl.NotImpl
	 * @see gx10.impl.Gx10PackageImpl#getNot()
	 * @generated
	 */
	int NOT = 11;

	/**
	 * The feature id for the '<em><b>In Block</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT__IN_BLOCK = BOOL_EXPRESSION__IN_BLOCK;

	/**
	 * The feature id for the '<em><b>Not Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT__NOT_EXPRESSION = BOOL_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Not</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_FEATURE_COUNT = BOOL_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Current Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT___GET_CURRENT_VALUE = BOOL_EXPRESSION___GET_CURRENT_VALUE;

	/**
	 * The number of operations of the '<em>Not</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_OPERATION_COUNT = BOOL_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gx10.impl.AndImpl <em>And</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gx10.impl.AndImpl
	 * @see gx10.impl.Gx10PackageImpl#getAnd()
	 * @generated
	 */
	int AND = 12;

	/**
	 * The feature id for the '<em><b>In Block</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND__IN_BLOCK = BOOL_EXPRESSION__IN_BLOCK;

	/**
	 * The feature id for the '<em><b>Left And Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND__LEFT_AND_EXPRESSION = BOOL_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Right And Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND__RIGHT_AND_EXPRESSION = BOOL_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>And</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_FEATURE_COUNT = BOOL_EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Current Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND___GET_CURRENT_VALUE = BOOL_EXPRESSION___GET_CURRENT_VALUE;

	/**
	 * The number of operations of the '<em>And</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_OPERATION_COUNT = BOOL_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gx10.impl.IntConstImpl <em>Int Const</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gx10.impl.IntConstImpl
	 * @see gx10.impl.Gx10PackageImpl#getIntConst()
	 * @generated
	 */
	int INT_CONST = 13;

	/**
	 * The feature id for the '<em><b>In Block</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT_CONST__IN_BLOCK = INT_EXPRESSION__IN_BLOCK;

	/**
	 * The feature id for the '<em><b>In Method Call Parameter</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT_CONST__IN_METHOD_CALL_PARAMETER = INT_EXPRESSION__IN_METHOD_CALL_PARAMETER;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT_CONST__VALUE = INT_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Int Const</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT_CONST_FEATURE_COUNT = INT_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Current Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT_CONST___GET_CURRENT_VALUE = INT_EXPRESSION___GET_CURRENT_VALUE;

	/**
	 * The number of operations of the '<em>Int Const</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT_CONST_OPERATION_COUNT = INT_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gx10.impl.IntBinaryOperationImpl <em>Int Binary Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gx10.impl.IntBinaryOperationImpl
	 * @see gx10.impl.Gx10PackageImpl#getIntBinaryOperation()
	 * @generated
	 */
	int INT_BINARY_OPERATION = 14;

	/**
	 * The feature id for the '<em><b>In Block</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT_BINARY_OPERATION__IN_BLOCK = INT_EXPRESSION__IN_BLOCK;

	/**
	 * The feature id for the '<em><b>In Method Call Parameter</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT_BINARY_OPERATION__IN_METHOD_CALL_PARAMETER = INT_EXPRESSION__IN_METHOD_CALL_PARAMETER;

	/**
	 * The feature id for the '<em><b>Left Binary Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT_BINARY_OPERATION__LEFT_BINARY_EXPRESSION = INT_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Right Binary Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT_BINARY_OPERATION__RIGHT_BINARY_EXPRESSION = INT_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Int Binary Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT_BINARY_OPERATION_FEATURE_COUNT = INT_EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Current Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT_BINARY_OPERATION___GET_CURRENT_VALUE = INT_EXPRESSION___GET_CURRENT_VALUE;

	/**
	 * The operation id for the '<em>Evaluate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT_BINARY_OPERATION___EVALUATE = INT_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Int Binary Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT_BINARY_OPERATION_OPERATION_COUNT = INT_EXPRESSION_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link gx10.impl.AsyncImpl <em>Async</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gx10.impl.AsyncImpl
	 * @see gx10.impl.Gx10PackageImpl#getAsync()
	 * @generated
	 */
	int ASYNC = 15;

	/**
	 * The feature id for the '<em><b>In Block</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASYNC__IN_BLOCK = STATEMENT__IN_BLOCK;

	/**
	 * The feature id for the '<em><b>Async Block</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASYNC__ASYNC_BLOCK = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Async</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASYNC_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Async</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASYNC_OPERATION_COUNT = STATEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gx10.impl.MethodCallImpl <em>Method Call</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gx10.impl.MethodCallImpl
	 * @see gx10.impl.Gx10PackageImpl#getMethodCall()
	 * @generated
	 */
	int METHOD_CALL = 16;

	/**
	 * The feature id for the '<em><b>In Block</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_CALL__IN_BLOCK = EXPRESSION__IN_BLOCK;

	/**
	 * The feature id for the '<em><b>Method To Call</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_CALL__METHOD_TO_CALL = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Method Call Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_CALL__METHOD_CALL_PARAMETERS = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Method Call</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_CALL_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Call</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_CALL___CALL = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Method Call</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_CALL_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link gx10.impl.FinishImpl <em>Finish</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gx10.impl.FinishImpl
	 * @see gx10.impl.Gx10PackageImpl#getFinish()
	 * @generated
	 */
	int FINISH = 18;

	/**
	 * The feature id for the '<em><b>In Block</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINISH__IN_BLOCK = STATEMENT__IN_BLOCK;

	/**
	 * The feature id for the '<em><b>Finish Statement</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINISH__FINISH_STATEMENT = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Finish</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINISH_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Finish</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINISH_OPERATION_COUNT = STATEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gx10.impl.PrintImpl <em>Print</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gx10.impl.PrintImpl
	 * @see gx10.impl.Gx10PackageImpl#getPrint()
	 * @generated
	 */
	int PRINT = 19;

	/**
	 * The feature id for the '<em><b>In Block</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRINT__IN_BLOCK = STATEMENT__IN_BLOCK;

	/**
	 * The feature id for the '<em><b>To Print</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRINT__TO_PRINT = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Print</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRINT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Print</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRINT___PRINT = STATEMENT_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Print</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRINT_OPERATION_COUNT = STATEMENT_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link gx10.impl.BoolVarImpl <em>Bool Var</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gx10.impl.BoolVarImpl
	 * @see gx10.impl.Gx10PackageImpl#getBoolVar()
	 * @generated
	 */
	int BOOL_VAR = 20;

	/**
	 * The feature id for the '<em><b>In Block</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOL_VAR__IN_BLOCK = EXPRESSION__IN_BLOCK;

	/**
	 * The feature id for the '<em><b>Bool Var Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOL_VAR__BOOL_VAR_EXPR = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Bool Var Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOL_VAR__BOOL_VAR_NAME = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Bool Var</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOL_VAR_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Evaluate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOL_VAR___EVALUATE = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Bool Var</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOL_VAR_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link gx10.impl.IntVarImpl <em>Int Var</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gx10.impl.IntVarImpl
	 * @see gx10.impl.Gx10PackageImpl#getIntVar()
	 * @generated
	 */
	int INT_VAR = 21;

	/**
	 * The feature id for the '<em><b>In Block</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT_VAR__IN_BLOCK = STATEMENT__IN_BLOCK;

	/**
	 * The feature id for the '<em><b>Int Var Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT_VAR__INT_VAR_EXPR = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Int Var Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT_VAR__INT_VAR_NAME = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Int Var</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT_VAR_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Evaluate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT_VAR___EVALUATE = STATEMENT_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Int Var</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT_VAR_OPERATION_COUNT = STATEMENT_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link gx10.impl.IntVarAccessImpl <em>Int Var Access</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gx10.impl.IntVarAccessImpl
	 * @see gx10.impl.Gx10PackageImpl#getIntVarAccess()
	 * @generated
	 */
	int INT_VAR_ACCESS = 22;

	/**
	 * The feature id for the '<em><b>In Block</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT_VAR_ACCESS__IN_BLOCK = INT_EXPRESSION__IN_BLOCK;

	/**
	 * The feature id for the '<em><b>In Method Call Parameter</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT_VAR_ACCESS__IN_METHOD_CALL_PARAMETER = INT_EXPRESSION__IN_METHOD_CALL_PARAMETER;

	/**
	 * The feature id for the '<em><b>Int Var Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT_VAR_ACCESS__INT_VAR_REF = INT_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Int Var Access</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT_VAR_ACCESS_FEATURE_COUNT = INT_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Current Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT_VAR_ACCESS___GET_CURRENT_VALUE = INT_EXPRESSION___GET_CURRENT_VALUE;

	/**
	 * The number of operations of the '<em>Int Var Access</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT_VAR_ACCESS_OPERATION_COUNT = INT_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gx10.impl.BoolVarAccessImpl <em>Bool Var Access</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gx10.impl.BoolVarAccessImpl
	 * @see gx10.impl.Gx10PackageImpl#getBoolVarAccess()
	 * @generated
	 */
	int BOOL_VAR_ACCESS = 23;

	/**
	 * The feature id for the '<em><b>In Block</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOL_VAR_ACCESS__IN_BLOCK = BOOL_EXPRESSION__IN_BLOCK;

	/**
	 * The feature id for the '<em><b>Bool Var Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOL_VAR_ACCESS__BOOL_VAR_REF = BOOL_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Bool Var Access</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOL_VAR_ACCESS_FEATURE_COUNT = BOOL_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Current Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOL_VAR_ACCESS___GET_CURRENT_VALUE = BOOL_EXPRESSION___GET_CURRENT_VALUE;

	/**
	 * The number of operations of the '<em>Bool Var Access</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOL_VAR_ACCESS_OPERATION_COUNT = BOOL_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gx10.impl.EqualImpl <em>Equal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gx10.impl.EqualImpl
	 * @see gx10.impl.Gx10PackageImpl#getEqual()
	 * @generated
	 */
	int EQUAL = 24;

	/**
	 * The feature id for the '<em><b>In Block</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUAL__IN_BLOCK = BOOL_EXPRESSION__IN_BLOCK;

	/**
	 * The feature id for the '<em><b>Left Equal</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUAL__LEFT_EQUAL = BOOL_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Right Equal</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUAL__RIGHT_EQUAL = BOOL_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Equal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUAL_FEATURE_COUNT = BOOL_EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Current Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUAL___GET_CURRENT_VALUE = BOOL_EXPRESSION___GET_CURRENT_VALUE;

	/**
	 * The operation id for the '<em>Evaluate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUAL___EVALUATE = BOOL_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Equal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUAL_OPERATION_COUNT = BOOL_EXPRESSION_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link gx10.impl.MethodCallParameterImpl <em>Method Call Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gx10.impl.MethodCallParameterImpl
	 * @see gx10.impl.Gx10PackageImpl#getMethodCallParameter()
	 * @generated
	 */
	int METHOD_CALL_PARAMETER = 25;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_CALL_PARAMETER__NAME = 0;

	/**
	 * The feature id for the '<em><b>Method Call Parameter Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_CALL_PARAMETER__METHOD_CALL_PARAMETER_EXPR = 1;

	/**
	 * The feature id for the '<em><b>In Method Call</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_CALL_PARAMETER__IN_METHOD_CALL = 2;

	/**
	 * The number of structural features of the '<em>Method Call Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_CALL_PARAMETER_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Method Call Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_CALL_PARAMETER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gx10.impl.ReferentiableImpl <em>Referentiable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gx10.impl.ReferentiableImpl
	 * @see gx10.impl.Gx10PackageImpl#getReferentiable()
	 * @generated
	 */
	int REFERENTIABLE = 26;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENTIABLE__NAME = 0;

	/**
	 * The number of structural features of the '<em>Referentiable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENTIABLE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Referentiable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENTIABLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gx10.impl.PlusImpl <em>Plus</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gx10.impl.PlusImpl
	 * @see gx10.impl.Gx10PackageImpl#getPlus()
	 * @generated
	 */
	int PLUS = 27;

	/**
	 * The feature id for the '<em><b>In Block</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLUS__IN_BLOCK = INT_BINARY_OPERATION__IN_BLOCK;

	/**
	 * The feature id for the '<em><b>In Method Call Parameter</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLUS__IN_METHOD_CALL_PARAMETER = INT_BINARY_OPERATION__IN_METHOD_CALL_PARAMETER;

	/**
	 * The feature id for the '<em><b>Left Binary Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLUS__LEFT_BINARY_EXPRESSION = INT_BINARY_OPERATION__LEFT_BINARY_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Right Binary Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLUS__RIGHT_BINARY_EXPRESSION = INT_BINARY_OPERATION__RIGHT_BINARY_EXPRESSION;

	/**
	 * The number of structural features of the '<em>Plus</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLUS_FEATURE_COUNT = INT_BINARY_OPERATION_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Current Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLUS___GET_CURRENT_VALUE = INT_BINARY_OPERATION___GET_CURRENT_VALUE;

	/**
	 * The operation id for the '<em>Evaluate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLUS___EVALUATE = INT_BINARY_OPERATION___EVALUATE;

	/**
	 * The number of operations of the '<em>Plus</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLUS_OPERATION_COUNT = INT_BINARY_OPERATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gx10.impl.TimeImpl <em>Time</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gx10.impl.TimeImpl
	 * @see gx10.impl.Gx10PackageImpl#getTime()
	 * @generated
	 */
	int TIME = 28;

	/**
	 * The feature id for the '<em><b>In Block</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME__IN_BLOCK = INT_BINARY_OPERATION__IN_BLOCK;

	/**
	 * The feature id for the '<em><b>In Method Call Parameter</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME__IN_METHOD_CALL_PARAMETER = INT_BINARY_OPERATION__IN_METHOD_CALL_PARAMETER;

	/**
	 * The feature id for the '<em><b>Left Binary Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME__LEFT_BINARY_EXPRESSION = INT_BINARY_OPERATION__LEFT_BINARY_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Right Binary Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME__RIGHT_BINARY_EXPRESSION = INT_BINARY_OPERATION__RIGHT_BINARY_EXPRESSION;

	/**
	 * The number of structural features of the '<em>Time</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_FEATURE_COUNT = INT_BINARY_OPERATION_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Current Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME___GET_CURRENT_VALUE = INT_BINARY_OPERATION___GET_CURRENT_VALUE;

	/**
	 * The operation id for the '<em>Evaluate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME___EVALUATE = INT_BINARY_OPERATION___EVALUATE;

	/**
	 * The number of operations of the '<em>Time</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_OPERATION_COUNT = INT_BINARY_OPERATION_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link gx10.Program <em>Program</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Program</em>'.
	 * @see gx10.Program
	 * @generated
	 */
	EClass getProgram();

	/**
	 * Returns the meta object for the containment reference list '{@link gx10.Program#getMethods <em>Methods</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Methods</em>'.
	 * @see gx10.Program#getMethods()
	 * @see #getProgram()
	 * @generated
	 */
	EReference getProgram_Methods();

	/**
	 * Returns the meta object for the reference '{@link gx10.Program#getStartMethod <em>Start Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Start Method</em>'.
	 * @see gx10.Program#getStartMethod()
	 * @see #getProgram()
	 * @generated
	 */
	EReference getProgram_StartMethod();

	/**
	 * Returns the meta object for class '{@link gx10.Method <em>Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Method</em>'.
	 * @see gx10.Method
	 * @generated
	 */
	EClass getMethod();

	/**
	 * Returns the meta object for the container reference '{@link gx10.Method#getInProgram <em>In Program</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>In Program</em>'.
	 * @see gx10.Method#getInProgram()
	 * @see #getMethod()
	 * @generated
	 */
	EReference getMethod_InProgram();

	/**
	 * Returns the meta object for the containment reference '{@link gx10.Method#getMethodBlock <em>Method Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Method Block</em>'.
	 * @see gx10.Method#getMethodBlock()
	 * @see #getMethod()
	 * @generated
	 */
	EReference getMethod_MethodBlock();

	/**
	 * Returns the meta object for the attribute '{@link gx10.Method#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see gx10.Method#getName()
	 * @see #getMethod()
	 * @generated
	 */
	EAttribute getMethod_Name();

	/**
	 * Returns the meta object for the reference list '{@link gx10.Method#getCalledBy <em>Called By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Called By</em>'.
	 * @see gx10.Method#getCalledBy()
	 * @see #getMethod()
	 * @generated
	 */
	EReference getMethod_CalledBy();

	/**
	 * Returns the meta object for the containment reference list '{@link gx10.Method#getMethodParameters <em>Method Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Method Parameters</em>'.
	 * @see gx10.Method#getMethodParameters()
	 * @see #getMethod()
	 * @generated
	 */
	EReference getMethod_MethodParameters();

	/**
	 * Returns the meta object for class '{@link gx10.Block <em>Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Block</em>'.
	 * @see gx10.Block
	 * @generated
	 */
	EClass getBlock();

	/**
	 * Returns the meta object for the containment reference list '{@link gx10.Block#getBlockStatements <em>Block Statements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Block Statements</em>'.
	 * @see gx10.Block#getBlockStatements()
	 * @see #getBlock()
	 * @generated
	 */
	EReference getBlock_BlockStatements();

	/**
	 * Returns the meta object for the '{@link gx10.Block#initBlock() <em>Init Block</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Init Block</em>' operation.
	 * @see gx10.Block#initBlock()
	 * @generated
	 */
	EOperation getBlock__InitBlock();

	/**
	 * Returns the meta object for class '{@link gx10.Statement <em>Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Statement</em>'.
	 * @see gx10.Statement
	 * @generated
	 */
	EClass getStatement();

	/**
	 * Returns the meta object for the container reference '{@link gx10.Statement#getInBlock <em>In Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>In Block</em>'.
	 * @see gx10.Statement#getInBlock()
	 * @see #getStatement()
	 * @generated
	 */
	EReference getStatement_InBlock();

	/**
	 * Returns the meta object for class '{@link gx10.ControlStructure <em>Control Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Control Structure</em>'.
	 * @see gx10.ControlStructure
	 * @generated
	 */
	EClass getControlStructure();

	/**
	 * Returns the meta object for the containment reference '{@link gx10.ControlStructure#getControlStructureCondition <em>Control Structure Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Control Structure Condition</em>'.
	 * @see gx10.ControlStructure#getControlStructureCondition()
	 * @see #getControlStructure()
	 * @generated
	 */
	EReference getControlStructure_ControlStructureCondition();

	/**
	 * Returns the meta object for class '{@link gx10.IntExpression <em>Int Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Int Expression</em>'.
	 * @see gx10.IntExpression
	 * @generated
	 */
	EClass getIntExpression();

	/**
	 * Returns the meta object for the container reference '{@link gx10.IntExpression#getInMethodCallParameter <em>In Method Call Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>In Method Call Parameter</em>'.
	 * @see gx10.IntExpression#getInMethodCallParameter()
	 * @see #getIntExpression()
	 * @generated
	 */
	EReference getIntExpression_InMethodCallParameter();

	/**
	 * Returns the meta object for the '{@link gx10.IntExpression#getCurrentValue() <em>Get Current Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Current Value</em>' operation.
	 * @see gx10.IntExpression#getCurrentValue()
	 * @generated
	 */
	EOperation getIntExpression__GetCurrentValue();

	/**
	 * Returns the meta object for class '{@link gx10.BoolExpression <em>Bool Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bool Expression</em>'.
	 * @see gx10.BoolExpression
	 * @generated
	 */
	EClass getBoolExpression();

	/**
	 * Returns the meta object for the '{@link gx10.BoolExpression#getCurrentValue() <em>Get Current Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Current Value</em>' operation.
	 * @see gx10.BoolExpression#getCurrentValue()
	 * @generated
	 */
	EOperation getBoolExpression__GetCurrentValue();

	/**
	 * Returns the meta object for class '{@link gx10.If <em>If</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>If</em>'.
	 * @see gx10.If
	 * @generated
	 */
	EClass getIf();

	/**
	 * Returns the meta object for the containment reference '{@link gx10.If#getThenBlock <em>Then Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Then Block</em>'.
	 * @see gx10.If#getThenBlock()
	 * @see #getIf()
	 * @generated
	 */
	EReference getIf_ThenBlock();

	/**
	 * Returns the meta object for the containment reference '{@link gx10.If#getElseBlock <em>Else Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Else Block</em>'.
	 * @see gx10.If#getElseBlock()
	 * @see #getIf()
	 * @generated
	 */
	EReference getIf_ElseBlock();

	/**
	 * Returns the meta object for class '{@link gx10.While <em>While</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>While</em>'.
	 * @see gx10.While
	 * @generated
	 */
	EClass getWhile();

	/**
	 * Returns the meta object for the containment reference '{@link gx10.While#getWhileBlock <em>While Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>While Block</em>'.
	 * @see gx10.While#getWhileBlock()
	 * @see #getWhile()
	 * @generated
	 */
	EReference getWhile_WhileBlock();

	/**
	 * Returns the meta object for class '{@link gx10.True <em>True</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>True</em>'.
	 * @see gx10.True
	 * @generated
	 */
	EClass getTrue();

	/**
	 * Returns the meta object for class '{@link gx10.False <em>False</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>False</em>'.
	 * @see gx10.False
	 * @generated
	 */
	EClass getFalse();

	/**
	 * Returns the meta object for class '{@link gx10.Not <em>Not</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Not</em>'.
	 * @see gx10.Not
	 * @generated
	 */
	EClass getNot();

	/**
	 * Returns the meta object for the containment reference '{@link gx10.Not#getNotExpression <em>Not Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Not Expression</em>'.
	 * @see gx10.Not#getNotExpression()
	 * @see #getNot()
	 * @generated
	 */
	EReference getNot_NotExpression();

	/**
	 * Returns the meta object for class '{@link gx10.And <em>And</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>And</em>'.
	 * @see gx10.And
	 * @generated
	 */
	EClass getAnd();

	/**
	 * Returns the meta object for the containment reference '{@link gx10.And#getLeftAndExpression <em>Left And Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Left And Expression</em>'.
	 * @see gx10.And#getLeftAndExpression()
	 * @see #getAnd()
	 * @generated
	 */
	EReference getAnd_LeftAndExpression();

	/**
	 * Returns the meta object for the containment reference '{@link gx10.And#getRightAndExpression <em>Right And Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Right And Expression</em>'.
	 * @see gx10.And#getRightAndExpression()
	 * @see #getAnd()
	 * @generated
	 */
	EReference getAnd_RightAndExpression();

	/**
	 * Returns the meta object for class '{@link gx10.IntConst <em>Int Const</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Int Const</em>'.
	 * @see gx10.IntConst
	 * @generated
	 */
	EClass getIntConst();

	/**
	 * Returns the meta object for the attribute '{@link gx10.IntConst#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see gx10.IntConst#getValue()
	 * @see #getIntConst()
	 * @generated
	 */
	EAttribute getIntConst_Value();

	/**
	 * Returns the meta object for class '{@link gx10.IntBinaryOperation <em>Int Binary Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Int Binary Operation</em>'.
	 * @see gx10.IntBinaryOperation
	 * @generated
	 */
	EClass getIntBinaryOperation();

	/**
	 * Returns the meta object for the containment reference '{@link gx10.IntBinaryOperation#getLeftBinaryExpression <em>Left Binary Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Left Binary Expression</em>'.
	 * @see gx10.IntBinaryOperation#getLeftBinaryExpression()
	 * @see #getIntBinaryOperation()
	 * @generated
	 */
	EReference getIntBinaryOperation_LeftBinaryExpression();

	/**
	 * Returns the meta object for the containment reference '{@link gx10.IntBinaryOperation#getRightBinaryExpression <em>Right Binary Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Right Binary Expression</em>'.
	 * @see gx10.IntBinaryOperation#getRightBinaryExpression()
	 * @see #getIntBinaryOperation()
	 * @generated
	 */
	EReference getIntBinaryOperation_RightBinaryExpression();

	/**
	 * Returns the meta object for the '{@link gx10.IntBinaryOperation#evaluate() <em>Evaluate</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Evaluate</em>' operation.
	 * @see gx10.IntBinaryOperation#evaluate()
	 * @generated
	 */
	EOperation getIntBinaryOperation__Evaluate();

	/**
	 * Returns the meta object for class '{@link gx10.Async <em>Async</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Async</em>'.
	 * @see gx10.Async
	 * @generated
	 */
	EClass getAsync();

	/**
	 * Returns the meta object for the containment reference '{@link gx10.Async#getAsyncBlock <em>Async Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Async Block</em>'.
	 * @see gx10.Async#getAsyncBlock()
	 * @see #getAsync()
	 * @generated
	 */
	EReference getAsync_AsyncBlock();

	/**
	 * Returns the meta object for class '{@link gx10.MethodCall <em>Method Call</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Method Call</em>'.
	 * @see gx10.MethodCall
	 * @generated
	 */
	EClass getMethodCall();

	/**
	 * Returns the meta object for the reference '{@link gx10.MethodCall#getMethodToCall <em>Method To Call</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Method To Call</em>'.
	 * @see gx10.MethodCall#getMethodToCall()
	 * @see #getMethodCall()
	 * @generated
	 */
	EReference getMethodCall_MethodToCall();

	/**
	 * Returns the meta object for the containment reference list '{@link gx10.MethodCall#getMethodCallParameters <em>Method Call Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Method Call Parameters</em>'.
	 * @see gx10.MethodCall#getMethodCallParameters()
	 * @see #getMethodCall()
	 * @generated
	 */
	EReference getMethodCall_MethodCallParameters();

	/**
	 * Returns the meta object for the '{@link gx10.MethodCall#call() <em>Call</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Call</em>' operation.
	 * @see gx10.MethodCall#call()
	 * @generated
	 */
	EOperation getMethodCall__Call();

	/**
	 * Returns the meta object for class '{@link gx10.Expression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expression</em>'.
	 * @see gx10.Expression
	 * @generated
	 */
	EClass getExpression();

	/**
	 * Returns the meta object for class '{@link gx10.Finish <em>Finish</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Finish</em>'.
	 * @see gx10.Finish
	 * @generated
	 */
	EClass getFinish();

	/**
	 * Returns the meta object for the containment reference '{@link gx10.Finish#getFinishStatement <em>Finish Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Finish Statement</em>'.
	 * @see gx10.Finish#getFinishStatement()
	 * @see #getFinish()
	 * @generated
	 */
	EReference getFinish_FinishStatement();

	/**
	 * Returns the meta object for class '{@link gx10.Print <em>Print</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Print</em>'.
	 * @see gx10.Print
	 * @generated
	 */
	EClass getPrint();

	/**
	 * Returns the meta object for the containment reference '{@link gx10.Print#getToPrint <em>To Print</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>To Print</em>'.
	 * @see gx10.Print#getToPrint()
	 * @see #getPrint()
	 * @generated
	 */
	EReference getPrint_ToPrint();

	/**
	 * Returns the meta object for the '{@link gx10.Print#print() <em>Print</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Print</em>' operation.
	 * @see gx10.Print#print()
	 * @generated
	 */
	EOperation getPrint__Print();

	/**
	 * Returns the meta object for class '{@link gx10.BoolVar <em>Bool Var</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bool Var</em>'.
	 * @see gx10.BoolVar
	 * @generated
	 */
	EClass getBoolVar();

	/**
	 * Returns the meta object for the containment reference '{@link gx10.BoolVar#getBoolVarExpr <em>Bool Var Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Bool Var Expr</em>'.
	 * @see gx10.BoolVar#getBoolVarExpr()
	 * @see #getBoolVar()
	 * @generated
	 */
	EReference getBoolVar_BoolVarExpr();

	/**
	 * Returns the meta object for the containment reference '{@link gx10.BoolVar#getBoolVarName <em>Bool Var Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Bool Var Name</em>'.
	 * @see gx10.BoolVar#getBoolVarName()
	 * @see #getBoolVar()
	 * @generated
	 */
	EReference getBoolVar_BoolVarName();

	/**
	 * Returns the meta object for the '{@link gx10.BoolVar#evaluate() <em>Evaluate</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Evaluate</em>' operation.
	 * @see gx10.BoolVar#evaluate()
	 * @generated
	 */
	EOperation getBoolVar__Evaluate();

	/**
	 * Returns the meta object for class '{@link gx10.IntVar <em>Int Var</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Int Var</em>'.
	 * @see gx10.IntVar
	 * @generated
	 */
	EClass getIntVar();

	/**
	 * Returns the meta object for the containment reference '{@link gx10.IntVar#getIntVarExpr <em>Int Var Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Int Var Expr</em>'.
	 * @see gx10.IntVar#getIntVarExpr()
	 * @see #getIntVar()
	 * @generated
	 */
	EReference getIntVar_IntVarExpr();

	/**
	 * Returns the meta object for the containment reference '{@link gx10.IntVar#getIntVarName <em>Int Var Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Int Var Name</em>'.
	 * @see gx10.IntVar#getIntVarName()
	 * @see #getIntVar()
	 * @generated
	 */
	EReference getIntVar_IntVarName();

	/**
	 * Returns the meta object for the '{@link gx10.IntVar#evaluate() <em>Evaluate</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Evaluate</em>' operation.
	 * @see gx10.IntVar#evaluate()
	 * @generated
	 */
	EOperation getIntVar__Evaluate();

	/**
	 * Returns the meta object for class '{@link gx10.IntVarAccess <em>Int Var Access</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Int Var Access</em>'.
	 * @see gx10.IntVarAccess
	 * @generated
	 */
	EClass getIntVarAccess();

	/**
	 * Returns the meta object for the reference '{@link gx10.IntVarAccess#getIntVarRef <em>Int Var Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Int Var Ref</em>'.
	 * @see gx10.IntVarAccess#getIntVarRef()
	 * @see #getIntVarAccess()
	 * @generated
	 */
	EReference getIntVarAccess_IntVarRef();

	/**
	 * Returns the meta object for class '{@link gx10.BoolVarAccess <em>Bool Var Access</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bool Var Access</em>'.
	 * @see gx10.BoolVarAccess
	 * @generated
	 */
	EClass getBoolVarAccess();

	/**
	 * Returns the meta object for the reference '{@link gx10.BoolVarAccess#getBoolVarRef <em>Bool Var Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Bool Var Ref</em>'.
	 * @see gx10.BoolVarAccess#getBoolVarRef()
	 * @see #getBoolVarAccess()
	 * @generated
	 */
	EReference getBoolVarAccess_BoolVarRef();

	/**
	 * Returns the meta object for class '{@link gx10.Equal <em>Equal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Equal</em>'.
	 * @see gx10.Equal
	 * @generated
	 */
	EClass getEqual();

	/**
	 * Returns the meta object for the containment reference '{@link gx10.Equal#getLeftEqual <em>Left Equal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Left Equal</em>'.
	 * @see gx10.Equal#getLeftEqual()
	 * @see #getEqual()
	 * @generated
	 */
	EReference getEqual_LeftEqual();

	/**
	 * Returns the meta object for the containment reference '{@link gx10.Equal#getRightEqual <em>Right Equal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Right Equal</em>'.
	 * @see gx10.Equal#getRightEqual()
	 * @see #getEqual()
	 * @generated
	 */
	EReference getEqual_RightEqual();

	/**
	 * Returns the meta object for the '{@link gx10.Equal#evaluate() <em>Evaluate</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Evaluate</em>' operation.
	 * @see gx10.Equal#evaluate()
	 * @generated
	 */
	EOperation getEqual__Evaluate();

	/**
	 * Returns the meta object for class '{@link gx10.MethodCallParameter <em>Method Call Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Method Call Parameter</em>'.
	 * @see gx10.MethodCallParameter
	 * @generated
	 */
	EClass getMethodCallParameter();

	/**
	 * Returns the meta object for the attribute '{@link gx10.MethodCallParameter#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see gx10.MethodCallParameter#getName()
	 * @see #getMethodCallParameter()
	 * @generated
	 */
	EAttribute getMethodCallParameter_Name();

	/**
	 * Returns the meta object for the containment reference '{@link gx10.MethodCallParameter#getMethodCallParameterExpr <em>Method Call Parameter Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Method Call Parameter Expr</em>'.
	 * @see gx10.MethodCallParameter#getMethodCallParameterExpr()
	 * @see #getMethodCallParameter()
	 * @generated
	 */
	EReference getMethodCallParameter_MethodCallParameterExpr();

	/**
	 * Returns the meta object for the container reference '{@link gx10.MethodCallParameter#getInMethodCall <em>In Method Call</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>In Method Call</em>'.
	 * @see gx10.MethodCallParameter#getInMethodCall()
	 * @see #getMethodCallParameter()
	 * @generated
	 */
	EReference getMethodCallParameter_InMethodCall();

	/**
	 * Returns the meta object for class '{@link gx10.Referentiable <em>Referentiable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Referentiable</em>'.
	 * @see gx10.Referentiable
	 * @generated
	 */
	EClass getReferentiable();

	/**
	 * Returns the meta object for the attribute '{@link gx10.Referentiable#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see gx10.Referentiable#getName()
	 * @see #getReferentiable()
	 * @generated
	 */
	EAttribute getReferentiable_Name();

	/**
	 * Returns the meta object for class '{@link gx10.Plus <em>Plus</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Plus</em>'.
	 * @see gx10.Plus
	 * @generated
	 */
	EClass getPlus();

	/**
	 * Returns the meta object for class '{@link gx10.Time <em>Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Time</em>'.
	 * @see gx10.Time
	 * @generated
	 */
	EClass getTime();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Gx10Factory getGx10Factory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link gx10.impl.ProgramImpl <em>Program</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gx10.impl.ProgramImpl
		 * @see gx10.impl.Gx10PackageImpl#getProgram()
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
		 * The meta object literal for the '{@link gx10.impl.MethodImpl <em>Method</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gx10.impl.MethodImpl
		 * @see gx10.impl.Gx10PackageImpl#getMethod()
		 * @generated
		 */
		EClass METHOD = eINSTANCE.getMethod();

		/**
		 * The meta object literal for the '<em><b>In Program</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METHOD__IN_PROGRAM = eINSTANCE.getMethod_InProgram();

		/**
		 * The meta object literal for the '<em><b>Method Block</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METHOD__METHOD_BLOCK = eINSTANCE.getMethod_MethodBlock();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METHOD__NAME = eINSTANCE.getMethod_Name();

		/**
		 * The meta object literal for the '<em><b>Called By</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METHOD__CALLED_BY = eINSTANCE.getMethod_CalledBy();

		/**
		 * The meta object literal for the '<em><b>Method Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METHOD__METHOD_PARAMETERS = eINSTANCE.getMethod_MethodParameters();

		/**
		 * The meta object literal for the '{@link gx10.impl.BlockImpl <em>Block</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gx10.impl.BlockImpl
		 * @see gx10.impl.Gx10PackageImpl#getBlock()
		 * @generated
		 */
		EClass BLOCK = eINSTANCE.getBlock();

		/**
		 * The meta object literal for the '<em><b>Block Statements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BLOCK__BLOCK_STATEMENTS = eINSTANCE.getBlock_BlockStatements();

		/**
		 * The meta object literal for the '<em><b>Init Block</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BLOCK___INIT_BLOCK = eINSTANCE.getBlock__InitBlock();

		/**
		 * The meta object literal for the '{@link gx10.impl.StatementImpl <em>Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gx10.impl.StatementImpl
		 * @see gx10.impl.Gx10PackageImpl#getStatement()
		 * @generated
		 */
		EClass STATEMENT = eINSTANCE.getStatement();

		/**
		 * The meta object literal for the '<em><b>In Block</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATEMENT__IN_BLOCK = eINSTANCE.getStatement_InBlock();

		/**
		 * The meta object literal for the '{@link gx10.impl.ControlStructureImpl <em>Control Structure</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gx10.impl.ControlStructureImpl
		 * @see gx10.impl.Gx10PackageImpl#getControlStructure()
		 * @generated
		 */
		EClass CONTROL_STRUCTURE = eINSTANCE.getControlStructure();

		/**
		 * The meta object literal for the '<em><b>Control Structure Condition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTROL_STRUCTURE__CONTROL_STRUCTURE_CONDITION = eINSTANCE.getControlStructure_ControlStructureCondition();

		/**
		 * The meta object literal for the '{@link gx10.impl.IntExpressionImpl <em>Int Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gx10.impl.IntExpressionImpl
		 * @see gx10.impl.Gx10PackageImpl#getIntExpression()
		 * @generated
		 */
		EClass INT_EXPRESSION = eINSTANCE.getIntExpression();

		/**
		 * The meta object literal for the '<em><b>In Method Call Parameter</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INT_EXPRESSION__IN_METHOD_CALL_PARAMETER = eINSTANCE.getIntExpression_InMethodCallParameter();

		/**
		 * The meta object literal for the '<em><b>Get Current Value</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INT_EXPRESSION___GET_CURRENT_VALUE = eINSTANCE.getIntExpression__GetCurrentValue();

		/**
		 * The meta object literal for the '{@link gx10.impl.BoolExpressionImpl <em>Bool Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gx10.impl.BoolExpressionImpl
		 * @see gx10.impl.Gx10PackageImpl#getBoolExpression()
		 * @generated
		 */
		EClass BOOL_EXPRESSION = eINSTANCE.getBoolExpression();

		/**
		 * The meta object literal for the '<em><b>Get Current Value</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BOOL_EXPRESSION___GET_CURRENT_VALUE = eINSTANCE.getBoolExpression__GetCurrentValue();

		/**
		 * The meta object literal for the '{@link gx10.impl.IfImpl <em>If</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gx10.impl.IfImpl
		 * @see gx10.impl.Gx10PackageImpl#getIf()
		 * @generated
		 */
		EClass IF = eINSTANCE.getIf();

		/**
		 * The meta object literal for the '<em><b>Then Block</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IF__THEN_BLOCK = eINSTANCE.getIf_ThenBlock();

		/**
		 * The meta object literal for the '<em><b>Else Block</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IF__ELSE_BLOCK = eINSTANCE.getIf_ElseBlock();

		/**
		 * The meta object literal for the '{@link gx10.impl.WhileImpl <em>While</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gx10.impl.WhileImpl
		 * @see gx10.impl.Gx10PackageImpl#getWhile()
		 * @generated
		 */
		EClass WHILE = eINSTANCE.getWhile();

		/**
		 * The meta object literal for the '<em><b>While Block</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WHILE__WHILE_BLOCK = eINSTANCE.getWhile_WhileBlock();

		/**
		 * The meta object literal for the '{@link gx10.impl.TrueImpl <em>True</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gx10.impl.TrueImpl
		 * @see gx10.impl.Gx10PackageImpl#getTrue()
		 * @generated
		 */
		EClass TRUE = eINSTANCE.getTrue();

		/**
		 * The meta object literal for the '{@link gx10.impl.FalseImpl <em>False</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gx10.impl.FalseImpl
		 * @see gx10.impl.Gx10PackageImpl#getFalse()
		 * @generated
		 */
		EClass FALSE = eINSTANCE.getFalse();

		/**
		 * The meta object literal for the '{@link gx10.impl.NotImpl <em>Not</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gx10.impl.NotImpl
		 * @see gx10.impl.Gx10PackageImpl#getNot()
		 * @generated
		 */
		EClass NOT = eINSTANCE.getNot();

		/**
		 * The meta object literal for the '<em><b>Not Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NOT__NOT_EXPRESSION = eINSTANCE.getNot_NotExpression();

		/**
		 * The meta object literal for the '{@link gx10.impl.AndImpl <em>And</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gx10.impl.AndImpl
		 * @see gx10.impl.Gx10PackageImpl#getAnd()
		 * @generated
		 */
		EClass AND = eINSTANCE.getAnd();

		/**
		 * The meta object literal for the '<em><b>Left And Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AND__LEFT_AND_EXPRESSION = eINSTANCE.getAnd_LeftAndExpression();

		/**
		 * The meta object literal for the '<em><b>Right And Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AND__RIGHT_AND_EXPRESSION = eINSTANCE.getAnd_RightAndExpression();

		/**
		 * The meta object literal for the '{@link gx10.impl.IntConstImpl <em>Int Const</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gx10.impl.IntConstImpl
		 * @see gx10.impl.Gx10PackageImpl#getIntConst()
		 * @generated
		 */
		EClass INT_CONST = eINSTANCE.getIntConst();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INT_CONST__VALUE = eINSTANCE.getIntConst_Value();

		/**
		 * The meta object literal for the '{@link gx10.impl.IntBinaryOperationImpl <em>Int Binary Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gx10.impl.IntBinaryOperationImpl
		 * @see gx10.impl.Gx10PackageImpl#getIntBinaryOperation()
		 * @generated
		 */
		EClass INT_BINARY_OPERATION = eINSTANCE.getIntBinaryOperation();

		/**
		 * The meta object literal for the '<em><b>Left Binary Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INT_BINARY_OPERATION__LEFT_BINARY_EXPRESSION = eINSTANCE.getIntBinaryOperation_LeftBinaryExpression();

		/**
		 * The meta object literal for the '<em><b>Right Binary Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INT_BINARY_OPERATION__RIGHT_BINARY_EXPRESSION = eINSTANCE.getIntBinaryOperation_RightBinaryExpression();

		/**
		 * The meta object literal for the '<em><b>Evaluate</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INT_BINARY_OPERATION___EVALUATE = eINSTANCE.getIntBinaryOperation__Evaluate();

		/**
		 * The meta object literal for the '{@link gx10.impl.AsyncImpl <em>Async</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gx10.impl.AsyncImpl
		 * @see gx10.impl.Gx10PackageImpl#getAsync()
		 * @generated
		 */
		EClass ASYNC = eINSTANCE.getAsync();

		/**
		 * The meta object literal for the '<em><b>Async Block</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASYNC__ASYNC_BLOCK = eINSTANCE.getAsync_AsyncBlock();

		/**
		 * The meta object literal for the '{@link gx10.impl.MethodCallImpl <em>Method Call</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gx10.impl.MethodCallImpl
		 * @see gx10.impl.Gx10PackageImpl#getMethodCall()
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
		 * The meta object literal for the '<em><b>Method Call Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METHOD_CALL__METHOD_CALL_PARAMETERS = eINSTANCE.getMethodCall_MethodCallParameters();

		/**
		 * The meta object literal for the '<em><b>Call</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation METHOD_CALL___CALL = eINSTANCE.getMethodCall__Call();

		/**
		 * The meta object literal for the '{@link gx10.impl.ExpressionImpl <em>Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gx10.impl.ExpressionImpl
		 * @see gx10.impl.Gx10PackageImpl#getExpression()
		 * @generated
		 */
		EClass EXPRESSION = eINSTANCE.getExpression();

		/**
		 * The meta object literal for the '{@link gx10.impl.FinishImpl <em>Finish</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gx10.impl.FinishImpl
		 * @see gx10.impl.Gx10PackageImpl#getFinish()
		 * @generated
		 */
		EClass FINISH = eINSTANCE.getFinish();

		/**
		 * The meta object literal for the '<em><b>Finish Statement</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FINISH__FINISH_STATEMENT = eINSTANCE.getFinish_FinishStatement();

		/**
		 * The meta object literal for the '{@link gx10.impl.PrintImpl <em>Print</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gx10.impl.PrintImpl
		 * @see gx10.impl.Gx10PackageImpl#getPrint()
		 * @generated
		 */
		EClass PRINT = eINSTANCE.getPrint();

		/**
		 * The meta object literal for the '<em><b>To Print</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRINT__TO_PRINT = eINSTANCE.getPrint_ToPrint();

		/**
		 * The meta object literal for the '<em><b>Print</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PRINT___PRINT = eINSTANCE.getPrint__Print();

		/**
		 * The meta object literal for the '{@link gx10.impl.BoolVarImpl <em>Bool Var</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gx10.impl.BoolVarImpl
		 * @see gx10.impl.Gx10PackageImpl#getBoolVar()
		 * @generated
		 */
		EClass BOOL_VAR = eINSTANCE.getBoolVar();

		/**
		 * The meta object literal for the '<em><b>Bool Var Expr</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOOL_VAR__BOOL_VAR_EXPR = eINSTANCE.getBoolVar_BoolVarExpr();

		/**
		 * The meta object literal for the '<em><b>Bool Var Name</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOOL_VAR__BOOL_VAR_NAME = eINSTANCE.getBoolVar_BoolVarName();

		/**
		 * The meta object literal for the '<em><b>Evaluate</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BOOL_VAR___EVALUATE = eINSTANCE.getBoolVar__Evaluate();

		/**
		 * The meta object literal for the '{@link gx10.impl.IntVarImpl <em>Int Var</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gx10.impl.IntVarImpl
		 * @see gx10.impl.Gx10PackageImpl#getIntVar()
		 * @generated
		 */
		EClass INT_VAR = eINSTANCE.getIntVar();

		/**
		 * The meta object literal for the '<em><b>Int Var Expr</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INT_VAR__INT_VAR_EXPR = eINSTANCE.getIntVar_IntVarExpr();

		/**
		 * The meta object literal for the '<em><b>Int Var Name</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INT_VAR__INT_VAR_NAME = eINSTANCE.getIntVar_IntVarName();

		/**
		 * The meta object literal for the '<em><b>Evaluate</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INT_VAR___EVALUATE = eINSTANCE.getIntVar__Evaluate();

		/**
		 * The meta object literal for the '{@link gx10.impl.IntVarAccessImpl <em>Int Var Access</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gx10.impl.IntVarAccessImpl
		 * @see gx10.impl.Gx10PackageImpl#getIntVarAccess()
		 * @generated
		 */
		EClass INT_VAR_ACCESS = eINSTANCE.getIntVarAccess();

		/**
		 * The meta object literal for the '<em><b>Int Var Ref</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INT_VAR_ACCESS__INT_VAR_REF = eINSTANCE.getIntVarAccess_IntVarRef();

		/**
		 * The meta object literal for the '{@link gx10.impl.BoolVarAccessImpl <em>Bool Var Access</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gx10.impl.BoolVarAccessImpl
		 * @see gx10.impl.Gx10PackageImpl#getBoolVarAccess()
		 * @generated
		 */
		EClass BOOL_VAR_ACCESS = eINSTANCE.getBoolVarAccess();

		/**
		 * The meta object literal for the '<em><b>Bool Var Ref</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOOL_VAR_ACCESS__BOOL_VAR_REF = eINSTANCE.getBoolVarAccess_BoolVarRef();

		/**
		 * The meta object literal for the '{@link gx10.impl.EqualImpl <em>Equal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gx10.impl.EqualImpl
		 * @see gx10.impl.Gx10PackageImpl#getEqual()
		 * @generated
		 */
		EClass EQUAL = eINSTANCE.getEqual();

		/**
		 * The meta object literal for the '<em><b>Left Equal</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EQUAL__LEFT_EQUAL = eINSTANCE.getEqual_LeftEqual();

		/**
		 * The meta object literal for the '<em><b>Right Equal</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EQUAL__RIGHT_EQUAL = eINSTANCE.getEqual_RightEqual();

		/**
		 * The meta object literal for the '<em><b>Evaluate</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EQUAL___EVALUATE = eINSTANCE.getEqual__Evaluate();

		/**
		 * The meta object literal for the '{@link gx10.impl.MethodCallParameterImpl <em>Method Call Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gx10.impl.MethodCallParameterImpl
		 * @see gx10.impl.Gx10PackageImpl#getMethodCallParameter()
		 * @generated
		 */
		EClass METHOD_CALL_PARAMETER = eINSTANCE.getMethodCallParameter();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METHOD_CALL_PARAMETER__NAME = eINSTANCE.getMethodCallParameter_Name();

		/**
		 * The meta object literal for the '<em><b>Method Call Parameter Expr</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METHOD_CALL_PARAMETER__METHOD_CALL_PARAMETER_EXPR = eINSTANCE.getMethodCallParameter_MethodCallParameterExpr();

		/**
		 * The meta object literal for the '<em><b>In Method Call</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METHOD_CALL_PARAMETER__IN_METHOD_CALL = eINSTANCE.getMethodCallParameter_InMethodCall();

		/**
		 * The meta object literal for the '{@link gx10.impl.ReferentiableImpl <em>Referentiable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gx10.impl.ReferentiableImpl
		 * @see gx10.impl.Gx10PackageImpl#getReferentiable()
		 * @generated
		 */
		EClass REFERENTIABLE = eINSTANCE.getReferentiable();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REFERENTIABLE__NAME = eINSTANCE.getReferentiable_Name();

		/**
		 * The meta object literal for the '{@link gx10.impl.PlusImpl <em>Plus</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gx10.impl.PlusImpl
		 * @see gx10.impl.Gx10PackageImpl#getPlus()
		 * @generated
		 */
		EClass PLUS = eINSTANCE.getPlus();

		/**
		 * The meta object literal for the '{@link gx10.impl.TimeImpl <em>Time</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gx10.impl.TimeImpl
		 * @see gx10.impl.Gx10PackageImpl#getTime()
		 * @generated
		 */
		EClass TIME = eINSTANCE.getTime();

	}

} //Gx10Package
