package corejava;

public abstract class AbstractionExample 
{
	//fields
	private int id;
	private String name;
	private String address;
	//creating a parameterized constructors
	public AbstractionExample(int id, String name, String address) 
	{
		
		this.id = id;
		this.name = name;
		this.address = address;
	}
	//create a method
	public void mailCheck(){
		
	}
	
	
	@Override
	public String toString() {
		return "AbstractionExample [id=" + id + ", name=" + name + ", address=" + address + "]";
	}
	//creating getters and setters
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
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}			
}
