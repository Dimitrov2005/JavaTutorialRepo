
import com.ProgrammingConcepts.debugging.impl.RubberDebugDuck;
import com.ProgrammingConcepts.glasses.impl.Glasses;
import com.ProgrammingConcepts.monitor.impl.Monitor;

public class Main {

    public static void main(String[] args) {
	// Test Monitor Class
        Monitor monitor = new Monitor("Philips", 1920, 1080, 60, 220);
        monitor.configureSlotsAndButtons(true, true, "power" );
        monitor.connectHdmiCable();
        monitor.turnOnMonitor();
        System.out.println("Finished testing Monitor");
        //Test Rubber Duck class

        RubberDebugDuck duck = new RubberDebugDuck();
        duck.setDuckOptions("Gosho", "yellow", true);
        duck.stayAndListenCodeExplanations("Gosho, tova e ....");
        System.out.println("Finished testing Duck");
        //Test Glasses class

        Glasses glasses = new Glasses();
        glasses.putOutOfCase();
        glasses.putOnHead();
        glasses.putInsideCase();
        System.out.println("Finished testing Glasses");
    }
}
