package wilton.snake;

import java.util.LinkedList;
import java.util.List;

public class Screen{

	private int size;
	private Square[][] board;
	private Snake snake;

	public Screen(int size){
		this.size = size;
		setupBoard();
		setupSnake();
	}

	private void setupSnake(){
		List<Square> snakeElements = new LinkedList<Square>();
		Square middle = board[size/2][size/2];
		middle.setState(Square.SquareState.SNAKE);
		snakeElements.add(middle);
		snake = new Snake(snakeElements);
	}

	private void setupBoard(){
		board = new Square[size][size];
		for(int x=0; x<size; x++){
			for(int y=0; y<size; y++){
				board[x][y] = new Square(x,y);
			}
		}
	}

	public Square[][] getBoard(){
		return board;
	}
}