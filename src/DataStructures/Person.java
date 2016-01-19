package DataStructures;

public class Person {
	
	private String name, address, phoneNum;
	private char gender;
	private int social, age;
	
	public Person(String name, int age, char gender, int social, String phoneNum, String address){
		this.name = name;
		this.age = age;
		this.social = social;
		this.phoneNum = phoneNum;
		this.address = address;
		setGender(gender);
	}
	
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

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		if (gender =='m' || gender == 'f' || gender == 'n')
		this.gender = gender;
	}

	public int getSocial() {
		return social;
	}

	public void setSocial(int social) {
		this.social = social;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getPhoneNum() {
		return phoneNum;
	}

	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}
}
