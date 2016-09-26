package com.tutorialspoint.setterbased;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.tutorialspoint.setterbased.TextEditor;;

public class MainApp {

	public static void main(String[] args) {
		ApplicationContext context = 
				new ClassPathXmlApplicationContext("Beans2.xml");

		TextEditor te = (TextEditor) context.getBean("textEditor");
		
		te.spellCheck();
	}

}
