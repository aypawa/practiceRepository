package practicepackage;

public class CS {

	String city="Pune";
	
	String name;
	String sirname;
	public CS()
	{
		name="Velocity";
		sirname="Pawar";
	}
	public static void main(String[] args) {

		
		CS c1=new CS();
		c1.display();
		
		
	}

	public void display()
	{
		System.out.println("My city name is "+city);
		System.out.println("My sirname is "+sirname);
		System.out.println("My name is "+name);
	}
	
	
}
