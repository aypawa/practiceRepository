package ThisAndSuperKeyword;

public class ThisUse {

	int A=30;
	int B=20;
	
	public static void main(String[] args) {

		ThisUse t=new ThisUse();
		t.Fruit();
	}

	public void Fruit()
	{
		int A=10;
		System.out.println("Price of local apple A is "+A);
		System.out.println("Price of global apple A is "+this.A);
		System.out.println("Price of global apple B is "+this.B);
	}
	
	
}
