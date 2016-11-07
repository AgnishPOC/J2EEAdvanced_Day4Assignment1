package Day4.Assignment1;

import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Name");
		String name = scan.nextLine();
		System.out.println("Enter the Age");
		int age = scan.nextInt();
		System.out.println("Enter the Employee Number");
		int empNo = scan.nextInt();
		System.out.println("Enter the Salary");
		double salary = scan.nextDouble();
		System.out.println("Enter the Department");
		String dept = scan.next();
		System.out.println("Enter the Location");
		String location = scan.next();

		scan.close();

		Employee emp = new Employee(name, age, salary, location, dept, empNo);

		System.out.println("---------DETAILS OF THE EMPLOYEE---------");
		System.out.println("Name :" + emp.getName());
		System.out.println("Name :" + emp.getAge());
		System.out.println("Name :" + emp.getEmpNo());
		System.out.println("Name :" + emp.getSalary());
		System.out.println("Name :" + emp.getDepartment());
		System.out.println("Name :" + emp.getLocation());

	}
}
