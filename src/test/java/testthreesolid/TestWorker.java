package threesolid;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class TestWorker {
 private Worker w = new Worker();
 @Test
 @DisplayName("newTest<kjy>WorkerPass")
 public void WorkerPass() {
 	 assertEquals(w.work(),"Working...\n", "Correct."); //Kristof York
 }
 
 public boolean calledOut(boolean hasFlu){ //Laura Rice
	 boolean result = false;
	 if(hasFlu){
		 return true;
	 }
	 return result;
 }
 
 @Test
 @DisplayName("newTest<lmr>WorkerPass")
 public void calledOutTest(){
	 assertTrue(calledOut(true),"Worker called out sick.");  //Laura Rice	 
 }
 
 @Test
 @DisplayName("newTest<lmr>WorkerFail()")
 public void calledOutTest() {
	 assertTrue(calledOut(2),"Called out test failed."); //Laura Rice
 }
};