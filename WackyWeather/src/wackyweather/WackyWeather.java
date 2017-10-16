/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wackyweather;
import java.util.Scanner;


/**
 *
 * @author Acer
 */
public class WackyWeather 
{
    public static void main(String[] args)
    {
        System.out.println("what is the temperature outside?");
        Scanner keyboard = new Scanner(System.in);
        int temperature = keyboard.nextInt();
        if(temperature > 30)
        {
            System.out.println("grab a swim wear");
        }
        else if(temperature >=20  && temperature <= 30)
        {
            System.out.println("wear shorts and a T-shirt");
        }
        else if(temperature >=0 && temperature <=20)
        {
            System.out.println("wear a sweater");
        }
        else if (temperature < 0)
         {
                    System.out.println("put on a jacket");
         }
    }
    
}
