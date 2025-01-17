import java.util.Scanner;

class Calculator{

	public int add(int a, int b){
	
		return a+b;

	}
	public int sub(int a, int b){

		return a-b;
	}
	public int multiply(int a, int b){

		return a*b;
	}
	public int divide(int a, int b){

		return a/b;
	}

	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();

        Calculator calc = new Calculator();

        System.out.println("Addition: " + calc.add(num1, num2));
        System.out.println("Subtraction: " + calc.sub(num1, num2));
        System.out.println("Multiplication: " + calc.multiply(num1, num2));
        System.out.println("Division: " + calc.divide(num1, num2));

        scanner.close();
	} 

}
