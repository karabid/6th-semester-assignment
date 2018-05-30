import java.io.*;
import java.util.*;
class git3
{
     static void occurenceCount( String s,int lengt)
     {
         int i,j,k,find;
         for(i=0;i<lengt;i++)
         {
                find=0;
                for(j=0;j<i;j++)
                {
                        if(s.charAt(j)==s.charAt(i))
                        {
                                  find++;
                        }
                }
                if(find==0)
                {
                        for(k=0;k<lengt;k++)
                        {
                                  if(s.charAt(k)==s.charAt(i))
                                  {
                                        find++;
                                  }
                        }
                        System.out.println("Occurence of "+s.charAt(i)+ "is = " + find);
                }
                               
                
          }
     }
     static void altCapitalization(String s,int lengt)
     {
          int i;
          System.out.print("The output string after capitalization is = ");
          for(i=0;i<lengt;i++)
          {
                 if(i%2==0)
                 {
                        System.out.print(Character.toUpperCase(s.charAt(i)));
                 }
                 if(i%2==1)
                 {
                        System.out.print(Character.toLowerCase(s.charAt(i)));
                 }
                        
           }
     }     
     public static void main(String args[])
     {
         try
         {
                BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
                String s;
                System.out.println("Enter the string ");
                s=br.readLine();
                int len;
                len=s.length();
                if(len==0)
                System.out.println("Please enter avalid string");
                occurenceCount(s,len);
                altCapitalization(s,len);
         
         }
         catch( Exception e)
         {
                System.out.println("I/O error.");
         }
     }
}
