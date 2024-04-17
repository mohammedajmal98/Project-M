package com.udemyRK.springboot.myfirstwebapp.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SayHelloController {
	
	//Url: http://localhost:8080/say-hello
	@RequestMapping("say-hello")
	@ResponseBody //It will return whatever is returned by this below method 
	//as it is (same text) to the browser
	public String sayHello() {
		return "Hello! What are you learning today?";
	}
	
	//Hardcoding HTML
	@RequestMapping("say-hello-html")
	@ResponseBody 
	public String sayHelloHtml() {
		StringBuffer sb = new StringBuffer();
		sb.append("<html>");
		sb.append("<head>");
		sb.append("<title>HTML Page of mine</title>");
		sb.append("</head>");
		sb.append("<body>");
		sb.append("I am inside the hardcoded html using StringBuffer");
		sb.append("</body>");
		sb.append("</html>");
		
		return sb.toString();	
		//hardcoding html seems complex, right? Just try 'Views'
	}
	
	
	//Using JSP (Views) - Java/Jakarta Server Pages
	//Create Jsp file in this folder as Spring Boot's regulation - 
	//src/main/resources/META-INF/resources/WEB-INF/jsp/sayHello.jsp
	//Also, add prefix and suffix in application.properties
	//If we need to run JSPs in tomcat we need to add the 
		//dependency in pom.xml -> jasper
	
	@RequestMapping("say-hello-jsp")
	//@ResponseBody - No need of this as below return type is jsp file
	public String sayHelloJsp() {
		return "sayHello"; //It returns sayHello.jsp file from that folder
	}

	
	
	
}
