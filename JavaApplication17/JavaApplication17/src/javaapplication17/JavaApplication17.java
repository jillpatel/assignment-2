/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication17;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author sys
 */
public class JavaApplication17 extends Student{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double temp=0.0,temp1=0.0;
        //Enter The Value From the User and data Store in ArrayList
        ArrayList<Student> arr=new ArrayList<Student>();
        ArrayList arr1=new ArrayList();
        Student s1=new Student("");
        for(int i=0;i<5;i++)
        {
            Student s=new Student();
            arr.add(s);
        }
        
        //Display The Records
        System.out.println("Name  Course1 Course2 Course3 Course4 Course5");
       for(int i=0;i<5;i++)
       {
           arr.get(i).display();
       }
       
       //Display the Highest Avg Record
       for(int i=0;i<5;i++)
       {
            temp1=arr.get(i).avg();
            temp=s1.highestAvg(temp, temp1);
            arr1.add(arr.get(i).name);
            arr1.add(temp1);
       }
       
       for(int i=1;i<arr1.size();)
       {
           if(arr1.get(i).equals(temp))
           {
               System.out.println("The Student with highest aveage ("+arr1.get(i)+") is "+arr1.get(i-1));
           }
           i+=2;
       }
       
       //Display Record who has below 50% Avg
       for(int i=1;i<arr1.size();)
       {
           if(Double.parseDouble(arr1.get(i).toString())<50.0)
           {
               System.out.println("we are concerned with "+arr1.get(i-1)+" who has an avarage of "+arr1.get(i));
           }
           i+=2;
       }
    }
}
