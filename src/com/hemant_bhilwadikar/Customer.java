package com.hemant_bhilwadikar;

import java.util.Comparator;

public class Customer  {

int id;
String firstName;
String surName;

public Customer() {
	
}
		
public Customer(int id,
				String fistName,
				String surName) {
	this.id = id;
	this.firstName = fistName;
	this.surName = surName;	
}

public static final Comparator<Customer> POWER_COMPARATOR =
new Comparator<Customer>() {
  public int compare(Customer cust1, Customer cust2) {
    return Integer.compare(cust1.getId(), cust2.getId());
  }
};  

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getFirstName() {
	return firstName;
}

public void setFirstName(String firstName) {
	this.firstName = firstName;
}

public String getSurName() {
	return surName;
}

public void setSurName(String surName) {
	this.surName = surName;
}




}
