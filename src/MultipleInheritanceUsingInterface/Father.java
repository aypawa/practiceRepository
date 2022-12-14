package MultipleInheritanceUsingInterface;

public interface Father {

	void sacrifice();
	void dedicated();
	
	default void donor()
	{
		System.out.println("Fathers donor method");
	}
	static void clever()
	{
		System.out.println("Fathers clever method");
	}
}
