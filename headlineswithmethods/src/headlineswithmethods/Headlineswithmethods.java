/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package headlineswithmethods;
import java.util.Scanner;
/**
 *
 * @author Acer
 */
public class Headlineswithmethods {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        
    }
    public static String getheadline(String subject)
    {
        System.out.println("what is th headline today?" , subject);
        Scanner keyboard = new Scanner(System.in);
        return keyboard.nextLine();
    }
    
}
