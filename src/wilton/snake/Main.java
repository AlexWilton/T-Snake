package wilton.snake;

public class Main{

    public static void main(String[] args){

        System.out.println("Welcome to Snake");

        final int size = 10;
        State state = new State(size);
        UserInterface userInterface = new UserInterface();
        GameEngine gameEngine = new GameEngine(state, userInterface);
        gameEngine.start();

        System.out.println("\nGAMEOVER!");
    }
}