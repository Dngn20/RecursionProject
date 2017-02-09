package counting.model;

public class RecursionTool 
{
	public double calculateFactorial(double currentNumber)
	{
		if(currentNumber ==0 || currentNumber == 1)
		{
			return 1;
		}
		else
		{
			return calculateFactorial(currentNumber - 1 ) * currentNumber;
		}
	}
	
	public int calculateFibonacci(int currentNumber)
	{
		if(currentNumber == 0 || currentNumber == 1)
		{
			return 1;
		}
		else
		{
			return calculateFibonacci(currentNumber - 1) + calculateFibonacci(currentNumber - 2);
		}
	}
	
	public int calculateIterationFib(int currentNumber)
	{
		int x = 0, y = 1, z = 1;
		for (int i = 0; i < currentNumber; i++)
		{
			x = y;
            y = z;
            z = x + y;
		}
		return x;
	}
	
	int calculateIterationFac(int input)
	{
	  int x, fact = 1;
	  for ( x = input; x > 1; x--)
	     fact *= x;
	     
	  return fact;

	}
}