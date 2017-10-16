/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package second.program;
import java.util.Scanner;
import java.lang.System;
/**
 *
 * @author Acer
 */
public class SecondProgram {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        String myName;
        System.out.print("what is your name");
        Scanner keyboard = new Scanner(System.in);
        myName = keyboard.nextLine();
        System.out.printf("glad to meet you %s%n",myName);
        
        int yearsofexperience;
        System.out.println("how many years of programming do you have?");
        /*scanner exp = new scanner(System.in);*/
        yearsofexperience = keyboard.nextLine();
        
    }
    
}
