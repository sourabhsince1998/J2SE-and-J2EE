package Demo;

import java.util.Arrays;
import java.util.List;
//External loops
public class ForEach {
public static void main(String[] args) {
	List<Integer> values =Arrays.asList(4,5,6,7,8);
	/*for (int i= 0; i<values.size();i++) {
		System.out.println(values.get(i));
	}
	for (int i :values) {
		System.out.println(i);
	} */
	
	//Internal loops in java8-it consumes less memory 
	values.forEach(i ->System.out.println(i)); 
}
}
