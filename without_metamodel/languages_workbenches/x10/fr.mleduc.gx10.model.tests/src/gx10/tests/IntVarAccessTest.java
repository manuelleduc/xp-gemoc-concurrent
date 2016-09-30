/**
 */
package gx10.tests;

import gx10.Gx10Factory;
import gx10.IntVarAccess;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Int Var Access</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class IntVarAccessTest extends IntExpressionTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(IntVarAccessTest.class);
	}

	/**
	 * Constructs a new Int Var Access test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntVarAccessTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Int Var Access test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected IntVarAccess getFixture() {
		return (IntVarAccess)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(Gx10Factory.eINSTANCE.createIntVarAccess());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //IntVarAccessTest
