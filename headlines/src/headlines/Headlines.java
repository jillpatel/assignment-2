/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package headlines;
import java.util.Scanner;
/**
 *
 * @author Acer
 */
public class Headlines {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        System.out.println("what is the world news headline today?");
        Scanner bananaphone = new Scanner(System.in);
        String worldnews = bananaphone.nextLine();
        System.out.println("the world news headline is",worldnews);
        
        System.out.println("what is the sports headlines?");
        String sports = bananaphone.nextLine();
        System.out.println("the sports headline is",sports);
        
        System.out.println("what is the weather headlines?");
        String weather = bananaphone.nextLine();
        System.out.println("the sports headline is",weather);
        
        System.out.println("what is the politics headlines?");
        String politics = bananaphone.nextLine();
        System.out.println("the sports headline is",politics);
    }
    
}
