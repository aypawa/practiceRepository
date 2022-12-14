package arrayStudy;

public class ArrayEg1 {

	public static void main(String[] args) {

	int marks[]=new int[8];
	
	marks[0]=90;
	marks[1]=85;
	marks[2]=92;
	marks[3]=147;
	marks[4]=88;
	marks[5]=97;
	
	System.out.println(marks[0]);
	System.out.println(marks[1]);
	System.out.println(marks[2]);
	System.out.println(marks[3]);
	System.out.println(marks[4]);
	System.out.println(marks[5]);
	System.out.println("=====================");
	
	for(int i=0;i<=5;i++)
	{
		System.out.println(marks[i]);
	}
	System.out.println("=======================");
	
	for(int i=5;i>=0;i--)
	{
		System.out.println(marks[i]);
	}
	System.out.println("=====================");
	
	for(int i=0;i<=marks.length-1;i++)
	{
		System.out.println(marks[i]);
	}
	System.out.println("========================");
	
	for(int i=marks.length-1;i>=0;i--)
	{
		System.out.println(marks[i]);
	}
		System.out.println("===============================");
		
	String Subject[]=new String[8];	
		
	    Subject[0]="English";
	    Subject[1]="Marathi";
	    Subject[2]="Mathematics";
	    Subject[3]="Science";
	    Subject[4]="History";
	    Subject[5]="Geography";
		
		
		System.out.println(Subject[0]);
		System.out.println(Subject[1]);
		System.out.println(Subject[2]);
		System.out.println(Subject[3]);
		System.out.println(Subject[4]);
		System.out.println(Subject[5]);
		
		
		for(int i=0;i<=5;i++)
		{
			System.out.println(Subject[i]);
		}
		System.out.println("================");
		
		for(int i=0;i<=Subject.length-1;i++)
		{
			System.out.println(Subject[i]);
		}
		System.out.println("==================");
		
		for(int i=5;i>=0;i--)
		{
			System.out.println(Subject[i]);
		}
		System.out.println("==================");
		
		for(int i=Subject.length-1;i>=0;i--)
		{
			System.out.println(Subject[i]);
		}
		
	}

}
