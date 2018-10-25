package threesolid;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class TestWorker {
	private Worker w = new Worker();
	@Test
	@DisplayName("Work Method Test")
	public void testWorkMethod()
	{
		assertEquals(w.work(),"I'm working already!", "Mismatch between test text and method text");
	}
};