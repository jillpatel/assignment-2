/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication17;

import java.util.Scanner;
import java.math.*;

/**
 *
 * @author sys
 */
public class Student {
    int m1,m2,m3,m4,m5;
    String name;

    public Student(String name) {
        this.name = name;
    }
    public Student() {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Student Name :");
        name=sc.nextLine();
        System.out.print("Enter Marks of Course1 :");
        m1=sc.nextInt();
        System.out.print("Enter Marks of Course2 :");
        m2=sc.nextInt();
        System.out.print("Enter Marks of Course3 :");
        m3=sc.nextInt();
        System.out.print("Enter Marks of Course4 :");
        m4=sc.nextInt();
        System.out.print("Enter Marks of Course5 :");
        m5=sc.nextInt();
        System.out.println("");
    }
    
    public void display()
    {
        System.out.print(name+"   ");
        System.out.print(m1+"\t");
        System.out.print(m2+"\t");
        System.out.print(m3+"\t");
        System.out.print(m4+"\t");
        System.out.print(m5+"\t\n");
    }
    public double avg()
    {
        double ans=(m1+m2+m3+m4+m5)/5;
        return ans;
    }
    public double highestAvg(double a,double b)
    {
        if(a>b)
            return a;
        else
            return b;
    }
}
