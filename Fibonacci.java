package week1.day1;

public class Fibonacci {

	public static void main(String[] args) {
		// To display Fibinacci series for first 11 terms
		int n=11;
		int FirstNumber=0;
		int SecondNumber=1;
		int Sum=0;
	    
		System.out.println(FirstNumber);
		
		for (int i = 1; i <n; i++) {
			Sum = FirstNumber + SecondNumber;
			FirstNumber = SecondNumber;
			SecondNumber= Sum;
			System.out.println(Sum);
			 
		}
		

	}

}
