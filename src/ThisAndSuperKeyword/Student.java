package ThisAndSuperKeyword;

public class Student {

	String Name="Ajinkya";
	int Age=27;
	
	public static void main(String[] args) {

		Student S=new Student();
		S.A();
		S.B();
	}

	
	public void A()
	{
		System.out.println("My name is "+this.Name);
		
	}
	public void B()
	{
		System.out.println("My age is "+this.Age);
	}
}
