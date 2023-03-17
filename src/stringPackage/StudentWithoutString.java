package stringPackage;

public class StudentWithoutString 
{
	public static void main(String[] args)
	{
		StudentWithoutString s1=new StudentWithoutString();
		
		System.out.println(s1);
		System.out.println(s1.toString());
		
		System.out.println("-----------");
		
		System.out.println(s1.hashCode());
		
		System.out.println("-----------");
		
		StudentWithoutString s2=new StudentWithoutString();
		
		StudentWithoutString s3=new StudentWithoutString();
		
		System.out.println(s2.equals(s3));
		
	}

}
