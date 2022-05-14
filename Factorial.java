package week1.assignments;

public class Factorial {
	


	
		
		// TODO Auto-generated method stub
		/*
		 * Goal: Find the Factorial of a given number
		 * 
		 * input: 5
		 * output: 5*4*3*2*1 = 120
		 * 
		 * Shortcuts:
		 * 1) Print : type: syso, followed by: ctrl + space + enter
		 * 2) To create a 'for' loop: type 'for', followed by ctrl + space + down arrow + enter
		 *   
		 * What are my learnings from this code?
		 * 1)what is factorial
		 * 2)decrement operator
		 * 3) pseudo code for factorial of a given number
		 * 
		 * for loop
		 * i=5 given number;i>=1;i--
		 * fact=1;
		 * fact=fact*i;//5*1//5*4//20*3
		 * 
		 */	
		public void FindFactorial()
		{
			int fact=1;
			for(int i=5;i>-0;i--)
				fact=fact*i;
			System.out.println(fact);
			}
		public static void main(String[] args) {
			Factorial obj= new Factorial();
			obj.FindFactorial();
		}
		}
	
