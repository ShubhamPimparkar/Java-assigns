package com.customer;

import java.util.Comparator;

public class ComparatorClass implements Comparator<Customer> {
	@Override
	public int compare(Customer c1,Customer c2) {
		
		System.out.println("------------IN COMPARE-----------");
		if(c1.getDob().equals(c2.getDob())) {
			
			return c1.getName().compareTo(c2.getName());
		}
		return c1.getDob().compareTo(c2.getDob());
	
	}
}
