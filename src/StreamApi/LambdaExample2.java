package StreamApi;

@FunctionalInterface
interface EvenOdd{
	void check (int a);
}
public class LambdaExample2 {
	public static void main(String[] args) 
	{
		EvenOdd evenodd= (a)-> {
				if(a%2==0) {
					System.out.println("Number "+a+" is even ");
					}
				else {
					System.out.println("Number "+a+" is odd");
				}
				};
		evenodd.check(10);
	}
}
			
			
		
	
