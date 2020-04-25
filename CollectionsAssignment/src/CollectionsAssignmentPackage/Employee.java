package CollectionsAssignmentPackage;

public class Employee implements Comparable<Employee> {
	private int id; 
	private String name; 
	private int salary;
	public int getId() {
		return id;
	}
	public Employee(int id) {
		super();
		this.id = id;
		
	}
	public String getName() {
		return name;
	}
	public int getSalary() {
		return salary;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	
	public boolean equals(Employee o) {
		Employee e = (Employee) o;
		return this.getId() == e.getId();
		
	}
	
	public int hashCode() {
		return this.getId();
	}
	
	@Override
    public int compareTo(Employee o) {

        if(this.getId() < o.getId())

        return 1;

        else if(this.getId() > o.getId())

        return -1;

        else

        return 0;

}

}
