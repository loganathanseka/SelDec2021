package student;

public class studentinfo {
	public void studentdetails(int a) {
		System.out.println(a);
	}
	public void studentdetails(String a, String b) {
		System.out.println(a+" "+b);
	}
	public void studentdetails(String a, String b, long c) {
		System.out.println(a+" "+b+" "+c);
	}

	public static void main(String[] args) {
		studentinfo stu = new studentinfo();
		stu.studentdetails(15);
		stu.studentdetails("logan", "logansekar008@gmail.com");
		stu.studentdetails("logan", "logansekar008@gmail.com", 1234567891);
		

	}

}
