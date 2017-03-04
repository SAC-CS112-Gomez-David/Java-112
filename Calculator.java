import java.util.Scanner;
/** Created By David Gomez Java 6:30pm Wednesday class
 * 
 * @author David
 *
 */

public class Calculator 
{

	public static void main(String[] args)
	{

Scanner input = new Scanner(System.in);

	int number1;
	int number2;
	int Sum;
	int Divide;
	int Subtract;
	int Multiply;
	
	System.out.print("Enter first integer: ");
    number1 = input.nextInt();
       
    System.out.print("Enter second integer: ");
    number2 = input.nextInt();
  
    Sum = number1 + number2;
    Divide = number1 / number2;
    Subtract = number1 - number2;
    Multiply = number1 * number2;
    /** This calculator will not be able to prevent the user from entering letters or any other keyboard button that is not a 
     * number. This program cant divide properly. Example would be 1 divided by 2. The answer should be 0.5 but instead gives 0
     * as a result, have not tested the other results for mistakes.
     * Also i was unable to get it to detect The Operator (+,-,/,*) and get it to only
     * spit the answer based on the Operator. I tried doing if-Then-else statements like 
     * in Visual basic but it would not work.
     */
    System.out.printf("Hello you entered %d and %d\n", number1, number2);
    System.out.printf("The Sum is %d and the division %d the Subtraction %d The Multiplication %d" , Sum, Divide, Subtract, Multiply);
    
	}
	
}
