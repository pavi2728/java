package manju;
import java.io.*;
import java.util.*;
import java.lang.*;
public class Pin {
	public static void main(String [] arg) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		String s=Integer.toString(a)+Integer.toString(b)+Integer.toString(c);
		int x[]=new int[3];
		int p[]=new int[4];
		int i=0,j,r,u,t,h,m;
		switch(i) {
		case 0:
			x[0]=a%10;
			a=a/10;
			x[1]=b%10;
			b=b/10;
			x[2]=c%10;
			c=c/10;
			Arrays.sort(x);
			p[3]=x[0];
		case 1:
			x[0]=a%10;
			a=a/10;
			x[1]=b%10;
			b=b/10;
			x[2]=c%10;
			c=c/10;
			Arrays.sort(x);
			p[2]=x[0];
		case 2:
			x[0]=a;
			x[1]=b;
			x[2]=c;
			Arrays.sort(x);
			p[1]=x[0];
		case 3:
			char y[]=s.toCharArray();
			Arrays.sort(y);
			int l=y.length;
			p[0]=y[l-1]-48;
		}
