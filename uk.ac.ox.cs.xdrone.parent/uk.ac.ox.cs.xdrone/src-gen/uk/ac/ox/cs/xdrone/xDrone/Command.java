/**
 * generated by Xtext 2.10.0
 */
package uk.ac.ox.cs.xdrone.xDrone;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Command</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.ox.cs.xdrone.xDrone.Command#getMilliseconds <em>Milliseconds</em>}</li>
 * </ul>
 *
 * @see uk.ac.ox.cs.xdrone.xDrone.XDronePackage#getCommand()
 * @model
 * @generated
 */
public interface Command extends EObject
{
  /**
   * Returns the value of the '<em><b>Milliseconds</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Milliseconds</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Milliseconds</em>' attribute.
   * @see #setMilliseconds(int)
   * @see uk.ac.ox.cs.xdrone.xDrone.XDronePackage#getCommand_Milliseconds()
   * @model
   * @generated
   */
  int getMilliseconds();

  /**
   * Sets the value of the '{@link uk.ac.ox.cs.xdrone.xDrone.Command#getMilliseconds <em>Milliseconds</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Milliseconds</em>' attribute.
   * @see #getMilliseconds()
   * @generated
   */
  void setMilliseconds(int value);

} // Command
