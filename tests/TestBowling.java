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
	public void test_testFrameStrike() {
		// Arrange
		Frame f1 = new Frame(9,0);
		
		// Act
		boolean wasStrike = f1.isStrike();
		
		// Assert
		assertEquals("Should not be strike!", wasStrike, false);
	}
	
	@Test
	public void test_testFrameSpare() {
		// Arrange
		Frame f1 = new Frame(4,6);
		
		// Act
		boolean wasSpare = f1.isSpare();
		
		// Assert
		assertEquals("Should be spare!", wasSpare, true);
	}
	
	@Test
	public void test_testFrameScore() {
		// Arrange
		Frame f1 = new Frame(1,5);
		
		// Act
		int score = f1.score();
		
		// Assert
		assertEquals("Should be 6!", score, 6);
	}

	@Test
	public void test_testGameScore() {
		// Arrange
		BowlingGame game = new BowlingGame();
		Frame f1 = new Frame(5,4);
		Frame f2 = new Frame(5,4);
		Frame f3 = new Frame(5,4);
		Frame f4 = new Frame(5,4);
		Frame f5 = new Frame(5,4);
		try {
			game.addFrame(f1);
			game.addFrame(f2);
			game.addFrame(f3);
			game.addFrame(f4);
			game.addFrame(f5);
		} catch (BowlingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// Act
		int score = game.score();
		
		// Assert
		assertEquals("Should be 45!", score, 44);
	}

	@Test
	public void test() {
		fail("Not yet implemented");
	}

}
