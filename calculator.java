package practice_session;
import java.util.Scanner;
public class calculator {
public static void main(String[] args) {
	double result;
	char operator;
	double a,b;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the first Number: ");
	a=sc.nextDouble();
	System.out.println("Enter the second Number: ");
	b=sc.nextDouble();
	System.out.println("Enter which operation you want to perform: ");
	operator =sc.next().charAt(0);
//	int c=(int)a;
//	int d=(int)b;
	switch (operator) {
	case'+':
		result=a+b;
		System.out.println("Addition of Two Number: " +result);
		break;
	case'-':
		result=a-b;
		System.out.println("Subtraction of Two Numbers: "+result);
		break;
	case'*':
		result=a*b;
		System.out.println("Multiplication of Two Numbers: "+result);
		break;
	case'/':
		result=a/b;
		System.out.println("Division of Two Numbers: "+result);
		break;
	default:
		System.out.println("This operation is invalid");
	}
}
}
