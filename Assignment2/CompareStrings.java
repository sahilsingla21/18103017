/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment2;

import java.util.Scanner;

/**
 *
 * @author Suhel Naryal
 */
public class CompareStrings {
    
    public int compare(String a, String b){
        if(a == null || b == null)
            throw new NullPointerException("Argument strings can't be null.");
        
        if(a.isEmpty() && b.isEmpty())
            return 0;
        else if(a.isEmpty())
            return -1;
        else if(b.isEmpty())
            return +1;
        
        int cLength = Math.min(a.length(), b.length());
        
        for(int i=0; i<cLength; ++i)
            if(a.charAt(i) != b.charAt(i))
                return a.charAt(i) - b.charAt(i);
        
        return a.length() - b.length();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Program to compare two strings");
        System.out.print("Enter first string: ");
        String a = sc.nextLine();
        System.out.print("Enter second string: ");
        String b = sc.nextLine();
        
        int res = (new CompareStrings()).compare(a, b);
        System.out.println("First String is " + 
                ((res < 0)? "Smaller than ": (res > 0)? "Greater than ": "Equal to ") + 
                "second string");
    }
    
}
