package com.example;

import java.util.HashSet;
import java.util.Set;

public class Question03 {

	public static void main(String[] args) {
		Set<Employee> employees = new HashSet<>();
		employees.add(new Employee("123","Jack Bauer",10_000));
		employees.add(new Employee("123","Jack Bauer",10_000));
		employees.add(new Employee("123","Jack Bauer",10_000));
		employees.add(new Employee("123","Jack Bauer",10_000));
		employees.add(new Employee("123","Jack Bauer",10_000));
		employees.add(new Employee("123","Jack Bauer",10_000));
		employees.add(new Employee("123","Jack Bauer",10_000));
		employees.add(new Employee("123","Jack Bauer",10_000));
		employees.add(new Employee("123","Jack Bauer",10_000));
		employees.add(new Employee("123","Jack Bauer",10_000));
		System.out.println(employees.size());
		//System.out.println(employees.contains(new Employee("123","Jack Bauer",10_000)));
	}

}

class Employee {
	private String identity;
	private String fullname;
	private double salary;

	public Employee(String identity, String fullname, double salary) {
		this.identity = identity;
		this.fullname = fullname;
		this.salary = salary;
	}

	public String getIdentity() {
		return identity;
	}

	public String getFullname() {
		return fullname;
	}

	public double getSalary() {
		return salary;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((identity == null) ? 0 : identity.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (identity == null) {
			if (other.identity != null)
				return false;
		} else if (!identity.equals(other.identity))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Employee [identity=" + identity + ", fullname=" + fullname + ", salary=" + salary + "]";
	}

}