// Sanskar Jadhav AIML B1 PRN 21070126076
public class FactorialCalculation
{
	// method to calculate the factorial
	static void factorial(int n) throws FactorialException{
		// number must be positive
		if(n < 0){
			throw new FactorialException("Number must be a positive integer.");
		}
		// number must be less than 15
		else if(n > 15){
			throw new FactorialException("Number is too large. Try selecting a number between 0 and 15.");
		}
		else {
			long f = 1;
			for(int i=1; i<=n; i++){
				f *= i;
			}
			System.out.println("The factorial of " + n + " is " + f);
		}
	}
  
	public static void main(String args[])
	{
		for(String i: args){
			try
			{
				// parse string to integer
				int a = Integer.parseInt(i);
				// call factorial method
				factorial(a);
			}
			catch (NumberFormatException e)
			{
				System.out.println(i + " is not an integer.");
			}
			catch (FactorialException ex) {
				System.out.println("Caught the custom exception");
				System.out.println(ex);
			}
		}
		System.out.println("Program is complete");
	}
}