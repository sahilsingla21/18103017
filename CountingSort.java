/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment2;

import java.util.Arrays;

/**
 *
 * @author Suhel Naryal
 */
public class CountingSort {
    
    public void sort(int[] arr){
        int[] count = new int[21];
        
        for(int i: arr)
            count[i]++;
        
        int lo = 0;
        for(int i=0; i<21; ++i){
            int temp = lo;
            while(lo < temp+count[i])
                arr[lo++] = i;
        }
        
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int[] arr = {2,4,1,5,7,2,4,6,1,0};
        (new CountingSort()).sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    
}
