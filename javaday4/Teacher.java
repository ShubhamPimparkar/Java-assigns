package com.javaday4;

public class Teacher {
	private int teachid;
	private String name;
	Desg desg;
	
	Teacher(int teachid,String name,Desg desg){
		this.teachid=teachid;
		this.name=name;
		this.desg=desg;			
	}
	
	public int getTeachid() {
		return teachid;
	}
	public void setTeachid(int teachid) {
		this.teachid = teachid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Desg getDesg() {
		return desg;
	}
	public void setDesg(Desg desg) {
		this.desg = desg;
	}
	static int counter = 0;
	Teacher(){
		
		
	}
	Teacher(String name,Desg desg){
		counter++;
		this.teachid=counter+7;
		this.name=name;
		this.desg=desg;
	}
	
	@Override
	public String toString() {
		return "Teacher id - " + teachid + ",Teacher name - " + name + ",Desg - " + desg;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
