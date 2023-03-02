package corejava;

public class Abstract extends AbstractionExample
{
	private double salary;

	public Abstract(int id, String name, String address, double salary) {
		super(id, name, address);
		this.salary = salary;
	}
	public void mailCheck() {
		System.out.println("Mailing Check to:"+getName());
	}
	

	

}
