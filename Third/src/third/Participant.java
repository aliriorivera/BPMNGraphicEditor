/**
 */
package third;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Participant</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link third.Participant#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see third.ThirdPackage#getParticipant()
 * @model annotation="gmf.node figure='rectangle' size='40,20' label='name' label.placement='internal' label.icon='false'"
 * @generated
 */
public interface Participant extends Parameters
{

  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see third.ThirdPackage#getParticipant_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link third.Participant#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);
} // Participant
