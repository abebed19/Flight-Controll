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
        try{
            int numberEx = Integer.parseInt(sc.nextLine());
        }catch(NumberFormatException e){
            System.out.println(e.getMessage());
        }
        
        
    }
    
}
