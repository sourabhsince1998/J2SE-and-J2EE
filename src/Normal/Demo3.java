package Normal;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Demo3 {
	void readData () throws FileNotFoundException  
	{
		
			FileReader f =new FileReader ("dinga.txt");
}
	
	public static void main(String[] args) throws FileNotFoundException {
		
		Demo3 d =new Demo3();
		
		d.readData();		
		
	
	
	}

}
