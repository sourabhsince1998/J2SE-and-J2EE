package StreamApi;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Stream;

public class CreateStreamObject 
{
	public static void main(String[] args) 
	
	{
		//create a stream
		Stream<String> stream=Stream.of("a","b","c");
		stream.forEach(System.out::println);
		
		//create stream from sources (collection)
		
		Collection<String> collection=Arrays.asList("java","sql","html");
		Stream<String> stream2 =collection.stream();
		stream2.forEach(i-> System.out.println(i));
		
		List<String> list=Arrays.asList("java","sql","html");
		Stream<String> stream3 =list.stream();
		stream3.forEach(i-> System.out.println(i));
		
		Set<String> set=new HashSet<>(list);
		Stream<String> stream4 =set.stream();
		stream4.forEach(i-> System.out.println(i));
		
		
		String[] strArray= {"a","b","c"};
		Stream<String> stream5=Arrays.stream(strArray);
		stream5.forEach(i-> System.out.println(i));
	}
}

