package week1.day2;

import java.util.Iterator;

public class IsPrimeNumber {
	
	public static void main(String[] args) {
		
		int n =20;
		
		System.out.println("The Prime Numbers are" +"\n");
		
		for (int i=2; i<=n; i++) {
			
		boolean isPrime = true;
		
		
		for (int j = 2; j <=i-1; j++) {

			if (i % j == 0) {
				isPrime = false;
				break;
			}
		}
			
			if(isPrime) {
				System.out.println(i);
			
				
			}
				
	}
	} }

