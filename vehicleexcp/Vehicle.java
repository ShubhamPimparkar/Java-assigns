package com.vehicleexcp;

//import java.util.Date;

public class Vehicle {
	private String vhname;
	private String chasisNo;
	private Colors emcolor;
	private double price;
//	private Date mgDate; 
//	private Date expDate;
	private double pollutionLevel;
	
	public Vehicle(String vhname,String chasisNo,Colors emcolor,double price,double pollutionLevel) {
		
		this.vhname=vhname;
		this.chasisNo=chasisNo;
		this.emcolor=emcolor;
		this.price=price;
		this.pollutionLevel=pollutionLevel;
		
	}
	
	public String getVhname() {
		return vhname;
	}

	public void setVhname(String vhname) {
		this.vhname = vhname;
	}

	public String getChasisNo() {
		return chasisNo;
	}

	public void setChasisNo(String chasisNo) {
		this.chasisNo = chasisNo;
	}

	public Colors getEmcolor() {
		return emcolor;
	}

	public void setEmcolor(Colors emcolor) {
		this.emcolor = emcolor;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getPollutionLevel() {
		return pollutionLevel;
	}

	public void setPollutionLevel(double pollutionLevel) {
		this.pollutionLevel = pollutionLevel;
	}

	@Override
	public String toString() {
		return "Vehicle [Name = "+vhname+" chasisNo= " + chasisNo + ", emcolor= " + emcolor + ", price= " + price + ", pollutionLevel= "
				+ pollutionLevel + "]";
	}
	
	
	
	
}
