package advance.dev;

public class Student {

	private String name;
	private int age;
	private String address;
	private String phoneNumber;
	private double mark;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		if (age <= 0) return;
		this.age = age;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public double getMark() {
		return mark;
	}
	public void setMark(double mark) {
		if (mark < 0) return;
		this.mark = mark;
	}
	
	
}
