import java.util.*;
public class Solution2{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the paragraph:");
        String para=sc.nextLine();
        System.out.println("Enter the words to markout seperated by space:");
        String markoutWords=sc.nextLine();
        ArrayList<String>words=new ArrayList<String>();
        StringBuilder sb=new StringBuilder();
        int n=markoutWords.length();
        int i=0;
        while(i<n)
        {
            if(markoutWords.charAt(i)==' ')
            {
            String str=sb.toString();
            words.add(str);
            sb=new StringBuilder();
            }
            else
            sb.append(markoutWords.charAt(i));
            i++;
        }
        String str=sb.toString();
        words.add(str);
        StringBuilder replaced;
        for(String x:words)
        {
            replaced = new StringBuilder();
            replaced.append(x.charAt(0));
            for(i=0; i<x.length()-1; ++i)
                replaced.append('*');
            x="\\b"+x+"\\b";
            para=para.replaceAll(x, replaced.toString());
        }
        System.out.println(para);
    }
}
