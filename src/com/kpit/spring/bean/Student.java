/**
 * 
 */
package com.kpit.spring.bean;

import java.util.List;
import java.util.Map;

/**
 * @author swativ
 *
 */
public class Student {
	private String name;  
	private Address address;
	private List<String> subjects;
	private List<Teachers> teachers;
	private Map<String, String> teacherSubjectMapping;
	private Map<Teachers, Address> teacherAddressMapping;
	
	public Student(String name) {
		super();
		this.name = name;
	}

	public String getName() {  
	    return name;  
	}  
	  
	public void setName(String name) {  
	    this.name = name;  
	}

	public Student( String name, Address address) {  
	    super();  
	    this.name = name;  
	    this.address = address;  
	}
	
	public Student(String name, Address address, List<String> subjects) {
		super();
		this.name = name;
		this.address = address;
		this.subjects = subjects;
	}
	
	

	public Student(String name, Address address, List<String> subjects,
			List<Teachers> teachers) {
		super();
		this.name = name;
		this.address = address;
		this.subjects = subjects;
		this.teachers = teachers;
	}
	
	

	public Student(String name, Address address, List<String> subjects,
			List<Teachers> teachers, Map<String, String> teacherSubjectMapping) {
		super();
		this.name = name;
		this.address = address;
		this.subjects = subjects;
		this.teachers = teachers;
		this.teacherSubjectMapping = teacherSubjectMapping;
	}
	
	

	public Student(String name, Address address, List<String> subjects,
			List<Teachers> teachers, Map<String, String> teacherSubjectMapping,
			Map<Teachers, Address> teacherAddressMapping) {
		super();
		this.name = name;
		this.address = address;
		this.subjects = subjects;
		this.teachers = teachers;
		this.teacherSubjectMapping = teacherSubjectMapping;
		this.teacherAddressMapping = teacherAddressMapping;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", address=" + address + ", subjects="
				+ subjects + ", teachers=" + teachers
				+ ", teacherSubjectMapping=" + teacherSubjectMapping
				+ ", teacherAddressMapping=" + teacherAddressMapping + "]";
	}

	  
//	public void displayInfo(){  
//	    System.out.println("Hello: "+name);  
//	}  
}
