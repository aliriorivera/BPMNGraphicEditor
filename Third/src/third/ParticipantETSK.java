/**
 */
package third;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Participant ETSK</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link third.ParticipantETSK#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see third.ThirdPackage#getParticipantETSK()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='ParticipantETSKNOTvoid'"
 *        annotation="gmf.node figure='rectangle' size='90,20' label='name' label.placement='internal' label.icon='false'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot ParticipantETSKNOTvoid='self.name.size() > 0'"
 * @generated
 */
public interface ParticipantETSK extends Parameters
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
   * @see third.ThirdPackage#getParticipantETSK_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link third.ParticipantETSK#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

} // ParticipantETSK
