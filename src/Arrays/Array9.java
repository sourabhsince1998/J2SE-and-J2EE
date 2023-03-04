package Arrays;

public class Array9 {

	public static void main(String[] args) {
  
		int[] my_array = {1, 2, 5, 5, 6, 6, 7, 2};
		
        for(int i = 0; i < my_array.length; i++)  
        	
            for(int j = i + 1; j < my_array.length; j++) 
            	
                if(my_array[i]== my_array[j])  
                		
                    System.out.println("duplicate values in an Array " +my_array[j]);  
            }  
        }  
    
	


