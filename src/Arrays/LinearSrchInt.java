package Arrays;

public class LinearSrchInt {

	public static void main(String[] args)
	{
		int[] a= {5,3,6,1,4,2};
		
		int item=5;   //Searching item
		int temp=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==item)
					{
						System.out.println("item is present at "+i+" index position");
				        temp=temp+1;
					}
		}
		if(temp==0)
		{
			System.out.println("item not found in list");
		}
		
		
	
	
	}

}
