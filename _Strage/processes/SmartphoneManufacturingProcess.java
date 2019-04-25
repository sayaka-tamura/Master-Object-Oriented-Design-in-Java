package section2.dependencyInversionPrincipleAndTemplatePatternHomework.processes;

public class SmartphoneManufacturingProcess extends GeneralManufacturingProcess {

    public SmartphoneManufacturingProcess(String processName) {
        super(processName);
    }

    @Override
    protected void assembleDevice() {
        System.out.println("Assembled smartphone: " + getProcessName());
    }

    @Override
    protected void testDevice() {
        System.out.println("Tested smartphone: " + getProcessName());
    }

    @Override
    protected void packageDevice() {
        System.out.println("Packaged smartphone: " + getProcessName());
    }

    @Override
    protected void storeDevice() {
        System.out.println("Stored smartphone: " + getProcessName());
    }
}
