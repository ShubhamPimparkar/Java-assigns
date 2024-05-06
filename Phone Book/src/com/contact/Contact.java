package com.contact;

import java.time.LocalDate;

public class Contact implements Comparable<Contact> {
	
	private String number;
	private String name;
	private LocalDate dob;
	private String mail;
	public Contact(String number, String name, LocalDate dob, String mail) {
		super();
		this.number = number;
		this.name = name;
		this.dob = dob;
		this.mail = mail;
	}
	public Contact(String name,LocalDate dob) {
		this.name=name;
		this.dob=dob;
	}
	
	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getDob() {
		return dob;
	}

	public void setDob(LocalDate dob) {
		this.dob = dob;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	@Override
	public String toString() {
		return "Contact [number=" + number + ", name=" + name + ", dob=" + dob + ", mail=" + mail + "]";
	}
	
	@Override
	public boolean equals(Object o) {
		
		if(o instanceof Contact) {
			Contact c = (Contact)o;
			return this.getName().equals(c.getName()) && this.getDob().equals(c.getDob());		
		}
		return false;
	}
	@Override
	public int hashCode() {
		return 17*getName().hashCode();
	}
	@Override
	public int compareTo(Contact o) {
		
		if(this.getName().compareTo(o.getName())==0) {
			return this.getDob().compareTo(o.getDob());
			
		}
		return this.getName().compareTo(o.getName());
	}

}
