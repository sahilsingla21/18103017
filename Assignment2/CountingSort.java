
package Assignment2;

import java.util.Arrays;
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

    public static void main(String[] args) {
        
        int[] arr = {2,4,1,5,7,2,4,6,1,0};
        (new CountingSort()).sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    
}
