
public class stringUse {

	public static void main(String[] args) {
		
		String s="kinwat";
		String s1=new String("kinwat");
		System.out.println("===================");
		
		String a="Ajinkya Yeshwant Pawar";
		System.out.println(a.length());
		int lengthOfString = a.length();
		System.out.println(lengthOfString);
		System.out.println("======================");
		
		String a2="Audi is my favourite car";
		String capitalString = a2.toUpperCase();
		System.out.println(capitalString);
		System.out.println("======================");
		
		String a3="INDIA IS MY COUNTRY";
		String smallString = a3.toLowerCase();
		System.out.println(smallString );
		System.out.println("=======================");
		
		String b="Pune";
		String b1="Pune";
		String c="";
		String c1="    ";
		String b2=new String("Pune");
		String b3=new String("Pune");
		String b4=new String("Pune1");
		String b5=new String("pune1");
		
		System.out.println(b==b1);
		System.out.println(b==b2);
		System.out.println(b1==b3);
		System.out.println("============================");
		
		System.out.println(b.equals(b1));
		System.out.println(b.equals(b2));
		System.out.println(b1.equals(b3));
		System.out.println(b3.equals(b4));
		System.out.println(c.equals(c1));
		System.out.println(b4.equals(b5));
		System.out.println("============================");
		
		System.out.println(b4.equalsIgnoreCase(b5));
		System.out.println("============================");
		
		System.out.println(b.contains("une"));
	    System.out.println(s.contains("kin"));
	    System.out.println(s.contains("wat"));
	    System.out.println(s.contains("kwat"));
	    
	    boolean result = s.contains("wat");
	    System.out.println(result);
	    System.out.println("================================");
	    
	   System.out.println(s.charAt(3)); 
	   System.out.println(b.charAt(2));
	   System.out.println(b1.charAt(3));
	   char result1 = s.charAt(3);
	   System.out.println(result1);
	   System.out.println("==============================");
	   
	  System.out.println(c.isEmpty());
	  System.out.println(c1.isEmpty());
	   
	   boolean result2 = c.isEmpty();
	   System.out.println(result2);
	   System.out.println("=========================");
	   
	   System.out.println(c.isBlank());
	  boolean result3 = c.isBlank();
	  System.out.println(result3);
	  
	  System.out.println(c1.isBlank());
	  System.out.println(s.isBlank());
	  System.out.println(b.isBlank());
	  System.out.println("==============================");
	  
	  System.out.println(s.startsWith("kin"));
	  System.out.println(s.startsWith("kinw"));
	  System.out.println("=========================");
	  
	  System.out.println(s.endsWith("t"));
	  System.out.println(s.endsWith("wat"));
	  System.out.println(b.endsWith("ne"));
	  System.out.println("==============================");
	  
	  String d="I love my parents";
	  
	 System.out.println(d.substring(0));
	 System.out.println(d.substring(1));
	 System.out.println(d.substring(7));
	 System.out.println(d.substring(2,7));
	 System.out.println(d.substring(7,16));
	 System.out.println("==================================");
	  
		String i="Good ";
		String j="Morning ";
		String k="Have a nice day";
		
		System.out.println(i.concat(j));
		System.out.println(j.concat(k));
		System.out.println(i.concat(j).concat(k));
		System.out.println("======================");
		
		String e="Abstraction";
		System.out.println(e.indexOf('s'));
		System.out.println(e.indexOf('A'));
		System.out.println(e.indexOf('n'));
		System.out.println(e.indexOf('c'));
		System.out.println(e.indexOf('t'));
		System.out.println(e.indexOf('i'));
		System.out.println("==========================");
		
		String f="Good Bye";
		System.out.println(f.replace("Bye","Morning"));
		System.out.println(f.replace("Bye","night "));
		
		String g="Me";
		System.out.println(g.replace('e','y'));
		
	}

}
