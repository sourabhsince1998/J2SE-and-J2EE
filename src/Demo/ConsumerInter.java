package Demo;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

/*class ConsImpl implements Consumer<Integer>
{
	
}*/
public class ConsumerInter 
{
	public static void main(String[] args) {
		List<Integer> values =Arrays.asList(4,5,6,7,8);
		
		
		values.forEach(i->System.out.println(i));
	}
}
	


