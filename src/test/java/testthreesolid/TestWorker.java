package threesolid;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class TestWorker {
	private Worker w = new Worker();

	@Test
	@DisplayName("Work Method Test")
	public void testWorkMethod() {
		assertEquals(w.work(), "Working...\n", "Mismatch between test text and method text");
	}
	/*
	 * return "Typical worker eating\n"; }
	 * 
	 * public String sick() { return ;
	 */

	@Test
	@DisplayName("Eat Method Test")
	public void testEatMethod() {
		assertEquals(w.eat(), "Typical worker eating\n", "Expected to pass");
	}

	@Test
	@DisplayName("Sick Method Test")
	public void testSickMethod() {
		assertEquals(w.sick(), "Regular worker fl", "Expected to fail");
	}
};