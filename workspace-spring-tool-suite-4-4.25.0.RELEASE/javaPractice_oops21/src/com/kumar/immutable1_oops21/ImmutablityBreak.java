/** 
 * If The class holds the reference of another class(mutable object),
 * then we must implement deep copy while returning mutable object 
 * reference from immutable * class.
 */
package com.kumar.immutable1_oops21;
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
	public Address getAddress() {
		return address;
	}
	
	public StudentImmutable(String name, int id,Address address) {
		this.address=address;
		this.id=id;
		this.name=name;
	}
	public String toString() {
		return "name : "+name+" Id : "+id+" Address : "+address;
		}
	
}
class Address{
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
	public String toString() {
		return "City : "+city+"State : "+state+" code : "+code;
	}
	
}
public class ImmutablityBreak {

	public static void main(String[] args) {
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
