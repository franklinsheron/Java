package corejava;

class Animal {
//method
	public void display() {
		System.out.println("Inside parents class:");
	}
}
// child class
class Dog extends Animal
{
	public void sound() 
	{
		System.out.println("Dog barks........");
	}	
}
class Puppy extends Dog
{
	public void run()
	{
		System.out.println("Hello Puppy");
	}
	
}
class MainTest 
{
	public static void main(String[] args)
	{
		//creating object of child class.
		Puppy sa = new Puppy();
		sa.display();
		sa.sound();
		sa.run();
	}
}
