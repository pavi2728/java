package wipro;
import java.util.*;


public class LastDigits {
	
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		int n1,n2;
		n1=s.nextInt();
		n2=s.nextInt();
		System.out.println(addLastDigits(n1,n2));
	}


public static int addLastDigits(int input1,int input2)
{
	int rem1,rem2;
	rem1=Math.abs(input1%10);
	rem2=Math.abs(input2%10);
	return rem1+rem2;
}
}
