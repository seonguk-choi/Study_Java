import java.security.Security;

import javax.swing.JOptionPane;

public class Input_and_Output {

	public static void main(String[] args) {
	
		String path = JOptionPane.showInputDialog("Enter a id");
        string bright = JOptionPane.showInputDialog("Enter a id");
        // Elevator call 
        Elevator myElevator = new Elevator(id);
        myElevator.callForUp(1);
         
        // Security off 
        Security mySecurity = new Security(id);
        mySecurity.off();
         
        // Light on
        Lighting hallLamp = new Lighting(id+" / Hall Lamp");
        hallLamp.on();
         
        Lighting floorLamp = new Lighting(id+" / floorLamp");
        floorLamp.on();
         
        DimmingLights moodLamp = new DimmingLights(id+" moodLamp");
        moodLamp.setBright(Double.parseDouble(bright));
        moodLamp.on();
	}

}
