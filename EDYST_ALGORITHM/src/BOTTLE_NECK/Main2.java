package BOTTLE_NECK;

import java.util.*;
class Main2
{
    static String revword(String str)
    {
        int len=str.length();
        int i=1;
        int j=str.length()-2;
        char[] strchar=str.toCharArray();
        while(i<j)
        {
            char temp=strchar[i];
            strchar[i]=strchar[j];
            strchar[j]=temp;
            i++;
            j--;
        }
        str=new String(strchar);
        return str;
    }
    static void revwords(String str)
    {
       String[] to=str.split("\\s");
        for(String w:to)
        {
            System.out.print(revword(w)+" ");
        }
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t,k;
        t=sc.nextInt();
        for(k=0;k<=t;k++)
        {
         String str1=sc.nextLine();
         revwords(str1);
         System.out.println();
        }
    }
}