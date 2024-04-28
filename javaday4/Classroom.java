package com.javaday4;

public class Classroom {
	private int roomid;
	private String roomname;
	Teacher teach;
	
	Classroom(){
		
	}
	Classroom(int roomid,String roomname,Teacher teach){
		this.roomid=roomid;
		this.roomname=roomname;
		this.teach=teach;			
	}
	
	@Override
	public String toString() {
		return "Roomid is - " + roomid + ", Roomname is - " + roomname + teach;
	}
	
}
