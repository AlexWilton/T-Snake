package wilton.snake;

public class Square{
	private int x, y;
	private SquareState state;

	public enum SquareState{
		EMPTY, SNAKE, FOOD;
	}
	

	public Square(int x, int y){
		this(x,y,SquareState.EMPTY);
	}

	public Square(int x, int y, SquareState state){
		this.x = x;
		this.y = y;
		this.state = state;
	}

	public int getX(){
		return x;
	}

	public int getY(){
		return y;
	}

	public SquareState getState(){
		return state;
	}

	public void setState(SquareState state){
		this.state = state;
	}
}