/** 
 * Deep Cloning to protect Immutablity by also having cloning in constructor
 
 */
package com.kumar.immutable3._oops21;


final class StudentImmutable{
	private final String name;
	private final int id;
	private final Address address;
	public String getName() {
		return name;
	}
	public int getId() {
		return id;
	}
//	public Address getAddress() throws CloneNotSupportedException {
//		return (Address) address.clone();
//	}
	
	public StudentImmutable(String name, int id,Address address) throws CloneNotSupportedException {
		this.address=(Address) address.clone();
		this.id=id;
		this.name=name;
	}
//	public String toString() {
//		return "name : "+name+" Id : "+id+" Address : "+address;
//		}
	
}
class Address implements Cloneable{
	private String city;
	private String state;
	private int code;
	
	public Address(String city, String state, int code) {
		this.city=city;
		this.code=code;
		this.state=state;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
//	public String toString() {
//		return "City : "+city+"State : "+state+" code : "+code;
//	}
	
}
public class Immutable {

	public static void main(String[] args) throws CloneNotSupportedException{
		Address address = new Address("Atlanta","GA",30089);
		StudentImmutable student1 = new StudentImmutable("akshitha", 1, address);
		System.out.println(address);
		System.out.println(student1);
		
		//modifying the address object's code
		System.out.println();
		address.setCode(12343);
		
		System.out.println(address);
		System.out.println(student1);
		
	}

}