package wipro;
import java.util.*;
public class lastdigit {
   
	public static void main(String args[])
	{
		int n1;
		Scanner s=new Scanner(System.in);
		n1=s.nextInt();
		System.out.println(lastDig(n1));
	}
	public static int lastDig(int input1)
	{
		int rem=0;
		rem=Math.abs(input1 % 10);
		return rem;
	}
}
