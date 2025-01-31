package JavaPractice;

public class stringmethods {
  static String name = " RandyOrton ";

	
static int number = 5;

public static void main(String[] args) {
	//print char with index
System.out.println(name.charAt(0));
System.out.println(name.length());
System.out.println(name.equals("RandyOrton"));
System.out.println(name.equalsIgnoreCase("randyorton"));
System.out.println(name.isEmpty());
System.out.println(name.contains("dy"));
System.out.println(name.substring(1));
System.out.println(name.substring(1,5));
System.out.println(name.concat("Johncena"));
System.out.println(name.replace("R", "r"));
System.out.println(name.replace("Randy", "randyy"));
System.out.println(name.indexOf("R"));
System.out.println(name.indexOf("Orton")); 
System.out.println(name.trim());
System.out.println(String.valueOf(number));


String s = "BATISTA";
System.out.println(s.toLowerCase());
String s1="cmpunk";
System.out.println(s1.toUpperCase());

System.out.println(String.join("-", "programming","language"));







	}


}
