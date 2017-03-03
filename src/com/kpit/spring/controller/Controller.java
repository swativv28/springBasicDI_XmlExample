/**
 * 
 */
package com.kpit.spring.controller;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

/**
 * @author swativ
 *
 */
public class Controller {
	/**
	 * @param applicationContextFile 
	 * @return 
	 * 
	 */
	public BeanFactory beanFactoryExample(String applicationContextFile) {
		Resource resource=new ClassPathResource(applicationContextFile);  
	    BeanFactory factory=new XmlBeanFactory(resource);
	    return factory;
	}

	public ApplicationContext applicationContextExample(String applicationContextFile) {
		ApplicationContext context =   
			    new ClassPathXmlApplicationContext(applicationContextFile);
		return context;
	}
}
