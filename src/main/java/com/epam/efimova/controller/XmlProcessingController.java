package com.epam.efimova.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;



@Controller
public class XmlProcessingController {

	/*
	 * Demonstrate processing of document.
	 * Create simple xsd and dtd. 
	 * Error pages.
	 * Minimal valid xml document.
	 */
@RequestMapping(value="/xml/sax", method=RequestMethod.GET)
	public String sax(){
		return "";
	}
@RequestMapping(value="/xml", method=RequestMethod.GET)
public String xml(){
	try {
	//	CustomClassLoader.main(new String[]{"Foo.class"});
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return "xml";
}
}
