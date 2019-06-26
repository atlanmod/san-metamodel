/**
 */
package San.impl;

import San.Binding;
import San.Device;
import San.Instrument;
import San.Measurand;
import San.Measure;
import San.Network;
import San.SanPackage;
import San.Trigger;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Network</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link San.impl.NetworkImpl#getUri <em>Uri</em>}</li>
 *   <li>{@link San.impl.NetworkImpl#getPort <em>Port</em>}</li>
 *   <li>{@link San.impl.NetworkImpl#getProcesses <em>Processes</em>}</li>
 *   <li>{@link San.impl.NetworkImpl#getDevices <em>Devices</em>}</li>
 *   <li>{@link San.impl.NetworkImpl#getInstruments <em>Instruments</em>}</li>
 *   <li>{@link San.impl.NetworkImpl#getMeasurands <em>Measurands</em>}</li>
 *   <li>{@link San.impl.NetworkImpl#getMeasures <em>Measures</em>}</li>
 *   <li>{@link San.impl.NetworkImpl#getBindings <em>Bindings</em>}</li>
 *   <li>{@link San.impl.NetworkImpl#getTriggers <em>Triggers</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NetworkImpl extends NamedElementImpl implements Network {
	/**
	 * The default value of the '{@link #getUri() <em>Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUri()
	 * @generated
	 * @ordered
	 */
	protected static final String URI_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUri() <em>Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUri()
	 * @generated
	 * @ordered
	 */
	protected String uri = URI_EDEFAULT;

	/**
	 * The default value of the '{@link #getPort() <em>Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPort()
	 * @generated
	 * @ordered
	 */
	protected static final String PORT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPort() <em>Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPort()
	 * @generated
	 * @ordered
	 */
	protected String port = PORT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getProcesses() <em>Processes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcesses()
	 * @generated
	 * @ordered
	 */
	protected EList<San.Process> processes;

	/**
	 * The cached value of the '{@link #getDevices() <em>Devices</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDevices()
	 * @generated
	 * @ordered
	 */
	protected EList<Device> devices;

	/**
	 * The cached value of the '{@link #getInstruments() <em>Instruments</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstruments()
	 * @generated
	 * @ordered
	 */
	protected EList<Instrument> instruments;

	/**
	 * The cached value of the '{@link #getMeasurands() <em>Measurands</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeasurands()
	 * @generated
	 * @ordered
	 */
	protected EList<Measurand> measurands;

	/**
	 * The cached value of the '{@link #getMeasures() <em>Measures</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeasures()
	 * @generated
	 * @ordered
	 */
	protected EList<Measure> measures;

	/**
	 * The cached value of the '{@link #getBindings() <em>Bindings</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBindings()
	 * @generated
	 * @ordered
	 */
	protected EList<Binding> bindings;

	/**
	 * The cached value of the '{@link #getTriggers() <em>Triggers</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTriggers()
	 * @generated
	 * @ordered
	 */
	protected EList<Trigger> triggers;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NetworkImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SanPackage.Literals.NETWORK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUri() {
		return uri;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUri(String newUri) {
		String oldUri = uri;
		uri = newUri;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SanPackage.NETWORK__URI, oldUri, uri));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPort() {
		return port;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPort(String newPort) {
		String oldPort = port;
		port = newPort;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SanPackage.NETWORK__PORT, oldPort, port));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<San.Process> getProcesses() {
		if (processes == null) {
			processes = new EObjectContainmentEList<San.Process>(San.Process.class, this, SanPackage.NETWORK__PROCESSES);
		}
		return processes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Device> getDevices() {
		if (devices == null) {
			devices = new EObjectContainmentEList<Device>(Device.class, this, SanPackage.NETWORK__DEVICES);
		}
		return devices;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Instrument> getInstruments() {
		if (instruments == null) {
			instruments = new EObjectContainmentEList<Instrument>(Instrument.class, this, SanPackage.NETWORK__INSTRUMENTS);
		}
		return instruments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Measurand> getMeasurands() {
		if (measurands == null) {
			measurands = new EObjectContainmentEList<Measurand>(Measurand.class, this, SanPackage.NETWORK__MEASURANDS);
		}
		return measurands;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Measure> getMeasures() {
		if (measures == null) {
			measures = new EObjectContainmentEList<Measure>(Measure.class, this, SanPackage.NETWORK__MEASURES);
		}
		return measures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Binding> getBindings() {
		if (bindings == null) {
			bindings = new EObjectContainmentEList<Binding>(Binding.class, this, SanPackage.NETWORK__BINDINGS);
		}
		return bindings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Trigger> getTriggers() {
		if (triggers == null) {
			triggers = new EObjectContainmentEList<Trigger>(Trigger.class, this, SanPackage.NETWORK__TRIGGERS);
		}
		return triggers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SanPackage.NETWORK__PROCESSES:
				return ((InternalEList<?>)getProcesses()).basicRemove(otherEnd, msgs);
			case SanPackage.NETWORK__DEVICES:
				return ((InternalEList<?>)getDevices()).basicRemove(otherEnd, msgs);
			case SanPackage.NETWORK__INSTRUMENTS:
				return ((InternalEList<?>)getInstruments()).basicRemove(otherEnd, msgs);
			case SanPackage.NETWORK__MEASURANDS:
				return ((InternalEList<?>)getMeasurands()).basicRemove(otherEnd, msgs);
			case SanPackage.NETWORK__MEASURES:
				return ((InternalEList<?>)getMeasures()).basicRemove(otherEnd, msgs);
			case SanPackage.NETWORK__BINDINGS:
				return ((InternalEList<?>)getBindings()).basicRemove(otherEnd, msgs);
			case SanPackage.NETWORK__TRIGGERS:
				return ((InternalEList<?>)getTriggers()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SanPackage.NETWORK__URI:
				return getUri();
			case SanPackage.NETWORK__PORT:
				return getPort();
			case SanPackage.NETWORK__PROCESSES:
				return getProcesses();
			case SanPackage.NETWORK__DEVICES:
				return getDevices();
			case SanPackage.NETWORK__INSTRUMENTS:
				return getInstruments();
			case SanPackage.NETWORK__MEASURANDS:
				return getMeasurands();
			case SanPackage.NETWORK__MEASURES:
				return getMeasures();
			case SanPackage.NETWORK__BINDINGS:
				return getBindings();
			case SanPackage.NETWORK__TRIGGERS:
				return getTriggers();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SanPackage.NETWORK__URI:
				setUri((String)newValue);
				return;
			case SanPackage.NETWORK__PORT:
				setPort((String)newValue);
				return;
			case SanPackage.NETWORK__PROCESSES:
				getProcesses().clear();
				getProcesses().addAll((Collection<? extends San.Process>)newValue);
				return;
			case SanPackage.NETWORK__DEVICES:
				getDevices().clear();
				getDevices().addAll((Collection<? extends Device>)newValue);
				return;
			case SanPackage.NETWORK__INSTRUMENTS:
				getInstruments().clear();
				getInstruments().addAll((Collection<? extends Instrument>)newValue);
				return;
			case SanPackage.NETWORK__MEASURANDS:
				getMeasurands().clear();
				getMeasurands().addAll((Collection<? extends Measurand>)newValue);
				return;
			case SanPackage.NETWORK__MEASURES:
				getMeasures().clear();
				getMeasures().addAll((Collection<? extends Measure>)newValue);
				return;
			case SanPackage.NETWORK__BINDINGS:
				getBindings().clear();
				getBindings().addAll((Collection<? extends Binding>)newValue);
				return;
			case SanPackage.NETWORK__TRIGGERS:
				getTriggers().clear();
				getTriggers().addAll((Collection<? extends Trigger>)newValue);
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
			case SanPackage.NETWORK__URI:
				setUri(URI_EDEFAULT);
				return;
			case SanPackage.NETWORK__PORT:
				setPort(PORT_EDEFAULT);
				return;
			case SanPackage.NETWORK__PROCESSES:
				getProcesses().clear();
				return;
			case SanPackage.NETWORK__DEVICES:
				getDevices().clear();
				return;
			case SanPackage.NETWORK__INSTRUMENTS:
				getInstruments().clear();
				return;
			case SanPackage.NETWORK__MEASURANDS:
				getMeasurands().clear();
				return;
			case SanPackage.NETWORK__MEASURES:
				getMeasures().clear();
				return;
			case SanPackage.NETWORK__BINDINGS:
				getBindings().clear();
				return;
			case SanPackage.NETWORK__TRIGGERS:
				getTriggers().clear();
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
			case SanPackage.NETWORK__URI:
				return URI_EDEFAULT == null ? uri != null : !URI_EDEFAULT.equals(uri);
			case SanPackage.NETWORK__PORT:
				return PORT_EDEFAULT == null ? port != null : !PORT_EDEFAULT.equals(port);
			case SanPackage.NETWORK__PROCESSES:
				return processes != null && !processes.isEmpty();
			case SanPackage.NETWORK__DEVICES:
				return devices != null && !devices.isEmpty();
			case SanPackage.NETWORK__INSTRUMENTS:
				return instruments != null && !instruments.isEmpty();
			case SanPackage.NETWORK__MEASURANDS:
				return measurands != null && !measurands.isEmpty();
			case SanPackage.NETWORK__MEASURES:
				return measures != null && !measures.isEmpty();
			case SanPackage.NETWORK__BINDINGS:
				return bindings != null && !bindings.isEmpty();
			case SanPackage.NETWORK__TRIGGERS:
				return triggers != null && !triggers.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (uri: ");
		result.append(uri);
		result.append(", port: ");
		result.append(port);
		result.append(')');
		return result.toString();
	}

} //NetworkImpl
