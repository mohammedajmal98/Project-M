package com.udemyRK.learnspringframework.examples.c1;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component //or @Service (for Class contains 'Business Logic")
public class BusinessCalculationService {
	
//	@Autowired
//	@Qualifier("mySQLDataService")
	private DataService dataService;
	
	//@Qualifier -> directly mention as parameter with Class (aka) bean name (1st letter lowercase)
	public BusinessCalculationService(@Qualifier("mySQLDataService") DataService dataService) {
		super();
		this.dataService = dataService;
	}


	public int findMax() {
		//Business Logic for returning Maximum number from an Integer array
		return Arrays.stream(dataService.retrieveData()).max().orElse(0);
	}

}
