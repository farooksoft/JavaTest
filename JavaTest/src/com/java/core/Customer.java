package com.java.core;

public class Customer {

	private int customerId = 10;
	protected String customerName = "Kiran";

	public void print() {
		System.out.println("Customer name : " + customerName + "and Id is :"
				+ customerId);
	}

	public static void main(String[] args) {
		Customer customer = new Customer();
		customer.print();
		
		Customer.Address address = new Customer().new Address();
		address.pri();
		
		Customer.Contact contact = new Customer().new Contact();
		contact.print();
		
	}
	
	class Address{
		// Can't access above class 'private' and 'protected' attributes, throws compilation error
		/*
		 * customerId = 20;
		 * customerName = "MCA";
		 * 
		 */
		private void pri() {
			System.out.println("Printing from Address class");
		}
	}
	class Contact{
		int customerId = 20;
		public void print() {
			System.out.println("printing from Contact class : "+customerId);
		}
	}
	
}
