package FlightControl;

import FlightControl.logic.FlightControl;
import java.util.Scanner;
import ui.TextUI;


public class Main {

    public static void main(String[] args) {
        FlightControl controller = new FlightControl();
        Scanner sc = new Scanner(System.in);
        TextUI  userInterface = new TextUI(controller,sc);
        userInterface.start();
        // Write the main program here. It is useful to create some classes of your own.
    }
}
