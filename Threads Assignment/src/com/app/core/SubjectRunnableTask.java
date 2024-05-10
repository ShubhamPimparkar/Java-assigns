package com.app.core;

import java.io.IOException;
import java.util.Map;

import utils.StudentCollectionUtils;

public class SubjectRunnableTask  implements Runnable {
	
	private Map<String,Student> map;
	private String fname;
	private String subject;
	
	public SubjectRunnableTask(Map<String,Student> map,String fname,String subject) {
		
		this.map=map;
		this.fname=fname;
		this.subject=subject;
	}
	
	
	@Override
	public void run() {
	
		try {
			StudentCollectionUtils.sortbySubject(map,fname,subject);
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName() + " Subject Over.");
	}

}
