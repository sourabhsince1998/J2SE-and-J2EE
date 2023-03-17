package stringPackage;

public class DemoStringMethods
{
	public static void main(String[] args) {
		
	
	String s= " Software Developer";
	System.out.println(s.length());
	System.out.println(s.toUpperCase());
	System.out.println(s.toLowerCase());
	System.out.println(s.startsWith("soft"));
	System.out.println(s.endsWith("per"));
	System.out.println(s.charAt(2));
	System.out.println(s.indexOf('o'));
	System.out.println(s.contains("ware"));
	
	String s1="Hello";
	String s2="Hiiii";
	String s3="hello" ;
	System.out.println(s1.equals(s2));
	
	System.out.println(s1.equalsIgnoreCase(s3));
	

}
}