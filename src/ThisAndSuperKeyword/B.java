package ThisAndSuperKeyword;

public class B extends A{

	int p=30;
	int q=20;
	
	
	public static void main(String[] args) {

	B b=new B();
	b.demo();
	
	}

	public void demo()
	{
		int p=10;
		System.out.println("value of local variable is "+p);
		System.out.println("value of global variable p from same class "+this.p);
		System.out.println("value of global variable p from another class "+super.p);
		System.out.println("value of global variable q from another class "+super.q);
	}
	
}
