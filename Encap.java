package corejava;

public class Encap
{

	public static void main(String[] args) 
	{
		//Creating object of class EncapsulationExample
		EncapsulationExample abc = new EncapsulationExample();
		//object is used to access the methods of a class
		abc.setId(1);
		abc.setName("Franklin");
		System.out.println("ID:"+abc.getId()+"\n"+"Name:"+abc.getName());

	}

}
