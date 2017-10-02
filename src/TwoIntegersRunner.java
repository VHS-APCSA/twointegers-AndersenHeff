import java.util.Scanner;
public class TwoIntegersRunner 
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your first integer");
		double int1 = input.nextInt();
		System.out.println("Enter your second integer");
		double int2 = input.nextInt();
		TwoIntegers twointegers = new TwoIntegers(int1, int2);
		String arithmetic = twointegers.toArithmetic();
		String numberSize = twointegers.toNumberSize();
		String evenOdd = twointegers.toEvenOdd();
		String multiple = twointegers.toMultiple();
		System.out.println(arithmetic);
		System.out.println(numberSize);
		System.out.println(evenOdd);
		System.out.println(multiple);
		
	}
}
