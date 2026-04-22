package calculatorProgram;
import java.util.Scanner;

public class calculatorProgram {

	public static void main(String[] args) {
		// 3 prompts asking for users 2 numbers and 1 math thingy
		// scanner
		// encased switches
		// printf 
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Welcome to my very simple calculator program");
		System.out.println("Please input your first number:");
		double firstNumber = scanner.nextDouble();
		System.out.println("Please select an operator: +, -, /, *, ^"); // .next takes everything before the next space but .nextLine takes everything before new line
		String operator = scanner.next();//the charat helps to keep th 
		System.out.println("Please input your second number:");
		double secondNumber = scanner.nextDouble();
		
		scanner.close();
		// to make this simpler to understand we could just use a variable to store the product.
		switch(operator) {
		case "+" -> System.out.println(firstNumber + secondNumber); 
		case "-" -> System.out.println(firstNumber - secondNumber); 
		case "/" -> System.out.println(firstNumber / secondNumber); 
		case "*" -> System.out.println(firstNumber * secondNumber); 
		case "^" -> System.out.println(Math.pow(firstNumber, secondNumber)); 
		default -> System.out.println("Not a number poopy head");
		}
	}

}
//Honestly there's a lot wrong with this:
// we could have made a separate variable for storing the product of the two numbers.
// This would have helped us to use charAt and to make a divide by 0 error catch.
// But i didnt do this so this can stay as a raw showcase of my work.