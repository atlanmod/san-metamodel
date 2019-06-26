/**
 */
package San;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Thing</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link San.Thing#getInstrument <em>Instrument</em>}</li>
 * </ul>
 *
 * @see San.SanPackage#getThing()
 * @model
 * @generated
 */
public interface Thing extends Trigger {
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
	 * @see San.SanPackage#getThing_Instrument()
	 * @model required="true"
	 * @generated
	 */
	Instrument getInstrument();

	/**
	 * Sets the value of the '{@link San.Thing#getInstrument <em>Instrument</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Instrument</em>' reference.
	 * @see #getInstrument()
	 * @generated
	 */
	void setInstrument(Instrument value);

} // Thing
