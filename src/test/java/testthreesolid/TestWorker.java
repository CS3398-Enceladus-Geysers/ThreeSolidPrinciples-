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
};