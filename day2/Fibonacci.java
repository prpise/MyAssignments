package week1.day2;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int range =8;
		int fnum=0;
		int snum=1;
		int sum;
		
		System.out.print("Fibonacci numbers are :" );
		
		for (int i = 0; i <= 8; i++) {
			
			System.out.print(fnum + " ");
			
			sum = fnum+snum;
			fnum=snum;
			snum=sum;
			
		}         
			
		}		
	
}

