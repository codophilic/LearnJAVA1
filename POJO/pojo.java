
public class pojo{
    public static void main(String args[]){
        Employee em = new Employee("Harsh","123",100000);
        System.out.println(em.getName());
    }
}

// Employee POJO class to represent entity Employee
public class Employee
{
	// default field
	String name;

	// public field
	public String id;

	// private salary
	private double salary;

	//arg-constructor to initialize fields
	public Employee(String name, String id,double salary)
	{
		this.name = name;
		this.id = id;
		this.salary = salary;
	}

	// getter method for name
	public String getName()
	{
		return name;
	}

	// getter method for id
	public String getId()
	{
		return id;
	}

	// getter method for salary
	public Double getSalary()
	{
		return salary;
	}
}


