package week1.day2;

public class Assignment3Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Finding the factorial

		int num = 5;
		int fact =1;
		for (int i=num;i>0;i--)
		{
			fact = fact *i;

		}System.out.println("Factorial of "+num+" is " +fact);
	}

}
