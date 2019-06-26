/**
 */
package San;

import org.eclipse.emf.common.util.EList;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Process</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link San.Process#getParameters <em>Parameters</em>}</li>
 * </ul>
 *
 * @see San.SanPackage#getProcess()
 * @model
 * @generated
 */
public interface Process extends NamedElement {

	/**
	 * Returns the value of the '<em><b>Parameters</b></em>' containment reference list.
	 * The list contents are of type {@link San.Parameter}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameters</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameters</em>' containment reference list.
	 * @see San.SanPackage#getProcess_Parameters()
	 * @model containment="true"
	 * @generated
	 */
	EList<Parameter> getParameters();
} // Process
