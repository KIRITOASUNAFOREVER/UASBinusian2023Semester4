package uas.code.reengineering.satu;
/*
 * 
 * Smell code			:
 * potential cause(s)	:
 * solution(s)			:
 * 
 */
public class Person {
	public String code;
	public String name;
	public String address;
	public String phone;
	public String email;
	public Person(String code, String name, String address, String phone, String email) {
		super();
		this.code = code;
		this.name = name;
		this.address = address;
		this.phone = phone;
		this.email = email;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
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
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}	
}
