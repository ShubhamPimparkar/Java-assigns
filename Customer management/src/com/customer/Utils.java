package com.customer;

import java.time.LocalDate;
import java.util.List;

public class Utils {
	
	public static Customer signup(String name, String mail,String pass,String dob,String plan ,double price,List<Customer> cst) throws CustomerException {
		
			
			Validate.validmail(mail,cst);
			
			LocalDate ldob = LocalDate.parse(dob);
			
//			try {
			Subscription sb = Validate.vaildSub(plan, price);
			return new Customer(name,mail,pass,ldob,sb,price);
//			}
//			catch (Exception e) {
//				throw new CustomerException("-----------Invalid Plan-------");
//			}
			
		
		
	}
	
	public static void dispall(List<Customer> cr) {
		
		for(Customer list : cr) {
			System.out.println(list);
		}
		
		/*
		 * for (int i = 0; i < cr.length; i++) { System.out.println(cr[i]); }
		 */
		
	}
	public static Customer signin(String mail,String passwd,List<Customer> list) throws CustomerException {
		Customer cr =Validate.validLogin(mail,passwd,list);
		return cr;
	}

	public static void updtPass(String mail,String pass, List<Customer> cr) throws CustomerException {
		signin(mail,pass,cr);
		cr.indexOf(cr);
		
	}
	
}
