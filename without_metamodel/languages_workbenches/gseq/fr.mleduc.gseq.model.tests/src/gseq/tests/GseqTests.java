/**
 */
package gseq.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>gseq</b></em>' package.
 * <!-- end-user-doc -->
 * @generated
 */
public class GseqTests extends TestSuite {

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
		TestSuite suite = new GseqTests("gseq Tests");
		suite.addTestSuite(ProgramTest.class);
		suite.addTestSuite(MethodTest.class);
		suite.addTestSuite(PrintTest.class);
		suite.addTestSuite(MethodCallTest.class);
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GseqTests(String name) {
		super(name);
	}

} //GseqTests
