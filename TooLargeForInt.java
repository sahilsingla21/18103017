/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment2;

/**
 *
 * @author Suhel Naryal
 */
public class TooLargeForInt {
    
    public int findN(){
        long sum = 0;
        int i = 1;
        while(sum <= Integer.MAX_VALUE)
            sum += i++;
        
        return i;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(new TooLargeForInt().findN());
    }
    
}
