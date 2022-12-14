package arrayStudy;

public class ArrayEg3 {

	public static void main(String[] args) {

		char Test[][]= {{'a','b'},{'c','d'},{'e','f'}};
		
		System.out.println(Test[0][0]);
		System.out.println(Test[0][1]);
		System.out.println(Test[1][0]);
		System.out.println(Test[1][1]);
		System.out.println(Test[2][0]);
		System.out.println(Test[2][1]);
	
		System.out.println("========================");
		
		for(int i=0;i<=2;i++)
		{
			for(int j=0;j<=1;j++)
			{
				System.out.print(Test[i][j]+" ");
			}
			System.out.println();
		}
		
		
	}

}
