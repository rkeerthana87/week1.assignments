package week1.assignments;

public class FibonacciSeries {
	/*
	 * Goal: To find Fibonacci Series for a given range
	 * 
	 * input(range): 8 output: 0, 1, 1, 2, 3, 5, 8, 13
	 * 
	 * Shortcuts: 1) Print : type: syso, followed by: ctrl + space + enter 2) To
	 * create a 'for' loop: type 'for', followed by ctrl + space + down arrow +
	 * enter
	 * 
	 * What are my learnings from this code? 1)Understand the requirement/question
	 * -what is the expected output 2)Write pseudocode 3)variables
	 * declaration,Looping-For loop
	 * 
	 */
	/*
	 * Fibonacci series=0,1,(0+1),(1+1),(1+2),(2+3)....
	 * =0,1,1,2,3,5,8,13,(range=8=stop) print 0; firstNo=0; SecNo=1; loop iterate 8
	 * times so i=1;i<=8;i++ inside for loop sum=firstNo+SecNo;//1// print sum;//1
	 * firstNo=0;//(this should before/outside for loop) SecNo=1;//1(this should
	 * before/outside for loop) inside for loop sum=firstNo+SecNo;//1//2//3//5 print
	 * sum//1//2//3//5 firstNo=SecNo;//1//1//2// SecNo=sum;//1//2//3
	 * 
	 * 
	 */
	public void fibonacci() {
		System.out.println("Fibonacci series");
		System.out.print("0,1");
		int firstNo = 0;
		int SecNo = 1;

		for (int i = 1; i <= 6; i++) {

			int sum = firstNo + SecNo;
			System.out.print("," + sum);
			firstNo = SecNo;
			SecNo = sum;

		}
	}

	public static void main(String[] args)

	{
		FibonacciSeries obj = new FibonacciSeries();
		obj.fibonacci();
	}

}
