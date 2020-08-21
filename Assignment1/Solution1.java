import java.util.*;
public class Solution1{
    public static String sortString(String inputString) { 
        char temp[] = inputString.toCharArray(); 
        Arrays.sort(temp); 
        return new String(temp); 
    } 
    public static boolean isAnagram(String patt,String str) {
        
        patt=sortString(patt);
        str=sortString(str);
        for(int i=0;i<patt.length();i++)
        {
            if(patt.charAt(i)!=str.charAt(i))
            return false;
        }
        return true;
    }
    public static void main(String []args) {
        Scanner sc=new Scanner(System.in);
        String patt,str;
        System.out.println("Enter the String:");
        str=sc.nextLine();
        System.out.println("Enter the Pattern to be Matched:");
        patt=sc.nextLine();

        int patt_hash=0,curr_hash=0;
        int s=0,e=(patt.length()-1);
        for(int i=0;i<patt.length();i++){
            patt_hash+=((int)patt.charAt(i));
            if(i<=e)
            curr_hash+=((int)str.charAt(i));
        }
        int n=str.length();
        int c=0;
        while(e<n-1){
            //System.out.println(curr_hash+" "+patt_hash);
            if(curr_hash==patt_hash)
            {
                if(isAnagram(patt,str.substring(s,e+1)))
                    c++;
            }
            curr_hash-=((int)str.charAt(s));
            curr_hash+=((int)str.charAt(e+1));
            s++;
            e++;
        }
        if(curr_hash==patt_hash){
                if(isAnagram(patt,str.substring(s,e+1)))
                    c++;
            }
        System.out.println(c);
    }
}
