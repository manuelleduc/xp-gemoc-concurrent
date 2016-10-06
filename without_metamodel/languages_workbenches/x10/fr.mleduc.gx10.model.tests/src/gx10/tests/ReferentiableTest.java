/**
 */
package gx10.tests;

import gx10.Gx10Factory;
import gx10.Referentiable;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Referentiable</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ReferentiableTest extends TestCase {

	/**
	 * The fixture for this Referentiable test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Referentiable fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ReferentiableTest.class);
	}

	/**
	 * Constructs a new Referentiable test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReferentiableTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Referentiable test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Referentiable fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Referentiable test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Referentiable getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(Gx10Factory.eINSTANCE.createReferentiable());
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

} //ReferentiableTest
