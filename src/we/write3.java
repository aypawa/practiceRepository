package we;

import AccessSpecifiers.write;

public class write3 extends write {

	public static void main(String[] args) {

   write w=new write();
   w.m4();
   
   write3 w3=new write3();
   w3.m3();
  
   System.out.println("Calling public variable from another package "+w.d);
	System.out.println("Calling protected variable from another package "+w3.d);	
		
	}

}
