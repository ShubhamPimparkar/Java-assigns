package com.app.core;

import java.io.IOException;
import java.util.Map;

import utils.StudentCollectionUtils;

public class DobRunnableTask implements Runnable{
	
	private Map<String,Student> map;
	private String name;
	
	public DobRunnableTask(Map<String,Student> map,String fname) {
		this.map=map;
		this.name=fname;
	}
	
	@Override
	public void run() {
		try {
			
			StudentCollectionUtils.dobsort(map,name);
			
		} catch (IOException e) {
		
			e.printStackTrace();
		}
		
		System.out.println(Thread.currentThread().getName() + " DOB Over.");
	}

	
	
}
