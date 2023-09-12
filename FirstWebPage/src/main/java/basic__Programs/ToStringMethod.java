package basic__Programs;

public class ToStringMethod{
	
	private String name;
	private int salary;
	private String course ;
	
	ToStringMethod(String name, int salary, String course)  	{
		this.name=name;
		this.salary=salary;
		this.course=course;
	}
	
	public String toString()   {  
		  return name+" "+salary+" "+course;  
		 }  
	
	public static void main(String args[]){  
	
		ToStringMethod s1 = new ToStringMethod("raja",40000,"Java");
		ToStringMethod s2 = new ToStringMethod("Mohan",50000,"Python");
		ToStringMethod s3 = new ToStringMethod("Vaseegara",50000,"ReactJs");
		
		System.out.println(s1); 
		System.out.println(s2);
		System.out.println(s3);
		
		}  
}
