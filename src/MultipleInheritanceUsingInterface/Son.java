package MultipleInheritanceUsingInterface;

public class Son implements Father,Mother{

	public static void main(String[] args) {

		Son s=new Son();
		s.beautiful();
		s.caretaker();
		s.dedicated();
		s.sacrifice();
		
		Father.clever();
		Mother.clever();
	}

	@Override
	public void beautiful()
	{
		System.out.println("this is mothers method ");
	}

	@Override
	public void caretaker() 
	{
		System.out.println("this is mothers method ");
	}

	@Override
	public void sacrifice()
	{
		System.out.println("this is fathers method ");
	}

	@Override
	public void dedicated() 
	{
		System.out.println("this is fathers method");
	}
    public void donor()
    {
    	Mother.super.donor();
    	Father.super.donor();
    }
	
}
