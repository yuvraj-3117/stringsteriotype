package com.springcore.steraotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext con = new ClassPathXmlApplicationContext("com/springcore/steraotpye/config.xml");

		Student student = con.getBean("student", Student.class);
		System.out.println(student);

		System.out.println(student.getAddress());
		System.out.println(student.getAddress().getClass().getPackageName());

		/*
		 * System.out.println(student.hashCode()); // hash code dedega same hashcode
		 * 
		 * Student student2 = con.getBean("student", Student.class);
		 * 
		 * System.out.println(student.hashCode());// same hashcode this is
		 * singletonscope
		 */
		  Teacher t1 = con.getBean("teacher", Teacher.class);
		 
		 Teacher t2 = con.getBean("teacher", Teacher.class);
		
		
		System.out.println(t1.hashCode());
		System.out.println(t2.hashCode());
	}

}
