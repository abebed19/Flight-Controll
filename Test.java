/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FlightControl;

import java.util.Scanner;

/**
 *
 * @author aaron
 */
public class Test {
    public static void main(String... args){
        
        Scanner sc = new Scanner(System.in);
        while (true) {
        System.out.print("Give a number: ");

        try {
            int readNumber = Integer.parseInt(sc.nextLine());
            System.out.println(readNumber);
        } catch (Exception e) {
            System.out.println("User input was not a number.");
        }
    }
   
    }
    
}
