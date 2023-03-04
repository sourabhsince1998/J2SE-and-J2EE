package StreamApi;

import java.util.ArrayList;
import java.util.List;

public class Filterexample 
{
	public static void main(String[] args) { 
		List<Product> list =new ArrayList<Product>();
		
		/*for (Product product: getProducts()){
			if(product.getPrice()>25000f) {
				list.add(product);
			}
		}
		for(Product product:list) {
			System.out.println(product);
		}
		System.out.println("-----------------"); */
		//using streamApi
		getProducts().
		stream().filter((product)->product.getId()>1)
                    .forEach(System.out::println);
		
	}
	private static List<Product> getProducts(){
		List<Product> productList=new ArrayList<Product>();
		productList.add(new Product(1,"hp",25000f));
		productList.add(new Product(2,"Lenovo",28000f));
		productList.add(new Product(3,"Mac",26000f));
		productList.add(new Product(4,"LG",25000f));
		return productList;
	}
		
	
	
	
	}


class Product{
	private int id;
	private String name;
	private float price;
	
	
	public Product(int id, String name, float price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
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
	
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price + "]";
	}


	
	
}
