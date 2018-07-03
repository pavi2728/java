package wipro;
import java.io.*;
import java.util.*;
import java.lang.*;
public class correctoperator {
	public static void main(String args[])
	{
		String a;
        Scanner s=new Scanner(System.in);
        a=s.nextLine();
        String b = "(\\+|\\-|\\*|/|=)";
        String c[]=a.split(b);
        Integer[] d=new Integer[c.length];
        int i=0;
        for(String str:c){
            d[i]=Integer.parseInt(str);
            i++;
        }
        if(d[0]+d[1]==d[2])
        {
        	System.out.println('+');
        }
        if(d[0]-d[1]==d[2])
        {
        	System.out.println('-');
        }
        if(d[0]*d[1]==d[2])
        {
        	System.out.println('*');
        }
        if(d[0]/d[1]==d[2])
        {
        	System.out.println('/');
        }
        }

}
