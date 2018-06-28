package wipro;
import java.util.*;
public class primeindices {
	
	public static void main(String args[])
	{
		int a[]=new int[10];
		int i,j,k=0,sum=0;
		Scanner s=new Scanner(System.in);
		for(i=0;i<10;i++)
		{
			a[i]=s.nextInt();
		}
		int b[]=new int[10];
	      for(i=3;i<10;i++)
		{
			for(j=2;j<10;j++)
			{
				if(i!=j)
				{
				if(i%j==0)
				{
					b[k]=i;
					k++;
					break;
				}
			}
		}
	}
	      sum=a[0]+a[1];
	      int sum1=0,n;
	      for(i=0;i<k;i++)
	      {
	    	  n=b[i];
	    	  sum1=sum1+a[n];
	      }
	      int sum3=sum+sum1;
	      System.out.println(sum3);

}
}
