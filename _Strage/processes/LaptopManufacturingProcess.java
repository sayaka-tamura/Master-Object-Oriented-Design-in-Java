package section2.dependencyInversionPrincipleAndTemplatePatternHomework.processes;

public class LaptopManufacturingProcess extends GeneralManufacturingProcess {

    public LaptopManufacturingProcess(String processName) {
        super(processName);
    }

    @Override
    protected void assembleDevice() {
        System.out.println("Assembled laptop: " + getProcessName());
    }

    @Override
    protected void testDevice() {
        System.out.println("Tested laptop: " + getProcessName());
    }

    @Override
    protected void packageDevice() {
        System.out.println("Packaged laptop: " + getProcessName());
    }

    @Override
    protected void storeDevice() {
        System.out.println("Stored laptop: " + getProcessName());
    }
}
