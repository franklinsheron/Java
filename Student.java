package corejava;

public class Student 
{

	public static void main(String[] args) 
	{
		//Creating object of the class StudentData
		StudentData st = new StudentData();
		st.setId(1);
		st.setName("Franklin");
		st.setAge(20);
		
		//Displaying Students Data
		System.out.println("Students Data"+"\n");
		System.out.println("id:"+st.getId()+"\n"+"name:"+st.getName()+"\n"+"Age:"+st.getAge());

	}

}
