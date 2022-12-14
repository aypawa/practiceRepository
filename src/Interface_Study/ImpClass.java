package Interface_Study;

public class ImpClass implements MyInterface{

	public static void main(String[] args) {

		ImpClass c=new ImpClass();
		c.Narayan();
		c.Ajinkya();
		c.Nitin();
		c.Mahendra();
		c.Yogesh();
	
	}

	@Override
	public void Narayan() 
	{
		System.out.println("Narayan method is completed in implementation class");
	}

	@Override
	public void Ajinkya()
	{
		System.out.println("Ajikya method is completed in implementation class");
	}

	@Override
	public void Nitin()
	{
		System.out.println("Nitin method is completed in implementation class");
	}

	@Override
	public void Mahendra() 
	{
		System.out.println("Mahendra method is completed in implementation class");
	}
    public void Yogesh()
    {
    	System.out.println("Yogesh method is owm method of implementation class");
    }
}
