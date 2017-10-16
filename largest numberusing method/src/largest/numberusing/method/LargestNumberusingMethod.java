/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package largest.numberusing.method;
import java.util.Scanner;
 
class LargestOfThreeNumbers
{
   public static void main(String args[])
   {
      int no1, no2, no3;
      System.out.println("Enter three integers ");
      Scanner in = new Scanner(System.in);
 
      no1 = in.nextInt();
      no2 = in.nextInt();
      no3 = in.nextInt();
 
      if ( no1 > no2 && no1 > no3 )
         System.out.println("First number is bigger.");
      else if ( no2 > no1 && no2 > no3 )
         System.out.println("Second number is bigger.");
      else if ( no3 > no1 && no3 > no2 )
         System.out.println("Third number is bigger.");
      else   
         System.out.println("Enter a valid number.");
   }
}
    
