/**
 */
package it.disim.univaq.demo.webapplication;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link it.disim.univaq.demo.webapplication.Property#isIsPK <em>Is PK</em>}</li>
 * </ul>
 *
 * @see it.disim.univaq.demo.webapplication.ModelPackage#getProperty()
 * @model
 * @generated
 */
public interface Property extends Named {
	/**
	 * Returns the value of the '<em><b>Is PK</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is PK</em>' attribute.
	 * @see #setIsPK(boolean)
	 * @see it.disim.univaq.demo.webapplication.ModelPackage#getProperty_IsPK()
	 * @model required="true"
	 * @generated
	 */
	boolean isIsPK();

	/**
	 * Sets the value of the '{@link it.disim.univaq.demo.webapplication.Property#isIsPK <em>Is PK</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is PK</em>' attribute.
	 * @see #isIsPK()
	 * @generated
	 */
	void setIsPK(boolean value);

} // Property
