package ThisAndSuperKeyword;

public class Pen {
	
	String colour="Blue";
	String type="Ballpen";
	
	
	public static void main(String[] args) {

	Pen pen1=new Pen();
	pen1.ty();
	pen1.co();
	
	}
	public void ty()
	{
		System.out.println(this.type);
	}
	public void co()
	{
		System.out.println(this.colour);
	}


}