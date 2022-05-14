package week1.assignments;

public class PrintPrimes {
	
	public void Allprimes()
	{
		int no=22;
	boolean flag=false;
	for(int i=2;i<=no/2;i++)
	{
		int rem=no%i;
		if (rem==0)
		{
		flag =true;
		break;
		}
		 
	}
	if(!flag)
	System.out.println("prime");
	
	else
		System.out.println("Not prime");
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrintPrimes obj=new PrintPrimes();
		obj.Allprimes();
		
	}

}
