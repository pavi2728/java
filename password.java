package wipro;
import java.util.*;

public class Password {
	public static void main(String args[])
	{
	String p;
	Scanner s=new Scanner(System.in);
	p=s.nextLine();
    char a[]=p.toCharArray();
    int i,l=0,u=0,d=0,c=0;
    for(i=0;i<a.length;i++)
    {
    	if(a[i]>='a' && a[i]<='z')
    	{
    		l++;
    	}
    	if(a[i]>='A' && a[i]<='Z')
    	{
    		u++;
    	}
    	if(a[i]>='0' && a[i]<='9')
    	{
    		d++;
    	}
    	if(a[i]>=33 && a[i]<=64)
    	{
    		c++;
    	}
    }
	if((a.length >=8) && (u>=1) && (l>=1) && (d>=1) && (c>=1))
	{
		System.out.println("Strong");
	}
	else if((a.length >=6) && (u>=1) && (l>=1) && (c>=1))
	{
		System.out.println("Moderate");
	}
	else
	{
		System.out.println("Weak");
	}
	}
}
	
	
