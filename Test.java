/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FlightControl;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author aaron
 */
public class Test {
    public static void main(String... args){
        
        Scanner sc = new Scanner(System.in);
        
        ArrayList<String> demisClan = new ArrayList<>();
        try(Scanner file = new Scanner(new File("sample.txt"))){
            
            while(file.hasNextLine()){
                demisClan.add(file.nextLine());
            }
        }catch(Exception e){
            
            
        }
        
        System.out.println(demisClan);
        
        
        
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
