package Abstract;

public class CC extends Test{

	public static void main(String[] args) {

		CC c =new CC();
		c.Demo1();
		c.Demo2();
		c.Demo3();
	}
	public void Demo3()
	{
		System.out.println("this is Demo3 method in the CC class");
	}

	@Override
	public void Demo1() {
		
		System.out.println("this is Demo1 method from the test class");
		
	}
	
}
