/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numberchecker;
import java.util.Scanner;
/**
 *
 * @author Acer
 */
public class Numberchecker {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        System.out.println("enter a number:");
        Scanner keyboard = new Scanner(System.in);
         int no1 = keyboard.nextInt();
        if(no1 < 10)
        {
            System.out.println("thats is a small number");
        }
        else if(no1 > 10)
        {
            System.out.println("nice number20");
        }
    }
    
}
