package wilton.snake;

import wilton.snake.State;
import wilton.snake.UserInterface;

public class GameEngine{

	private State state;
	private UserInterface userInterface;

	public GameEngine(State state, UserInterface userInterface){
		this.state = state;
		this.userInterface = userInterface;
	}

	public void tick(){
		//action
		userInterface.renderScreen(state.getScreen());
	}

	public void start(){
		tick();
	}
}