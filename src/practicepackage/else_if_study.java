package practicepackage;

public class else_if_study {

	public static void main(String[] args) {

		int days=1;
		if(days==0) {
			System.out.println("Sunday");
		}
		else if(days==1) {
			System.out.println("Monday");
		}
		else if(days==2) {
			System.out.println("Tuesday");
		}
		else if(days==3) {
			System.out.println("Wednesday");
		}
		else if(days==4) {
			System.out.println("Thursday");
		}
		else if(days==5) {
			System.out.println("Friday");
		}
		else if(days==6) {
			System.out.println("Saturday");
		}
		else {
			System.out.println("Invalid day");
		}
	}

}
