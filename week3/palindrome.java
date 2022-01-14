package week3day2;

public class palindrome {
	

	public static void main(String[] args) {
		String name = "madam";
		String rev = "";
		for(int i=0; i<name.length(); i++) {
			
			rev = rev+name.charAt(i);
		}
		System.out.println(rev);
		boolean result = name.equals(rev);
		if(result == true) {
			System.out.println("griven string is palindrome");
		}
		else {
			System.out.println("griven string is not palindrome");
		}
		



	}

}
