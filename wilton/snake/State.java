package wilton.snake;

public class State{

	private int screenSize;
	private Screen screen;

	public State(int screenSize){
		this.screenSize = screenSize;
		screen = new Screen(screenSize);
	}


	public Screen getScreen(){
		return screen;
	}

}