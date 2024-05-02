package com.customer;

import java.time.LocalDate;
import java.util.List;

public class Customer implements Comparable<Customer> {

	private String name;
	private String mail;
	private String passwd;
	private LocalDate dob;
	private Subscription enmsub;
	private double registerPrice;
	private  int custid;
	private static int counter;
	static {
		counter=0;
	}
	public Customer(String name, String mail, String passwd,LocalDate dob, Subscription enmsub, double registerPrice) {
		super();
		this.custid = counter++;
		this.name = name;
		this.mail = mail;
		this.passwd = passwd;
		this.dob=dob;
		this.enmsub = enmsub;
		this.registerPrice = registerPrice;
	}

	public Customer(String mail) {
		this.mail = mail;
	}
	public Customer(String mail,String pass) {
		this.passwd = pass;
		this.mail = mail;
	}

	public int getCustid() {
		return custid;
	}

	public void setCustid(int custid) {
		this.custid = custid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getPasswd() {
		return passwd;
	}

	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}

	public Subscription getEnmsub() {
		return enmsub;
	}

	public void setEnmsub(Subscription enmsub) {
		this.enmsub = enmsub;
	}

	public double getRegisterPrice() {
		return registerPrice;
	}

	public void setRegisterPrice(double registerPrice) {
		this.registerPrice = registerPrice;
	}

	
	public LocalDate getDob() {
		return dob;
	}

	public void setDob(LocalDate dob) {
		this.dob = dob;
	}
	
	
	@Override
	public String toString() {
		return "Customer [custid=" + custid + ", name=" + name + ", mail=" + mail + ", passwd=" + passwd + ", dob="
				+ dob + ", enmsub=" + enmsub + ", registerPrice=" + registerPrice + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Customer) {
			return this.mail.equals(((Customer)obj).getMail());
		}
		return false;
	}
	@Override
	public int compareTo(Customer customer) {
		
		System.out.println("----------IN COMPARETO----------");
		if(this.getMail().length()>customer.getMail().length()) {
			return 1;
			
		}
		if(this.getMail().length()<customer.getMail().length()) {
			return -1;
			
		}
		
		return 0;
		
	}
	
}
