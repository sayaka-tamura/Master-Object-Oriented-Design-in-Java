/**
 * @author : Sayaka Tamura
 * Apr 26, 2019
 * Udemy Master Object Oriented Design in Java
 * Section 3, Lecture 20
 * Dependency Inversion & Template Pattern
 */
package section3.dependencyInversion_TemplateDesign.clients;

import section3.dependencyInversion_TemplateDesign.processes.GeneralManufacturingProcess;
import section3.dependencyInversion_TemplateDesign.processes.SmartphoneManufacturingProcess;

public class DeviceFactory {
	public static void main(String[] args) {
		GeneralManufacturingProcess manufacturer = new SmartphoneManufacturingProcess("IPhone Process");
		manufacturer.launchProcess();
	}
}
