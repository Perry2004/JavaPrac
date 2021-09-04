package Computer;

public class PersonalComputer extends Computer {
    protected String graphicCardModel;
    protected String  operationSystem;
    public PersonalComputer(){}
    public PersonalComputer(String name, String CPUModel, String graphicCardModel) {
        super(name,CPUModel);
        this.graphicCardModel = graphicCardModel;
    }
    public PersonalComputer(String name, String CPUModel) {
        super(name,CPUModel);
        graphicCardModel = "No information";
    }
    public PersonalComputer(String name) {
        super(name);
        graphicCardModel = "No information.";
    }
    public void report() {
        super.report();
        System.out.print("\tGraphic Card Model: "+graphicCardModel+" ");
    }
}
