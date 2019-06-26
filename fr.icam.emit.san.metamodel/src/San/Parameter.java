/**
 */
package San;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link San.Parameter#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see San.SanPackage#getParameter()
 * @model
 * @generated
 */
public interface Parameter extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link San.Datatype}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see San.Datatype
	 * @see #setType(Datatype)
	 * @see San.SanPackage#getParameter_Type()
	 * @model required="true"
	 * @generated
	 */
	Datatype getType();

	/**
	 * Sets the value of the '{@link San.Parameter#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see San.Datatype
	 * @see #getType()
	 * @generated
	 */
	void setType(Datatype value);

} // Parameter
