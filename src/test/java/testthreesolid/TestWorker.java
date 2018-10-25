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
 @Test
 @DisplayName("newTest<kjy>WorkerPass")
 public void WorkerPass() {
 	 assertEquals(w.work(),"Working...\n", "Correct."); //Kristof York
 }
 @Test
 @DisplayName("newTest<kjy>WorkerFail")
 public void WorkerFail() {
 	assertEquals(w.work(),"Working.. :( ", "Mismatch between test text and method text."); //Kristof York 
 }
};