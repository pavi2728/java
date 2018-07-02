package manju;
import java.util.*;
import java.io.*;
import java.lang.*;
public class frequentdig {
	public static void main(String args[])
	{
		String a,b,c,d;
		Scanner s=new Scanner(System.in);
		a=s.next();
		b=s.next();
		c=s.next();
		d=s.next();
	    String e=a+b+c+d;
	    int x[]=new int[10];
	    int i,max=0,index=0;
	    for(i=0;i<e.length();i++)
	    {
	    	x[e.charAt(i)-48]++;
	    }
	    max=x[0];
	    for(i=9;i>=0;i--)
	    {
	     	if(max<x[i])
	     	{
	     		max=x[i];
	     		index=i;
	     	}
	    }
	    System.out.println(index);
	    
	}

}
