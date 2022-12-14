package polymorphism;

public class MethodOverloading {

	public static void main(String[] args) {

		MethodOverloading mo=new MethodOverloading();
		mo.add();
		mo.add(60,50);
		
	}

	public void add()
	{
		int a=10;
		int b=20;
		int sum=a+b;
		System.out.println("Sum of two variable is "+sum);
	}
	
	public void add(int a, int b)
	{
		int sum=a+b;
		System.out.println("sum of two variable is "+sum);
	}
	
	
}
