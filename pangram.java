package javaapplication1;
import java.util.*;
public class JavaApplication1 {

    public static void main(String[] args) {
        
        Scanner s=new Scanner(System.in);
        String a=s.nextLine().toLowerCase();
        a=a.replaceAll(" ", "");
        int b[],c=0;
        b=new int[26];
        if(a.length()<26)
        {
            System.out.println("Not a pangram");
        }
        else
        {
          for(int i=0;i<a.length();i++)  
          {
              b[a.charAt(i)-97]++;
          }
          for(int i=0;i<26;i++)
          {
              if(b[i]==0)
              {
                  System.out.println("Not pangram");
                  break;
              }
              else
              {
                  c++;
              }
          }
          if(c==26)
          {
              System.out.println("Pangram");
          }
        }
    }
}
  
