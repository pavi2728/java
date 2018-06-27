package wipro;
import java.util.*;
public class Secondlastdigit {
	
	public static void main(String args[])
	{
		int n1;
		Scanner s=new Scanner(System.in);
		n1=s.nextInt();
		System.out.println(secondLastDigit(n1));
	}
	 public static int secondLastDigit(int input1)
	 {
		 if(String.valueOf(input1).length() <=1 )
		 {
			 return -1;
		 }
		 else
		 {
		 int rem;
		 rem= Math.abs(input1 % 10);
		 input1=input1/10;
		 rem=Math.abs(input1 % 10);
		 return rem;
		 }
		 
	 }

}
