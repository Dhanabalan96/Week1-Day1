package week1.day1;

public class IsPrime {

	public static void main(String[] args) {
		// To find whether given number is prime number or not
		
		int input= 23;
		boolean check = false;
		for (int i = 2; i < input; i++) 
		{
			if (input%i==0)
			check = true;
			break;			
		}
		
		if(!check)
		System.out.println("Given number" + input + "is a prime number");
		else
		System.out.println("Given number" + input + "is not a prime number");
	
	}
}
