public class Odd {

	public static void main(String args[])
	{
		int n1;
		Scanner s=new Scanner(System.in);
		n1=s.nextInt();
		System.out.println(isOdd(n1));
	}
	
	public static int isOdd(int input1)
	{
		if(input1 % 2!=0)
		{
			return 2;
		}
		else if(input1 == 0)
		{
			return 1;
		}
		else 
		{
			return 1;
		}
	}
}
