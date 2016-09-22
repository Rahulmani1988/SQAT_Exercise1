import static org.junit.Assert.*;

import org.junit.Test;

public class TestBowling {

	@Test
	public void test_testAddOneFrame() {
		BowlingGame game = new BowlingGame();
		
		// Arrange
		Frame f1 = new Frame(1,1);
		try {
			game.addFrame(f1);
		} catch (BowlingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// Act
		int count = game.numberOfFrames();
		
		// Assert
		assertEquals("Should be 1", count, 1);
	}

	@Test
	public void test() {
		fail("Not yet implemented");
	}

}
