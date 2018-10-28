package threesolid;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class TestWorker {
	
	private Robot r = new Robot();
	@Test
	@DisplayName("newtest<mfj>RobotPass")
	public void RobotPass(){
		assertEquals(r.reboot(), "Machine rebooting\n", "Correct");
	}
	
	
	@Test
	@DisplayName("newtest<mfj>RobotFail")
	public void RobotFail(){
		assertEquals(r.reboot(), "Machine rebooting right now...\n", "incorrect");
		System.out.format("FAILEDDD\n");
	}	
		
	
	
};