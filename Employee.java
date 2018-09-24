package Collection;
import java.util.*;

		
class AgeComparator implements Comparator<Employee> 
{
	public int compare(Employee employee1, Employee employee2) 
	{
		int empage1 = employee1.getAge();
		int empage2 = employee2.getAge();

		if (empage1 > empage2) 
		{
			return 1;
		}
		else if (empage1 < empage2) 
		{
			return -1;
		} 
		else 
		{
			return 0;
		}
	}
}

public class Employee 
{
	private String name;
	private int Id;
	private int age;
	private String Department;

	Employee(int Id, String name,String Department,int age)
	{
	this.Id=Id;
	this.name=name;
	this.Department=Department;
	this.age=age;
	}
	
	public static void main(String[] args) 
	{
		//Scanner in =new Scanner(System.in);
		ArrayList<Employee> arraylist = new ArrayList<Employee>();
        arraylist.add(new Employee(1, "Karan","Develoment",22));
		arraylist.add(new Employee(1, "Sheetal","Finance",21));
		arraylist.add(new Employee(3, "Anuj","IT",30));
		  
		Iterator<Employee> itr=arraylist.iterator();    
		while(itr.hasNext())
		{  
		    Employee e1=(Employee)itr.next();  
		    System.out.println(e1.Id+" "+e1.name+" "+e1.age);  
		}
		Collections.sort(arraylist, new AgeComparator());
		
		System.out.println("Employee according to thier ages are ");
		for (Employee employee : arraylist ) 
		{
			System.out.println( employee.getAge());
		}

		search(arraylist);


	}
	
	public void setName(String taskName)
	{
		 this.name = taskName;
	}
	
	public String getName()
	{
		return this.name;
	}
		
	public void setId(int Id)
	{
		this.Id=Id;
	}
	
	public int getId()
	{
		return this.Id;
	}
	
	public void setAge(int age)
	{
		this.age=age;
	}
	
	public int getAge() 
	{
		return this.age;
	}

	public void setDepartment(String Department) 
	{
		this.Department=Department;
	}
	
	public String getDepartment()
	{
		return this.Department;
	}


	public static void search(ArrayList<Employee> arraylist)
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter Id for search:");
		int id= in.nextInt();
		System.out.println("Enter Name for search:");
		String nm= in.next();
		Iterator<Employee> itr=arraylist.iterator(); 
		while(itr.hasNext())
		{  
		    Employee e1=(Employee)itr.next();
		}
		System.out.println("Found");
	}
}

