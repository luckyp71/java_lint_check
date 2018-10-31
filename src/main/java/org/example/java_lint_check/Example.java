package org.example.java_lint_check;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Example {

	//Create LOGGER object by passing one argument i.e. package and name of this class
	private static final Logger LOGGER = Logger.getLogger(Example.class.getName());
	
	public static void main (String... args) {
		LOGGER.warning("Test "+LOGGER.getName());

	}
	
}
