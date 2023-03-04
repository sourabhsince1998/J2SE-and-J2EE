package Arrays;
//Write a Java program to calculate the average value of array elements.
public class Array4 {

	public static void main(String[] args) {
		
		int[] numbers = new int[]{20, 30, 25, 35, -16, 60, -100};
		int sum=0;
		double avg=0.0;
		for (int n:numbers)
			sum=sum+n;
		avg=sum/numbers.length;
        System.out.println("Average of given array is"+avg);
	       
		/*int sum = 0;
	    sum = sum + numbers[i];
	       //calculate average value
	    double average = sum / numbers.length;
	     System.out.println("Average value of the array elements is : " + average);
			*/
	}
}
	
	
