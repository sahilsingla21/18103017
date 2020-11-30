
package Assignment2;

import java.util.ArrayList;
public class HailStone {
    
    public Integer[] hailstone(int n){
        if(n <= 0)
            throw new IllegalArgumentException("n should be a positive integer");
        
        ArrayList<Integer> list = new ArrayList<>();
        while(n != 1){
            list.add(n);
            n = (n%2 == 0)? n/2: n*3+1;
        }
        
        return list.toArray(new Integer[list.size()]);
    }
    public static void main(String[] args) {

    }
    
}
