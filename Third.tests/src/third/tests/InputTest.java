/**
 */
package third.tests;

import junit.textui.TestRunner;

import third.Input;
import third.ThirdFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Input</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class InputTest extends ValuesTest
{

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static void main(String[] args)
  {
    TestRunner.run(InputTest.class);
  }

  /**
   * Constructs a new Input test case with the given name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InputTest(String name)
  {
    super(name);
  }

  /**
   * Returns the fixture for this Input test case.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected Input getFixture()
  {
    return (Input)fixture;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see junit.framework.TestCase#setUp()
   * @generated
   */
  @Override
  protected void setUp() throws Exception
  {
    setFixture(ThirdFactory.eINSTANCE.createInput());
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see junit.framework.TestCase#tearDown()
   * @generated
   */
  @Override
  protected void tearDown() throws Exception
  {
    setFixture(null);
  }

} //InputTest
