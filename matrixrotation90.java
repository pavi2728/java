package wipro;
import java.util.*;
import java.io.*;
import java.lang.*;
public class matrixrotation {
public static void main(String args[])	
{
	Scanner s=new Scanner(System.in);
	int m,n;
	m=s.nextInt();
	n=s.nextInt();
	int a[][]=new int[10][10];
	int b[][]=new int[10][10];
	int i,j;
	for(i=0;i<m;i++)
	{
		for(j=0;j<n;j++)
		{
			a[i][j]=s.nextInt();
		}
	}
	for(i=0;i<n;i++)
	{
		for(j=0;j<m;j++)
		{
			b[i][j]=a[j][i];
			
		}
	}
	for(i=m-1;i>=0;i--)
	{
		for(j=0;j<n;j++)
		{
			System.out.println(b[i][j]+" ");
		}
		System.out.println("\n");
	}
}

}
