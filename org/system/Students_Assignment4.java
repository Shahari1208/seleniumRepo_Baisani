package org.system;

public class Students_Assignment4 {

	public int getStudentInfo(int id)
	{
	
		System.out.println(id);
		return id;
	}
	
	public void getStudentInfo(int id,String name)
	{
	
		System.out.println(id+""+name);
	
	}
	
	public void getStudentInfo(String email,String phonenumber)
	{
	
		System.out.println(email+""+phonenumber);
		
	}
	
	public static void main(String[] args) {
		Students_Assignment4 studassign = new Students_Assignment4();
		studassign.getStudentInfo(13234);
		studassign.getStudentInfo(1123, "shashi");
		studassign.getStudentInfo("bais@gmail.com", "7702987633");
	}
}
