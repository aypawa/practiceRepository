package practicepackage;

public class CC {

	int num1;
	int num2;
	int num3;
	
	public CC()
	{
		
		num1=10;
		num2=20;
		num3=30;
	}
	public CC(int a)
	
	{
		num1=a;
	}
	public CC(int a, int b)
	{
		num1=a;
		num2=b;
	}
	public CC(int a , int b, int c)
	{
		num1=a;
		num2=b;
		num3=c;
	}
	public static void main(String[] args) {

		CC c1=new CC();
		c1. addition();
		  
		CC c2=new CC(5);
		c2.addition();
		
		CC c3= new CC(9,4);
		c3.addition();
		
		CC c4= new CC(9,8,9);
		c4.addition();
		
		CC c5=new CC(30,40);
		c5.substraction();
	}

 public void addition()
 {
	 int sum=num1+num2+num3;
	 System.out.println(" Addition is "+sum);
 }
	
	public void substraction()
	{
		int sub1=num1-num2;
	
		System.out.println("substraction is "+sub1);
	
	}
	
}
