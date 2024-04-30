package com.bankassigns;

import java.time.LocalDate;

public class BankAcc {
	private int acctno;
	private String fname;
	private String lname;
	private AccTyp acctype;
	private LocalDate dob;
	private LocalDate cdate;
	private double bal;
	
	public BankAcc(int acctno, String fname, String lname, AccTyp acctype, LocalDate dob2, LocalDate accdate, double bal) {
		super();
		this.acctno = acctno;
		this.fname = fname;
		this.lname = lname;
		this.acctype = acctype;
		this.dob = dob2;
		this.cdate = accdate;
		this.bal = bal;
	}
	public int getAcctno() {
		return acctno;
	}

	public void setAcctno(int acctno) {
		this.acctno = acctno;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public AccTyp getAcctype() {
		return acctype;
	}

	public void setAcctype(AccTyp acctype) {
		this.acctype = acctype;
	}

	public LocalDate getDob() {
		return dob;
	}

	public void setDob(LocalDate dob) {
		this.dob = dob;
	}

	public LocalDate getCdate() {
		return cdate;
	}

	public void setCdate(LocalDate cdate) {
		this.cdate = cdate;
	}

	public double getBal() {
		return bal;
	}

	public void setBal(double bal) {
		this.bal = bal;
	}
	
	@Override
	public String toString() {
		return "BankAcc [acctno=" + acctno + ", fname=" + fname + ", lname=" + lname + ", acctype=" + acctype + ", dob="
				+ dob + ", cdate=" + cdate + ", bal=" + bal + "]";
	}
	
	public void deposit(double amt) {
		this.bal+=amt;
		System.out.println("Amount Deposited, Current bal is - "+bal);
	}
	
	public void withdraw(double amt) throws MinBalException {
		
		Validation.validWith(bal-amt);
		this.bal-=amt;
		System.out.println("Amount Withdrawn, Current bal is - "+bal);
		
	}
	public void TransferFund(BankAcc ba,double amt) throws MinBalException {
		withdraw(amt);
		ba.deposit(amt);
		System.out.println("Transfer Success of "+amt);
	}

	

	
	
}

