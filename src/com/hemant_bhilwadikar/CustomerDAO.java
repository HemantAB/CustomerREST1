package com.hemant_bhilwadikar;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CustomerDAO {
	public static List<Customer> custList = new ArrayList<Customer>();

	public int initialise(){
		//int id = 0;
		
		custList = new ArrayList<Customer>();
		Customer cust = new Customer();
		cust.setId(custList.size());
		cust.setFirstName("Eric");
		cust.setSurName("Johnson");
		
		custList.add(cust);
		
		cust = new Customer();
		cust.setId(custList.size());
		cust.setFirstName("Mark");
		cust.setSurName("Roberts");
		custList.add(cust);
		
		cust = new Customer();
		cust.setId(custList.size());
		cust.setFirstName("Peter");
		cust.setSurName("Pal");
		custList.add(cust);
		
		return 1;
	};
	
	public List<Customer> getCustomers(){
		return custList;
	};
	public boolean addCustomer(String firstName, String surName){
		Customer lastCustomer = custList.get(custList.size()-1);
		Customer cust = new Customer();
		cust.setId(lastCustomer.getId()+1);
		cust.setFirstName(firstName);
		cust.setSurName(surName);
		custList.add(cust);
		return true;
	}
	
	public boolean deleteCustomer(int id){		
	
			//Iterator i = custList.iterator();
			
			for (Iterator<Customer> iter = custList.listIterator(); iter.hasNext();  ) {
				Customer cust = iter.next() ;

				if (cust.getId() == id) {
					iter.remove();
					return true;
				}
			}
		
		return false;
		
	}
	
	
	
	

}
