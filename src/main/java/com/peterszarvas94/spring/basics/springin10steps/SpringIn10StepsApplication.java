package com.peterszarvas94.spring.basics.springin10steps;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringIn10StepsApplication {

	// What are the beans? (new XYZ()) @Component
	// What are the dependencies of a bean? @Autowired
	// Where to search for beans? @SpringBootApplication auto-scan the packages

	public static void main(String[] args) {
		// without Spring:
		// BinarySearchImpl binarySearch = new BinarySearchImpl(new
		// QuickSortAlgorithm());
		// int result = binarySearch.binarySearch(new int[] { 12, 4, 6 }, 3);

		// with Spring: Application Context:
		ApplicationContext applicationContext = SpringApplication.run(SpringIn10StepsApplication.class, args);
		BinarySearchImpl binarySearch = applicationContext.getBean(BinarySearchImpl.class);
		int result = binarySearch.binarySearch(new int[] { 12, 4, 6 }, 3);

		System.out.println(result);
	}

}
