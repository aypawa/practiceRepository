package arrayStudy;

public class ArrayEg2 {

	public static void main(String[] args) {

		String name[]= {"Bhaskar","Yogesh","Akshay","Sunil"};
		int marks[]= {10,20,30,40};
		
		System.out.println(name[0]);
		System.out.println(name[1]);
		System.out.println(name[2]);
		System.out.println(name[3]);
		
		System.out.println("=========================");
		
		
		System.out.println(marks[0]);
		System.out.println(marks[1]);
		System.out.println(marks[2]);
		System.out.println(marks[3]);
		
		System.out.println("==========================");
		
		for(int i=0;i<=marks.length-1;i++)
		{
			System.out.println(marks[i]);
		}
		System.out.println("========================");
		
		for(int i=marks.length-1;i>=0;i--)
		{
			System.out.println(marks[i]);
		}
	}

}
