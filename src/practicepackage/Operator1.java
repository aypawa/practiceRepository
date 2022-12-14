package practicepackage;

public class Operator1 {

	public static void main(String[] args) {
		
		int c=20;
		int k=2;
		int division= c/k;
		System.out.println(division);

		Addition(20,30);
		Substraction(50,40);
		
		Operator1 ot =new Operator1();
		ot.Multiplication(50,2);
		
		ot.Division(60,30);
	}
	
	public static void Addition(int a,int b)
	{
	int sum=a+b;
	System.out.println("Addition of a & b is "+sum);
	}

	public static void Substraction(int a, int b)
	{
		int sub =a-b;
		System.out.println("Substaction of a & b is "+sub);
	}

	public void Multiplication(int a,int b)
	{
		int mul=a*b;
		System.out.println("Multiplication of a & b is "+mul);
	}
	public void Division(int a,int b)
	{
		int div=a/b;
		System.out.println("Division of b & a is "+div);
	}
}