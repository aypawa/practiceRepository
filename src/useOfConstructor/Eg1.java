package useOfConstructor;

public class Eg1 {
    String name;
    int num1;
    int num2;
    int num3;
	
    public Eg1()
	{
	name="Ajinkya";
	}
    public Eg1(int a)
    {
    	num1=a;
    }
	public Eg1(int a,int b)
	{
		num1=a;
		num2=b;
	}
	public Eg1(int a,int b,int c)
	{
		num1=a;
		num2=b;
		num3=c;
	}
	
	public static void main(String[] args) {
	
		Eg1 e=new Eg1();
		e.Display();
		
		Eg1 e2=new Eg1(10);
		e2.Addition();
		
		Eg1 e3=new Eg1(20,20);
		e3.Addition1();
		
		Eg1 e4=new Eg1(10,20,30);
		e4.Addition2();
		
	}
	public void Display()
	{
		System.out.println("My name is "+name);
	}
	public void Addition()
	{
		System.out.println(num1);
	}
	public void Addition1()
	{
		int c=num1+num2;
		System.out.println(c);
	}
	public void Addition2()
	{
		int d=num1+num2+num3;
		System.out.println(d);
	}
	
}

