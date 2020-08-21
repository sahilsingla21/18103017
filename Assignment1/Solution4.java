import java.util.*;
public class Solution4
{
    private static String sortString(String s) { 
        char temp[] = s.toCharArray(); 
        Arrays.sort(temp); 
        return new String(temp); 
    } 
    private static boolean isAnagram(String patt,String str) {
        
        patt=sortString(patt);
        str=sortString(str);
        for(int i=0;i<patt.length();i++)
        {
            if(patt.charAt(i)!=str.charAt(i))
            return false;
        }
        return true;
    }
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        String s1,s2;
        boolean res;
        System.out.println("Enter String 1:");
        s1=sc.nextLine();
        System.out.println("Enter String 2:");
        s2=sc.nextLine();
        res=isAnagram(s1,s2);
        if(res)
        System.out.println("The given strings are Anagrams");
        else
        System.out.println("The given strings are not Anagrams");
    }
}
