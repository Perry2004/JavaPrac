package Computer;

public class WindowsComputer extends PersonalComputer {
    protected String operationSysString;
    public WindowsComputer() {}
    public WindowsComputer(String name) {
        super(name);
        operationSystem = "Windows";
    }
    public WindowsComputer(String name, String CPUModel) {
        super(name,CPUModel);
        operationSystem = "Windows";
    }
    public void report() {
        super.report();
        System.out.print("\tOperation System: "+operationSystem+"\n");
    }
}