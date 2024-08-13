package oop;

public class Student3getterssettersAddfunctinality {
	private String name;
	private String id;
	private String address;
	private int age;
	
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
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public String run() {
		if(name.equals("nandini") && id.equals("3325")&& address.equals("hyderabad") 
				&& age >18) {
			return "you are eligibe for vote";
		}else {
			return "you are not eligibe for vote";
		}
		}


}
