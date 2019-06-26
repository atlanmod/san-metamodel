/**
 */
package San;

import org.eclipse.emf.common.util.EList;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Device</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link San.Device#getInstrument <em>Instrument</em>}</li>
 *   <li>{@link San.Device#getArguments <em>Arguments</em>}</li>
 * </ul>
 *
 * @see San.SanPackage#getDevice()
 * @model
 * @generated
 */
public interface Device extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Instrument</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Instrument</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instrument</em>' reference.
	 * @see #setInstrument(Instrument)
	 * @see San.SanPackage#getDevice_Instrument()
	 * @model required="true"
	 * @generated
	 */
	Instrument getInstrument();

	/**
	 * Sets the value of the '{@link San.Device#getInstrument <em>Instrument</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Instrument</em>' reference.
	 * @see #getInstrument()
	 * @generated
	 */
	void setInstrument(Instrument value);

	/**
	 * Returns the value of the '<em><b>Arguments</b></em>' containment reference list.
	 * The list contents are of type {@link San.Argument}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Arguments</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arguments</em>' containment reference list.
	 * @see San.SanPackage#getDevice_Arguments()
	 * @model containment="true"
	 * @generated
	 */
	EList<Argument> getArguments();

} // Device
