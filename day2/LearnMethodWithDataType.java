package week1.day2;

public class LearnMethodWithDataType {

	
		public int add(int a, int b)
		{
			
			return a+b;
		}
		

		public int sub(int a, int b)
		{
			
			return a-b;
		}
		
		public static void main(String[] args) {
			
			LearnMethodWithDataType obj = new LearnMethodWithDataType();
			System.out.println(obj.add(7, 5));
			int sub = obj.sub(8, 5);
			System.out.println(sub);
		}
	}


