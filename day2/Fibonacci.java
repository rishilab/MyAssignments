package week1.day2;

import java.util.Iterator;

public class Fibonacci {

	public static void main(String[] args) {
		
		//Fibonacci series will work based on calculation shown below		
		//0, 1, 0+1, 1+1, 1+2, 2+3, 3+5 and 5+8 
		//0, 1,  1,   2,   3,   5,   8  and 13
		
		System.out.println("The Fibonacci Series are ");
		
		int N = 8;  ///No of Series to be printed		
		int n1 = 0; //first term
		int n2 = 1; //second term
		
		for(int i=1; i<=N; i++)
		{	
			System.out.println(n1); //print the current first term
			
			int n3 = n1+n2; //compute next term
			n1 = n2; //shift n2 = n1
			n2 = n3; // new value to n2

			
// n3=0+1=1, 1+1=2, 1+2=3, 2+3=5, 3+5=8, 5+8=13, 8+13=21, 13+21=34 
// n1=1,	n1=1, 	n1=2,  n1=3,  n1=5,  n1=8,	 n1=13,		n1=21
// n2=1,	n2=2,	n2=3,  n2=5,  n2=8,	 n2=13	 n2=21		n2=34
			
		}

	}

}
