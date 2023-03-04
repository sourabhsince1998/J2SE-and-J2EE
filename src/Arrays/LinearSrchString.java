package Arrays;

public class LinearSrchString {

	public static void main(String[] args) {
	
		String[] a= {"Deepak","rahul","Abhi","Lokesh"};
		
		String item="deepak";   //Searching item
	
		for(int i=0;i<a.length;i++)
		{
			if(a[i].equals(item))
			{
						System.out.println("Item is present at "+i+" index position");
	                    break;
			}
					
			else
			{
				System.out.println("Item is not in list");
				break;
			}
		
		
	}
}
}
		
	
	
	
	
	
	


