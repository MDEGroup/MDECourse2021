package it.disim.univaq.demo.business;

import java.io.IOException;
import java.util.Collections;
import java.util.Map;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import it.disim.univaq.demo.webapplication.Application;
import it.disim.univaq.demo.webapplication.Entity;
import it.disim.univaq.demo.webapplication.ModelFactory;
import it.disim.univaq.demo.webapplication.ModelPackage;
import it.disim.univaq.demo.webapplication.Property;
import it.disim.univaq.demo.webapplication.Reference;

public class DemoBusiness {

	public static String getName() {
		return "Andrea";
	}
	
	public static Application create() {
		Application model = ModelFactory.eINSTANCE.createApplication();
		Entity entity1 = ModelFactory.eINSTANCE.createEntity();
		entity1.setName("entity1");
		Entity entity2 = ModelFactory.eINSTANCE.createEntity();
		entity2.setName("entity2");
		model.getEnitities().add(entity1);
		model.getEnitities().add(entity2);
		Property prop = ModelFactory.eINSTANCE.createProperty();
		prop.setName("prop1");
		prop.setIsPK(true);
		Reference ref = ModelFactory.eINSTANCE.createReference();
		ref.setRef(entity2);
		entity1.getProperties().add(ref);
		return model;
	}
	public static boolean validate(Application wm) {
		Diagnostic diagnostic = Diagnostician.INSTANCE.validate(wm);
		if (diagnostic.getSeverity() == Diagnostic.ERROR)
			return false;
		else
			return true;
	}
	
	public static void main (String [] args) {
		Application app = create();
		serializeModel(app, "testLiveMDE.xmi");
		Application app2 = load("testLiveMDE.xmi");
		System.out.println(validate(app2)?"Valid":"Invalid");
		System.out.println(app.getEnitities().size());
		app.getEnitities().forEach(z->System.out.println(z.getName()));
	}
	
	public static Application load(String fileName) {
		EPackage.Registry.INSTANCE.put(ModelPackage.eNS_URI, ModelPackage.eINSTANCE);
		ResourceSet resSet = new ResourceSetImpl();
		Resource resource = resSet.getResource(URI.createURI(fileName), true);
		// Get the first model element and cast it to the right type, in my
		// example everything is hierarchical included in this first node
		Application myWeb = (Application) resource.getContents().get(0);
		System.out.println(myWeb);
		return myWeb;
	}
	
	public static void serializeModel(Application wm, String fileName) {
		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
		Map<String, Object> m = reg.getExtensionToFactoryMap();
		m.put("xmi", new XMIResourceFactoryImpl());

		// Obtain a new resource set
		ResourceSet resSet = new ResourceSetImpl();

		// create a resource
		Resource resource = resSet.createResource(URI.createURI(fileName));
		resource.getContents().add(wm);

		// now save the content.
		try {
			resource.save(Collections.EMPTY_MAP);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
