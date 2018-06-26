package javaapplication1;
import java.util.*;
public class JavaApplication1 {

    public static void main(String[] args) {
        
        int arr[];
        int i,n,sum,j,count=0;
        Scanner s=new Scanner(System.in);
        n=s.nextInt();
        arr=new int[100];
        for(i=0;i<n;i++)
        {
            arr[i]=s.nextInt();
        }
        sum=s.nextInt();
        for(i=0;i<n;i++)
        {
            for(j=i+1;j<n;j++)
            {
                if((arr[i]+arr[j])==sum)
                {
                    count++;
                    System.out.print("("+arr[i]+","+arr[j]+")"+" ");
                }
                
            }
        }
        if(count==0)
                {
                   System.out.println("-1");
                }
                
        
    }
    
}
