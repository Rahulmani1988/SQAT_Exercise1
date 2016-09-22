import java.util.ArrayList;
import java.util.List;

//Finish time:
//ID:

public class BowlingGame {
	//a bowling game is made of (at least) 10 frames
	private List<Frame> frames = new ArrayList<Frame>();
	private Frame bonus;
	private int gameScore;
	
	public BowlingGame(){}
	
	// adds a frame to the game
	public void addFrame(Frame frame) throws BowlingException {
		if (frames.size() > 10) {
			throw new BowlingException();
		}
		frames.add(frame);
		gameScore += frame.score();
		
		if (frames.size() > 2) {
			int stopIndex = frames.size() > 3 ? (frames.size() - 3) : 0;
			for (int i = frames.size(); i == stopIndex; i--) {
				Frame f = frames.get(i);
				if (f.isStrike()) {
					gameScore += frame.score();
				}
			}
		}
	}
	
	public int numberOfFrames() {
		return frames.size();
	}
	
	// Sets the bonus throws at the end of the game
	public void setBonus(int firstThrow, int secondThrow) {
		//to be implemented
	}
	
	// Returns the game score
	public int score() {
		return gameScore;
	}
}
