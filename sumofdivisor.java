package wipro;
import java.util.*;
import java.io.*;
import java.lang.*;
public class properdivisors {
public static void main(String args[])
{
	int n,i,j=0,sum=0;
	int arr[]=new int[30];
	Scanner s=new Scanner(System.in);
	n=s.nextInt();
	for(i=1;i<n;i++)
	{
		if(n%i==0)
		{
			arr[j]=i;
			j++;
		}
	}
	for(i=0;i<j;i++)
	{
		sum=sum+arr[i];
	}
	System.out.println(sum);
}

}
