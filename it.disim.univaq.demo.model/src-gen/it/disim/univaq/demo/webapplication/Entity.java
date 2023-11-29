/**
 */
package it.disim.univaq.demo.webapplication;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Entity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link it.disim.univaq.demo.webapplication.Entity#getProperties <em>Properties</em>}</li>
 * </ul>
 *
 * @see it.disim.univaq.demo.webapplication.ModelPackage#getEntity()
 * @model
 * @generated
 */
public interface Entity extends Named {
	/**
	 * Returns the value of the '<em><b>Properties</b></em>' containment reference list.
	 * The list contents are of type {@link it.disim.univaq.demo.webapplication.Property}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Properties</em>' containment reference list.
	 * @see it.disim.univaq.demo.webapplication.ModelPackage#getEntity_Properties()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Property> getProperties();

} // Entity
