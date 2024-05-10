package com.tester;

import java.util.Map;
import java.util.Scanner;

import com.app.core.DobRunnableTask;
import com.app.core.Student;
import com.app.core.SubjectRunnableTask;

import utils.StudentCollectionUtils;

public class Test1 {

	public static void main(String[] args) {
		try(Scanner sc= new Scanner(System.in) ){
			System.out.println("Enter name of File for Storing Dob - ");
			String fname = sc.next();
			System.out.println("Enter name of File for Storing Subjects- ");
			String fname2 = sc.next();
			System.out.println("Enter name of Subject - ");
			String sub = sc.next();
			
			Map<String,Student > map = StudentCollectionUtils.populateMap(StudentCollectionUtils.populateList());
			
//			DobRunnableTask d1 = new DobRunnableTask(map, fname);
			Thread t1 = new Thread(new DobRunnableTask(map, fname),"One");
			
//			Save student details of the specified subject sorted as per GPA in another file
			Thread t2 = new Thread(new SubjectRunnableTask(map, fname2, sub),"Two");
			t1.start();
			t2.start();
			t1.join();
			t2.join();
			
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("-----------Main Over--------------");

	}

}
