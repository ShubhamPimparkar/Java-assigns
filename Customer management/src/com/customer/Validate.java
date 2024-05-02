package com.customer;

import java.util.List;

public class Validate {
	public static void validmail(String mail,List<Customer> cr) throws CustomerException {
		Customer ctemp = new Customer(mail);
		if(cr.contains(ctemp))
			throw new CustomerException("------------Duplicate Mail------------");
			
		/*for(Customer c : cr) {
			if(c!=null && ctemp.equals(c)) {
				throw new CustomerException("------------Duplicate Mail------------");
			}
		}*/
	
	}
	public static Customer validLogin(String mail,String pass,List<Customer> cr) throws CustomerException {	
//		for (Customer customer : cr) {
//			
//			if(customer.getPasswd().equals(pass) && customer.getMail().equals(mail) ) {
//				 return cr.indexOf(customer);
//			
//			}
//			
//		}
//		throw new CustomerException("--------------Invalid Credentials----------------");
//		
		Customer cst = new Customer(mail);
		int indx = cr.indexOf(cst);
		if(indx<0) {
			throw new CustomerException("--------------Invalid Mail----------------");
		}
		if(cr.get(indx).getPasswd().equals(pass)) {
			return cr.get(indx);
			
		}
		throw new CustomerException("--------------Invalid Passwd----------------");
		
		
	}
	public static Subscription vaildSub(String sub , double amt) throws CustomerException {
		
		try {
		Subscription sb = Subscription.valueOf(sub.toUpperCase());
		
		double prce = sb.getPrice(sb);
		if(prce != amt) {
			throw new CustomerException("---------------Invalid Price---------------");	
		}
		return sb;
		}
		catch (Exception e) {
			throw new CustomerException("Invalid Plan");
			
		}
	}
	
	
	
}
