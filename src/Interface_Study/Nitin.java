package Interface_Study;

public class Nitin implements Mahendra,Narayan {

	public static void main(String[] args) {

		Nitin n=new Nitin();
		n.mpsc();
		n.clever();
		n.job();
		n.residance();
		n.business();
	}

	@Override
	public void mpsc() 
	{
		System.out.println("Narayan is preparing for mpsc examination");
	}

	@Override
	public void clever() 
	{
		System.out.println("Narayan is clever student");
	}

	@Override
	public void job()
	{
		System.out.println("Mahendra has job in fcci ");
	}

	@Override
	public void residance() 
	{
		System.out.println("Mahendra live in Punjab");
	}
    public void business()
    {
    	System.out.println("Nitin has its own business");
    }
	
}
