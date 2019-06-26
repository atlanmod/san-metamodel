/**
 */
package San.impl;

import San.Measurand;
import San.SanPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Measurand</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link San.impl.MeasurandImpl#getMeasurand <em>Measurand</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MeasurandImpl extends NamedElementImpl implements Measurand {
	/**
	 * The cached value of the '{@link #getMeasurand() <em>Measurand</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeasurand()
	 * @generated
	 * @ordered
	 */
	protected Measurand measurand;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MeasurandImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SanPackage.Literals.MEASURAND;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Measurand getMeasurand() {
		if (measurand != null && measurand.eIsProxy()) {
			InternalEObject oldMeasurand = (InternalEObject)measurand;
			measurand = (Measurand)eResolveProxy(oldMeasurand);
			if (measurand != oldMeasurand) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SanPackage.MEASURAND__MEASURAND, oldMeasurand, measurand));
			}
		}
		return measurand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Measurand basicGetMeasurand() {
		return measurand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMeasurand(Measurand newMeasurand) {
		Measurand oldMeasurand = measurand;
		measurand = newMeasurand;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SanPackage.MEASURAND__MEASURAND, oldMeasurand, measurand));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SanPackage.MEASURAND__MEASURAND:
				if (resolve) return getMeasurand();
				return basicGetMeasurand();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SanPackage.MEASURAND__MEASURAND:
				setMeasurand((Measurand)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case SanPackage.MEASURAND__MEASURAND:
				setMeasurand((Measurand)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case SanPackage.MEASURAND__MEASURAND:
				return measurand != null;
		}
		return super.eIsSet(featureID);
	}

} //MeasurandImpl
