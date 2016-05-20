/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.basics.mathfunctions;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author HomeDev
 */
public class SimpleAreaCalculator {

    /**
     * @param args the command line arguments
     */    
    
    public static void main(String[] args) {        
        Scanner input = new Scanner(System.in);        
        String k;
        boolean cont = true;
        
        do{
        System.out.println("\n\n======[MENU======");
        System.out.println("[1]-Square");
        System.out.println("[2]-Rectangle");
        System.out.println("[3]-Triangle");
        System.out.println("[4]-Circle");
        System.out.println("[5]-Irregular Polygon");
        System.out.println("[6]-Exit");
        System.out.println("=================");
        System.out.print("Enter Selection: ");k = input.nextLine();
         
                
        
        switch(k){
            case "6":
                cont = false;
            default:
                Selection(k);
                break;
        }        
        }while(cont);
    }

    private static void Selection(String k) {
        switch(k){
            case "1":
                TwoSidedArea("sq");
                break;               
            case "2":
                TwoSidedArea("rec");
                break;               
            case "3":
                ThreeSidedArea("tri");                
                break;               
            case "4":
                CircleArea();
                 break;               
            case "5":
                IrregularArea();
                 break;               
            case "6":
                System.out.println("Exiting...");
                 break;     
            default:
                System.out.println("Nothing Selected");
                 break;     
        }
    }

    private static void TwoSidedArea(String ts) {
        Scanner input = new Scanner(System.in);
        double s1, s2;        
        
        switch(ts){
            case "sq":
                System.out.print("Please Enter Side Length:");
                s1 = input.nextDouble();
                System.out.println("\n The Area is: " + s1*s1 + " sq. units");
                break;
                
            case "rec":
                System.out.print("Please Enter Length:");
                s1 = input.nextDouble();
                System.out.print("Please Enter Width:");
                s2 = input.nextDouble();
                System.out.println("\n The Area is: " + s1*s2 + " sq. units");
                break;                
            default:
                System.out.println("\n Invalid Selection...");
                break;
        }
    }

    private static void ThreeSidedArea(String ts) {
        Scanner input = new Scanner(System.in);
        double  base, hyp;        
        
        switch(ts){                
            case "tri":
                System.out.print("Please Enter base:");
                base = input.nextDouble();
                System.out.print("Please Enter hyp:");
                hyp = input.nextDouble();
                System.out.println("\n The Area is: " + (base*hyp)/2 + " sq. units");
                break;                
            default:
                System.out.println("\n Invalid Selection...");
                break;
        }
    }

    private static void CircleArea() {
        Scanner input = new Scanner(System.in);
        double  rad;     
        double pie = 3.14159;
        
         System.out.print("Please Enter radius(d/2):");
         rad = input.nextDouble();                
         System.out.println("\n The Area is: " + pie*rad*rad + " sq. units");
    }

    private static void IrregularArea() {
        Scanner input = new Scanner(System.in);
        String k,k1 = "";
        double s1, s2, s3, s4;
        
        System.out.print("How Many Sides? (for circle input c):");        
        k = input.nextLine();
        
        switch(k){
            case "1":
                System.out.println("A Line has no Area.");        
                break;
            case "2":
                System.out.println("[s] - Square");        
                System.out.println("[r] - Rectangle");
                System.out.println("=================="); 
                System.out.print("Your Selection: ");
                k1 = input.nextLine();
                switch(k1){
                    case "s":
                        TwoSidedArea("sq");
                        break;
                        
                    case "r":
                        TwoSidedArea("rec");
                        break;
                        
                    default:
                        System.out.print("Invalid Selection, back to main...");        
                        break;
                }
                break;
            case "3":
                System.out.print("The functionality is not yet implemented...");                        
                break;
                
            case "4":                
                System.out.print("The functionality is not yet implemented...");                        
                break;
        }
    }
    
}
