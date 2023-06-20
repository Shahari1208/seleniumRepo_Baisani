package week1.day2;

public class Assignment4_Fibonacci {

	public static void main(String[] args) {
		// Fibonacci for range of 8 : 0 1 1 2 3 5 8 13

		int Range = 8;
		int firstnum = 0;
		int secondnum= 1;
		System.out.println(firstnum);
		System.out.println(secondnum);
		for (int i=1;i<=Range-2;i++)
		{

			int sum = firstnum+secondnum;
			firstnum=secondnum;
			secondnum=sum;
			System.out.println(sum);
		}

	}

}
