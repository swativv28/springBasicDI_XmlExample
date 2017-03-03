/**
 * 
 */
package com.kpit.spring.bean;

/**
 * @author swativ
 *
 */
public class Teachers {
	String name;
	String subject;
	
	public Teachers(String name, String subject) {
		super();
		this.name = name;
		this.subject = subject;
	}

	@Override
	public String toString() {
		return "Teachers [name=" + name + ", subject=" + subject + "]";
	}
	
}
