package com.kumar.objectMethods6_oops19;


class Company implements Cloneable{
	String companyName;
	String ceoName;
	
	public Object clone() throws CloneNotSupportedException{
		return super.clone();
	}
	public String toString() {
		return "Company Name: " + companyName + " CEO Name : " + ceoName;
	}
}


class Customer implements Cloneable{
	String custName;
	int custId;
	Company company;
	
	public Customer(String custName, int custId, Company company) {
		this.company=company;
		this.custId=custId;
		this.custName=custName;
	}
	
	public Object clone() throws CloneNotSupportedException{
		Customer customer =(Customer) super.clone();
		Company company = (Company) this.company.clone();
		customer.company=company;
		return customer;
	}
	
	public String toString() {
		return "Customer Id : "+custId+" Customer Name : "+ custName+" Company : "+company;
	}
}
public class DeepCopy {

	public static void main(String[] args) {
		
		try {
			Company company = new Company();
			company.ceoName="Harish";
			company.companyName="AAruvi";
			
			Customer customer1 = new Customer("Nani", 1, company);
			
			Customer customer2 = (Customer) customer1.clone();
			
			System.out.println(customer1);
			System.out.println(customer2);
			
			customer1.company.ceoName="Ramana";
			customer1.custName="Sony";
			
			System.out.println(customer1);
			System.out.println(customer2);
		}
		
		catch(CloneNotSupportedException c){
			
			System.out.println("Exception occured "+c.getMessage());
			
		}
	}
}