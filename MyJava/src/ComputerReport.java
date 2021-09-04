import Computer.*;
public class ComputerReport {
    public static void main(String[] args) {
        Computer ENIACT = new Computer("ENIACT");
        ENIACT.report();
        
        PersonalComputer lenovo = new PersonalComputer("Lenovo");
        lenovo.report();
        // lenovo.getClassName();

        Mac mbp = new Mac("MBP");
        mbp.report();

        WindowsComputer surface = new WindowsComputer("Surface");
        surface.report();
    }
}
