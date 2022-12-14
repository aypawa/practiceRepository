package MultipleInheritanceUsingInterface;

public interface Mother {

	void beautiful();
	void caretaker();
	
	default void donor()
	{
		System.out.println("mothers donor method");
	}
	static void clever()
	{
		System.out.println("mothers clever method ");
	}
}
