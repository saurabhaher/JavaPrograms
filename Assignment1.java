
class Testing{
	public void Sum()
	{
	int a=4,b=5, sum;
	sum= a+b;
	System.out.println(sum);
	}
	public void Welcome()
	{
		System.out.println("welcome to Java");
	}
	public void Alpha()
	{
		for (int i=65;i<=90;i++)
		{
			System.out.print((char)i);
		}
	}
	void factorial(int i)
	{
		int sum=1;
		while (i!=0)
		{
			sum= sum*i;
			i--;
		}
		System.out.print(sum);		
	}
	void PrintHash(int no)
	{
		for (int i=0;i<no;i++)
		{
			for(int j=0;j<no-i;j++)
			{
				System.out.print('#');
			
			}
			System.out.println();
		}		
	}
	
	void PrintStar(int no)
	{
		for (int i=1;i<=no;i++)
		{
			for(int j=0;j<i;j++)
			{
				System.out.print('*');
			
			}
			System.out.println();
		}
	}
	
	void Fibonacci(int no)
	{
		int i=0,b=0,c=1,d;
		System.out.print(b+"\t");
		while (i++<no)
		{
			System.out.print(c+"\t");
			d=b+c;
			b=c;
			c=d;
		}

	}
	
	void TriangularMultTable(int no)
	{
		for (int i=1;i<=8;i++)
		{
			System.out.print("0"+"\t");
			int j=1;
			while (j<i)
			{
				System.out.print(i*j+"\t");
				j++;
			}
			System.out.print("\n");
		}
	}
	
	void SumOfDigits(int no)
	{
		int sum =0;
		while (no>0)
		{
			sum =sum+ no%10;
			no = no/10;
		}
		System.out.println(sum);
	}
	
	void TempConvert(double F)
	{
		double C = 0;
		C= ((F-32) *5)/9;
		System.out.println(C);
	}
	
	
}



public class Assignment1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Testing t1 = new Testing();
		t1.TempConvert(39);
		
	}

}
