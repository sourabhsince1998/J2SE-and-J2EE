package StreamApi;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import StreamApi.Employee;

public class StreamlistSorting
{
	public static void main(String[] args) {
		
		List<String> fruits=new ArrayList<String>();
		fruits.add("banana");
		fruits.add("mango");
		fruits.add("orange");
		fruits.add("apple");
	
	List<String> sortedlist=fruits.stream().sorted(Comparator.naturalOrder()).collect(Collectors.toList());
	System.out.println(sortedlist);
	
	List<String> sortedlist1 = fruits.stream().sorted((o1,o2)-> o1.compareTo(o2)).collect(Collectors.toList());
	System.out.println(sortedlist1);
	
	List<String> sortedlist2=fruits.stream().sorted().collect(Collectors.toList());
	System.out.println(sortedlist2);
	
	//Descending order
	List<String> sortedlist3=fruits.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
	System.out.println(sortedlist3);
	
	List<String> sortedlist4 = fruits.stream().sorted((o1,o2)-> o2.compareTo(o1)).collect(Collectors.toList());
	System.out.println(sortedlist4);
	
	List<Employee>employees=new ArrayList<Employee>();
	employees.add(new Employee(10,"Ramesh",30,400000));
	employees.add(new Employee(10,"Santosh",29,350000));
	employees.add(new Employee(10,"Sanjay",30,450000));
	employees.add(new Employee (40,"pramod", 29,500000));
	
	List<Employee> employeeSortedList =employees.stream()
			.sorted((o1,o2)-> (int)(o1.getSalary()-o2.getSalary())).collect(Collectors.toList());
	
	System.out.println(employeeSortedList);
	
	List<Employee> employeeSortedList1 =employees.stream()
			.sorted(Comparator.comparingLong(Employee::getSalary)).collect(Collectors.toList()); //ascending order
	
	
	System.out.println(employeeSortedList1);
	
	List<Employee> employeeSortedList2 =employees.stream()
			.sorted(Comparator.comparingLong(Employee::getSalary).reversed()).collect(Collectors.toList()); //desccending order
	System.out.println(employeeSortedList2);
	
	
	
	List<Employee> employeeSortedList3 =employees.stream()
			.sorted(Comparator.comparingInt(Employee::getAge)).collect(Collectors.toList()); //ascending order
	
	
	System.out.println(employeeSortedList3);
	
	List<Employee> employeeSortedList4 =employees.stream()
			.sorted(Comparator.comparingInt(Employee::getAge).reversed()).collect(Collectors.toList()); //descending order
	
	
	System.out.println(employeeSortedList4);
	
	System.out.println("-----------");
	
	List<Employee> employeeSortedList5 =employees.stream()
			.sorted(Comparator.comparing(Employee::getName)).collect(Collectors.toList()); //ascending order
	
	
	System.out.println(employeeSortedList5);
	
	List<Employee> employeeSortedList6 =employees.stream()
			.sorted(Comparator.comparing(Employee::getName).reversed()).collect(Collectors.toList()); //descending order
	
	
	System.out.println(employeeSortedList6);
	
	}
}