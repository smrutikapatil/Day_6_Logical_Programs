package bridgelabz.logicalprograms;

public class FibonacciSeries {

	public static void main(String[] args) {
		int previousNum = 0;
		int currentNum = 1; 
		int n=10;
		System.out.println("Fibonaccci Series till "+   "+currentNum:");
		int nextNum;
		for (int i = 1 ; i < n; i++) {
		    nextNum = previousNum + currentNum;
			previousNum = currentNum;
			currentNum = nextNum;
			System.out.println(" " +nextNum);
			
		}

	}

}