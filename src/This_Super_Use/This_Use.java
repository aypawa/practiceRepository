package This_Super_Use;

public class This_Use extends Super_Use {

	int a=40;
	int b=50;
	int c=60;
	static int d=80;
	public static void main(String[] args) {
	
		This_Use t=new This_Use();
		t.Show();
		System.out.println("=================== ");
		System.out.println(t.a);
		System.out.println(t.b);
		System.out.println(t.c);
		System.out.println(d);
		System.out.println(t.z);
		System.out.println(y);
	}
   public void Show()
   {
	   int a=10;
	   int b=20;
	   int c=30;
	   
	   System.out.println("value of local variable a:"+a);
	   System.out.println("value of local variable b:"+b);
	   System.out.println("value of local variable c:"+c);
	   System.out.println("==============================");
	   System.out.println("value of Global variable a:"+this.a);
	   System.out.println("value of Global variable b:"+this.b);
	   System.out.println("value of Global variable c:"+this.c);
	   System.out.println("===================================");
	   System.out.println("value of Global variable from super class:"+super.y);
	   System.out.println("value of Global variable from super class:"+super.z);
	   
   }
}
