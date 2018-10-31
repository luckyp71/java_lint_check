package org.example.java_lint_check;

import java.util.logging.Logger;

/*
 * If you'd like to do a lint check the good approach, just comment the bad approach's line of codes and uncomment the good one,
 * you'll see the highlight in blue color disappear (means that there is no potential bug in your code / you applied a good code quality).
 *
 */

public class App {
	
	//Bad approach
//	public static Logger logger = Logger.getLogger(App.class.getName());
	
	//Good approach by adding final keyword
	public static final Logger logger = Logger.getLogger(App.class.getName());
	
    public static void main( String[] args ){
    	//Create app object
    	App app = new App();
    	
    	//Log the output
    	logger.info(String.valueOf(app.getName("Lucky")));
    }
    
    public boolean getName(String name) {
    	
    	//Bad approach
    	if(name != "") {
    		return true;
    	}else {
    		return false;
    	}
    	
    	//Good approach
//    	boolean result;
//    	if (name != "") {
//    		result = true;
//    	} else {
//    		result = false;
//    	}
//    	return result;
    }
    
}