public class Main
{
	public static void main(String[] args) {
	    int num = 10;
	    String text = "The number is: ";
		System.out.println(text + num);
		
		num = num + "5"; // Error: bad operand types for binary operator '+'
		System.out.println(num);
	}
}
