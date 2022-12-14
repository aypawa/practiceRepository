package AccessSpecifiers;

public class write2 {

	public static void main(String[] args) {

		write w=new write();
		w.m2();
		w.m3();
		w.m4();
		write.m5();
		System.out.println("=========================");
		
		System.out.println("Calling default variable from another class "+w.b);
		System.out.println("Calling protected variable from another class "+w.c);
		System.out.println("Calling public variable from another class "+w.d);
		
		
		
		
	}

}
