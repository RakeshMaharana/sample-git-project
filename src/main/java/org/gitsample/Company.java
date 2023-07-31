package org.gitsample;

public class Company 
{
	// adding comment from GitHub; Edit file directly on console
	private String name;
	private String address;
	private int salary;
	private int counter;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Company [name=" + name + ", address=" + address + ", salary=" + salary + "]";
	}
	
	// second commit with comment
	
}
