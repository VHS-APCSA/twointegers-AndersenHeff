
public class TwoIntegers 
{
	private double int1;
	private double int2;
	public TwoIntegers()
	{
		int1 = 0;
		int2 = 0;
	}
	public TwoIntegers(double int1, double int2)
	{
		this.int1 = int1;
		this.int2 = int2;
	}
	public String toArithmetic()
	{
		String arithmetic = "";
		double sum = 0;
		sum = ((int1) + (int2));
		double product = 0;
		product = ((int1) * (int2));
		double difference = 0;
		difference = ((int1) - (int2));
		double quotient = 0;
		quotient = ((int1) / (int2));
		arithmetic = ("Your sum equals \n" + (sum) + "\nYour product equals \n" + (product) + 
		"\nYour difference equals \n" + (difference) + "\nYour quotient equals \n" + (quotient));
		return arithmetic;
	}
	public void setInt1(int int1)
	{
		this.int1 = int1;
	}
	public void setInt2(int int2)
	{
		this.int2 = int2;
	}
	public double getInt1()
	{
		return int1;
	}
	public double getInt2()
	{
		return int2;
	}
	public String toNumberSize()
	{
		String numSize = "";
		if(int1 > int2)
		{
			numSize += (int1) + "is the larger number";
			numSize += "\n" + (int2) + "is the smaller number";
		}
		else if (int1 < int2)
		{
			numSize += (int2) + "is the larger number";
			numSize += "\n" + (int1) + "is the smaller number";
		}
		else
		{
			numSize += "These numbers are equal";
		}
		return numSize;
	}
	public String toEvenOdd()
	{
		String evenOdd = "";
		if(int1 % 2 == 0)
		{
			evenOdd += "Your first number is even";
		}
		else
		{
			evenOdd += "Your first number is odd";
		}
		if(int2 % 2 == 0)
		{
			evenOdd += "\nYour second number is even";
		}
		else
		{
			evenOdd += "\nYour second number is odd";
		}
		return evenOdd;
	}
		public String toMultiple()
	{
		String multiple = "";
		if(int1 % int2 == 0)
		{
			multiple += "The first integer is a multiple of the second";
		}
		else
		{
			multiple += "The first integer isn't a multiple of the second";
		}
		return multiple;
	}
}
