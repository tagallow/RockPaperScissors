import java.util.Scanner;


public class HumanRPSClient implements RPSClient {

	private Scanner in;
	public HumanRPSClient(){
		in = new Scanner(System.in);
	}
	@Override
	public char nextMove() {
		char move = 0;
		System.out.print("Enter your move: ");
		move = in.next().charAt(0);
		while(!ValidMoves.isValidMove(move)){
			System.out.println();
			System.out.print("Invalid Move. Try again: ");
			move = in.next().charAt(0);
		}
		
		return move;
	}

	@Override
	public void result(char result) {

	}

}
