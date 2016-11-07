package Day4.Assignment1;

public class Employee {

	private int age;
	private double salary;
	private String location;
	private String department;
	private int empNo;

	public String getName() {
		return name;
	}

	private String name;

	public Employee(String name, int age, double salary, String location, String department, int empNo) {
		super();
		this.name = name;
		this.age = age;
		this.salary = salary;
		this.location = location;
		this.department = department;
		this.empNo = empNo;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public int getEmpNo() {
		return empNo;
	}

	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}
}
