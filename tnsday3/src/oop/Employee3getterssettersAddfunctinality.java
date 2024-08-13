package oop;

public class Employee3getterssettersAddfunctinality {
	private String name;
	private String id;
	private String address;
	private int salary;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
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
	public void setSalary(int age) {
		this.salary = salary;
	}
	
	public String run() {
		if(name.equals("nandini") && id.equals("3325")&& address.equals("hyderabad") 
				&& salary >50000) {
			return "you are getting A grade salary";
		}else {
			return "you are getting lower grde salary";
		}
		}



}
