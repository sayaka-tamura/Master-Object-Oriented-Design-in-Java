package section2.dependencyInversionPrincipleAndTemplatePatternHomework.processes;

public abstract class GeneralManufacturingProcess {

    private String processName;

    public GeneralManufacturingProcess(String processName) {
        this.processName = processName;
    }

    public String getProcessName() {
        return processName;
    }

    //Template method
    public void launchProcess() {
        if (processName != null && !processName.isEmpty()) {
            assembleDevice();
            testDevice();
            packageDevice();
            storeDevice();
        } else {
            System.out.println("No process name was specified");
        }
    }

    protected abstract void assembleDevice();

    protected abstract void testDevice();

    protected abstract void packageDevice();

    protected abstract void storeDevice();
}
