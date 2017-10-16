/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dice;
import java.util.Scanner;
/**
 *
 * @author Acer
 */
public class Testingdice 
{
   public static void main(String [] args)
   {
       Scanner keyboard = new Scanner(System.in);
       dice die1 = new dice(6);
       dice die2 = new dice(6);
       System.out.println("die 1: %d \t die2: %d%n", die1.getfacevalue(), die2.getfacevalue());
       die1.rollDie();
       die2.rollDie();
       System.out.println("die 1: %d \t die2: %d%n", die1.getfacevalue(), die2.getfacevalue());
   }
}
