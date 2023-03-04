package Demo;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId; //all date classes in time package

public class Date 
{
	public static void main(String[] args) {
	LocalDateTime t= LocalDateTime.now();
	System.out.println(t);
		
	Instant i=Instant.now(); //gives Gmt
	System.out.println(i);
	
	for (String s:ZoneId.getAvailableZoneIds())
	{
		System.out.println(s);
	}
}

}

