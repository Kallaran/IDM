/*
 * generated by Xtext 2.25.0
 */
package org.xtext.example.mydsl1;


/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
public class MyDslStandaloneSetup extends MyDslStandaloneSetupGenerated {

	public static void doSetup() {
		new MyDslStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}
