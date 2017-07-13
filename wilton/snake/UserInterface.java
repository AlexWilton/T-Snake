package wilton.snake;

public class UserInterface{
	
	public void renderScreen(Screen screen)
	{
		StringBuffer strBuf = new StringBuffer();
		Square[][] board = screen.getBoard();
		for (int x=0; x<board.length; x++){
			for(int y=0; y<board.length; y++){
				Square cellState = board[x][y];
				switch (cellState.getState()){
					case EMPTY:
						strBuf.append("_");
						break;
						case SNAKE:
						strBuf.append("o");
						break;
						case FOOD:
						strBuf.append("x");
						break;
				}
			}
			strBuf.append("\n");
		}
		System.out.print(strBuf.toString());
	}
}