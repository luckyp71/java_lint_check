package org.example.java_lint_check;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class AppTest {

	private App app = new App();
	
	@Test
	public void testGetName() {
		boolean expectedResult = true;
		boolean actualResult = this.app.getName("Lucky");
		assertEquals(expectedResult, actualResult);
	}
	
}