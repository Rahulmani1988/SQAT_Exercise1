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
	public void test_testThrowTestStrike() {
		// Arrange
		Frame f1 = new Frame(9,0);
		
		// Act
		boolean wasStrike = f1.isStrike();
		
		// Assert
		assertEquals("Should not be strike!", wasStrike, false);
	}
	
	@Test
	public void test_testThrowTestSpare() {
		// Arrange
		Frame f1 = new Frame(4,6);
		
		// Act
		boolean wasSpare = f1.isSpare();
		
		// Assert
		assertEquals("Should be spare!", wasSpare, true);
	}
	
	@Test
	public void test() {
		fail("Not yet implemented");
	}

}
