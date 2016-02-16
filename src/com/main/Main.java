package com.main;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Main {
	public static void main(String[] args) throws BeansException {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfiguration.class);
        Translator translator = context.getBean(Translator.class);

		String translation = translator.translate("c:/1.txt");
		System.out.println(translation);
	}
}
