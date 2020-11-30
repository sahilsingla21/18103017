package Assignment2;

import java.util.Scanner;
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
    public static void main(String[] args) {
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
