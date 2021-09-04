package Computer;

public class Mac extends PersonalComputer {
    protected String operationSystem;
    public Mac() {}
    public Mac(String name) {
        super(name);
        operationSystem = "MacOSX";
    }
    public Mac(String name, String CPUModel) {
        super(name,CPUModel);
        operationSystem = "MacOSX";
    }
    public void report() {
        super.report();
        System.out.print("\tOperation System: "+operationSystem+" ");
    }
}
