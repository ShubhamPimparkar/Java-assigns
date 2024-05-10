package utils;

import static com.app.core.Subject.ANGULAR;
import static com.app.core.Subject.DBT;
import static com.app.core.Subject.JAVA;
import static com.app.core.Subject.REACT;
import static java.time.LocalDate.parse;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.app.core.Address;
import com.app.core.Student;
import com.app.core.Subject;

public class StudentCollectionUtils {
	private static int index;

	 public static List<Student> populateList() {
		List<Student> students = new ArrayList<>(
				Arrays.asList(new Student("dac-001", "ravi", parse("1999-12-13"), ANGULAR, 3.2),
						new Student("dac-009", "riya", parse("1998-12-13"), REACT, 6.9),
						new Student("dac-004", "shekhar", parse("1997-12-13"), DBT, 5.9),
						new Student("dac-002", "priya", parse("1999-02-23"), JAVA, 4.7),
						new Student("dac-007", "kiran", parse("1996-02-13"), JAVA, 7.1),
						new Student("dac-003", "meeta", parse("1998-12-19"), JAVA, 5.2),
						new Student("dac-008", "sameer", parse("1997-12-06"), JAVA, 8.2)));
		List<Address> adrs = Arrays.asList(new Address("pune", "MH", "452446"), new Address("pune", "MH", "652446"),
				new Address("nagpur", "MH", "852446"), new Address("indore", "MP", "752446"),
				new Address("mumbai", "MH", "672446"), new Address("pune", "MH", "692446"),
				new Address("chennai", "TN", "862446"));

		students.forEach(s -> s.assignAddress(adrs.get(index++)));
		index=0;
		return students;// rets populated growable list of students with adr
	}

	// add a static method to accept list of student details & rets a map populated with the same
	public static Map<String, Student> populateMap(List<Student> 
	list) {
		HashMap<String, Student> hm = new HashMap<>();
		//declarative (FP) 
		list.forEach(s -> hm.put(s.getRollNo(), s));
		return hm;

	}
	public static void dobsort(Map<String,Student> map,String fname) throws IOException {

		PrintWriter pw = new PrintWriter(new FileWriter(fname));
		map.values().stream().sorted((s1,s2) -> s1.getDob().compareTo(s2.getDob())).forEach(v->pw.println(v));
		pw.close();
		
	}

	public static void sortbySubject(Map<String, Student> map, String fname,String subject) throws IOException {
		PrintWriter pw = new PrintWriter(new FileWriter(fname));
		Subject sub = Subject.valueOf(subject.toUpperCase());
		map.values().stream().filter(v -> v.getSubject().equals(sub)).sorted((s1,s2) -> ((Double)s1.getGpa()).compareTo(s2.getGpa()))
		.forEach(v -> pw.println(v));
		pw.close();
		
	}
	
	
}
