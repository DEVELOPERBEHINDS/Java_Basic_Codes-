package basic__Programs;

public class student{
	
	private String name;
	private int salary;
	private String course ;
	
	student(String name, int salary, String course)
	{
		this.name=name;
		this.salary=salary;
		this.course=course;
	}
	
	public String toString()
	     {  
		  return name+" "+salary+" "+course;  
		 }  
	
	public static void main(String args[]){  
	
	  student s1 = new student("raja",40000,"Java");
	  student s2 = new student("Mohan",50000,"Python");
		
		System.out.println(s1); 
		System.out.println(s2);
		
		}  
		
}
