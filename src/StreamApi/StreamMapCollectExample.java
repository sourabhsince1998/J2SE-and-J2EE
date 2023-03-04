package StreamApi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamMapCollectExample {
public static void main(String[] args) {
	List<User> users=new ArrayList<User>();
	
	users.add(new User(1,"Ramesh","secrete", "ramesh@gmail"));
	users.add(new User(2,"Tony","secrete", "tony@gmail"));
	users.add(new User(3,"Tom","secrete", "tom@gmail"));
      List<UserDTO> usersDTO=new ArrayList<UserDTO>();
      for(User user: users) {
    	  usersDTO.add(new UserDTO(user.getId(),user.getName(),user.getEmail()));
      }
      for (UserDTO dto: usersDTO) {
    	  System.out.println(dto);
      }
      
      //Using stream().map()--map is method in stream
      List<UserDTO> usersDTOs=users.stream().map((User user)-> new UserDTO(user.getId(),user.getName(),user.getEmail()))
.collect(Collectors.toList());
      
      usersDTOs.forEach(System.out::println);
}
}

class UserDTO {
	
	private int id;
	private String name;
	private String  email;
	

	@Override
	public String toString() {
		return "UserDTO [id=" + id + ", name=" + name + ", email=" + email + "]";
	}

	public UserDTO(int id, String name, String email) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	
}

class User {
	private int id;
	private String name;
	private  String password;
	private String  email;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public User(int id, String name, String password, String email) {
		super();
		this.id = id;
		this.name = name;
		this.password = password;
		this.email = email;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", password=" + password + ", email=" + email + "]";
	}
}
