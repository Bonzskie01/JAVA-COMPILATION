public class MethodsInJava
{
	public static int addNumbers(int a, int b) {
		int sum = a + b;
		return sum;
	}
	
	public static void main(String[] args) {
		int num1 = 25;
		int num2 = 15;
		//MethodsInJava obj = new MethodsInJava();
		//int result = obj.addNumbers(num1, num2);
		int result = addNumbers(num1, num2);
		System.out.println("Sum is: " + result);
	}
}
