/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itexps.bdd1;

/**
 *
 * @author Owner
 */
public class Calculator {
    public double add(double n1, double n2){
        return n1+n2;
    }
    
    public double subtract(double n1, double n2){
        return n1-n2;
    }
    
    public double multiply(double n1, double n2){
        return n1*n2;
    }
    public double divide(double n1, double n2){
        return n1/n2;
    }
    
    public static int mystery(int n)
    {
        if (n==0)
            return 1;
        else
            return 3 * mystery(n - 1);
    }
    public static void changer(String x, int y)
    {
        x=x+ "peace";
        y= 5+ y * 2;
       }
    
    public static void f(int a, int b)
    {
        if (a/b != 0)
        f(a/b,b);
        System.out.print(a % b);
    }

    public static void main(String[] args){
        //System.out.println(mystery(5));
        String s="world";
        int n=6;
        changer(s,n);
        System.out.println(s);
        f(4,2);
        
    }
    
    
}
