/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prompt.from.the.user;
import java.util.Scanner;

/**
 *
 * @author Acer
 */
public class PromptFromTheUser {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        System.out.println("please enter your favourtie app: ");
        Scanner keyboard = new Scanner(System.in);
        String app1 = keyboard.nextLine();
        
        
        System.out.println("pleas enter your favourti app:");
        String app2 = keyboard.nextLine();
        
        System.out.println("your favourite apps are :" +app1+"\n"+"and"+"\ns"+app2 + "\n");
        
    }
    
}
