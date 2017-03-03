/**
 * 
 */
package com.kpit.spring.main;


import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;  

import com.kpit.spring.bean.Student;
import com.kpit.spring.controller.Controller;

/**
 * @author swativ
 *
 */
public class Launcher {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Controller controller = new Controller();
		//bean factory example
		BeanFactory beanFactory= controller.beanFactoryExample("applicationContext.xml");  
		
		//Application Context example
		ApplicationContext context = controller.applicationContextExample("applicationContext.xml");  
		   
		//example of basic constructor injection (CI)
	    Student student=(Student)context.getBean("constructorDIwithNonStringMAP");  
	    System.out.println(student);
//	    student.displayInfo();  
	}

	

}
