package Computer;

public class Computer implements Reportable {
    protected String name;String CPUModel;
    public String className = "Computer";
    public Computer(String name, String CPUModel) {
        this.name = name;
        this.CPUModel = CPUModel;
    }
    public Computer(String name) {
        this.name = name;
        this.CPUModel = "No information. ";
    }
    public Computer() {}

    public void report() {
        System.out.println("\n"+this.getClass().getName());
        System.out.print("Name: "+name+"\tCPU Model: "+CPUModel+" ");
    }
}