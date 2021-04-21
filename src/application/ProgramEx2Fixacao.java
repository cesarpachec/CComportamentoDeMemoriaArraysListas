package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class ProgramEx2Fixacao {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("How many employees will be registered? ");
		int quantity = sc.nextInt();
		
		Employee[] employee = new Employee[quantity];

		for (int i = 1; i <= employee.length; i++) {
			
			System.out.println("Employee #" + i);
			
			System.out.print("Id: ");
			int id = sc.nextInt();
			
			sc.nextLine();
			System.out.print("Name: ");
			String name = sc.nextLine();
			
			System.out.print("Salary: ");
			double salary = sc.nextDouble();
			
			employee[i-1] = new Employee(id, name, salary);
			
		}
		
		System.out.print("Enter the Employee's id that will have salary increased: ");
		int idToIncrease = sc.nextInt();
		
		boolean increasedSalary = false;
		for (int i = 0; i < employee.length; i++) {
			if (employee[i].getId() == idToIncrease) {
				System.out.print("Enter the percentage: ");
				double percentageIncrease = sc.nextDouble();
				employee[i].increaseSalary(percentageIncrease);
				increasedSalary = true;
			}
		}
		
		if (!increasedSalary) {
			System.out.println("This id does not exist!");
		}
		
		System.out.println("List of employees: ");
		for (int i = 0; i < employee.length; i++) {
			System.out.println(employee[i]);
		}
		
		sc.close();
		
	}

}
