package week3day2;

public class automation extends multiplelanguage implements language, testtool {
	

	public static void main(String[] args) {
		automation auto = new automation();
		auto.java1();
		auto.selenium();
		auto.python();

	}
	public void java1() {
		System.out.println("java");
	}

	public void selenium() {
		System.out.println("selenium");
		
	}
	

	

}
