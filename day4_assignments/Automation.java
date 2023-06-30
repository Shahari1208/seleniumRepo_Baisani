package week2.day4_assignments;

public class Automation extends MultipleLangauge implements Language,TestTool {

	

	public void selenium() {
		System.out.println("Selenium from Automation");
		
	}

	public void Java() {
		System.out.println("Java from Automation class");
		
	}
	public void ruby() {
		System.out.println("ruby in automation class");
		
	}
	
public static void main(String[] args) {
		
	Automation auto = new Automation();
	auto.Java();
	auto.python();
	auto.ruby();
	auto.selenium();
	}




}
