package AccessSpecifiers;

public class write {
	
	private int a=10;
	        int b=20;
	protected int c=30;
	public int d=40;

	public static void main(String[] args) {
		write w =new write();
		w.m1();
		w.m2();
		w.m3();
		w.m4();
		m5();
		System.out.println("===========================");
		
		System.out.println("Calling private variable from same class "+w.a);
		System.out.println("Calling default variable from same class "+w.b);
		System.out.println("Calling protected variable from same class "+w.c);
		System.out.println("Callig public variable from same class "+w.d);
		
	}

	private void m1()
	{
		System.out.println("My name is Ajinkya Yeshwantrao pawar");
	}
	void m2()
	{
		System.out.println("I am from Nanded But staying in Kinwat");
	}
	protected void m3()
	{
		System.out.println("I have completed BE in Mechanical");
	}
	public void m4()
	{
		System.out.println("I have 3 years of experience");
	}
	public static void m5()
	{
		System.out.println("I am currently working tcs company");
	}
	
}
