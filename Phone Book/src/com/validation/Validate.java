package com.validation;

import java.time.LocalDate;
import java.util.Set;

import com.contact.Contact;

public class Validate {
	public static void validContact(Set<Contact> set,String name,String dob) throws ContactExcep {
		LocalDate dob2 = LocalDate.parse(dob);
		Contact cont = new Contact(name,dob2);
		if(!set.contains(cont)) {
			throw new ContactExcep("-----------Contact not found----------");
		}
		
	}
}
