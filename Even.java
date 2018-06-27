package wipro;
import java.util.*;
public class Even {
	public static void main(String args[])
	{
		int n1;
		Scanner s=new Scanner(System.in);
		n1=s.nextInt();
		System.out.println(isEven(n1));
	}
	
	public static int isEven(int input1)
	{
		if(input1 % 2==0)
		{
			return 2;
		}
		else if(input1 == 0)
		{
			return 2;
		}
		else 
		{
			return 1;
		}
	}

}
