package _01_algorithms._2_fibonacci;

public class FibonacciSequence {

	public static void main(String[] args) {
		int number1= 0;
		int number2= 1;
		System.out.println(number1);
		System.out.println(number2);
		for (int i = 1; i <= 10; i++){
			int sum = (number1 + number2);
			number1 = number2;
			number2 = sum;
			System.out.println(sum);
		}
	}
	
}
