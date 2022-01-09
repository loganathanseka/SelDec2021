package classroomex;
public class calc {
	public void add(int a, int b) {
		System.out.println("adding two variable="+(a+b));
	}
	public void add(int a, int b, int c) {
		System.out.println("adding three variable="+(a+b+c));
	}
	public void mul(int a,int b) {
		System.out.println("multiply two variable="+(a*b));
	}
	public void mul(int a,double b) {
		System.out.println("multiply sub two variable="+(a*b));
	}
	public void sub(int a,int b) {
		System.out.println("sub two variable="+(a-b));
	}
	public void sub(double a,double b) {
		System.out.println("multiply two variable="+(a-b));
	}
	public void div(int a,int b) {
		System.out.println("divide two variable="+(a/b));
	}
	public void div(double a,int b) {
		System.out.println("multiply two variable="+(a/b));
	}
	public static void main(String[] args) {
		calc cal = new calc();
		cal.add(2, 3);
		cal.add(2, 3, 4);
		cal.sub(5, 3);
		cal.sub(8, 3);
		cal.mul(2, 3);
		cal.mul(3, 4);
		cal.div(9, 3);
		cal.div(9, 3);

	}

}
