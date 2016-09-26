package com.tutorialspoint.byname;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.tutorialspoint.byname.TextEditor;

public class MainApp {

	public static void main(String[] args) {
		ApplicationContext context = 
				new ClassPathXmlApplicationContext("Beans3.xml");

		TextEditor te = (TextEditor) context.getBean("textEditor");
		
		te.spellCheck();
	}

}