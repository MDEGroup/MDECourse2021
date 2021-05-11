/**
 */
package it.disim.univaq.demo.webapplication.impl;

import it.disim.univaq.demo.webapplication.Application;
import it.disim.univaq.demo.webapplication.Entity;
import it.disim.univaq.demo.webapplication.ModelPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Application</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link it.disim.univaq.demo.webapplication.impl.ApplicationImpl#getEnitities <em>Enitities</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ApplicationImpl extends NamedImpl implements Application {
	/**
	 * The cached value of the '{@link #getEnitities() <em>Enitities</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnitities()
	 * @generated
	 * @ordered
	 */
	protected EList<Entity> enitities;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ApplicationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.APPLICATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Entity> getEnitities() {
		if (enitities == null) {
			enitities = new EObjectContainmentEList<Entity>(Entity.class, this, ModelPackage.APPLICATION__ENITITIES);
		}
		return enitities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ModelPackage.APPLICATION__ENITITIES:
			return ((InternalEList<?>) getEnitities()).basicRemove(otherEnd, msgs);
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
		case ModelPackage.APPLICATION__ENITITIES:
			return getEnitities();
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
		case ModelPackage.APPLICATION__ENITITIES:
			getEnitities().clear();
			getEnitities().addAll((Collection<? extends Entity>) newValue);
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
		case ModelPackage.APPLICATION__ENITITIES:
			getEnitities().clear();
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
		case ModelPackage.APPLICATION__ENITITIES:
			return enitities != null && !enitities.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ApplicationImpl
