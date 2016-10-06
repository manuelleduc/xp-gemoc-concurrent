/**
 */
package gx10.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>gx10</b></em>' package.
 * <!-- end-user-doc -->
 * @generated
 */
public class Gx10Tests extends TestSuite {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(suite());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Test suite() {
		TestSuite suite = new Gx10Tests("gx10 Tests");
		suite.addTestSuite(BlockTest.class);
		suite.addTestSuite(TrueTest.class);
		suite.addTestSuite(FalseTest.class);
		suite.addTestSuite(NotTest.class);
		suite.addTestSuite(AndTest.class);
		suite.addTestSuite(IntConstTest.class);
		suite.addTestSuite(MethodCallTest.class);
		suite.addTestSuite(PrintTest.class);
		suite.addTestSuite(BoolVarTest.class);
		suite.addTestSuite(IntVarTest.class);
		suite.addTestSuite(IntVarAccessTest.class);
		suite.addTestSuite(BoolVarAccessTest.class);
		suite.addTestSuite(EqualTest.class);
		suite.addTestSuite(PlusTest.class);
		suite.addTestSuite(TimeTest.class);
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Gx10Tests(String name) {
		super(name);
	}

} //Gx10Tests
