import java.util.ArrayList;

public class GameRecord {
	private int ties,player1Score,player2Score;
	private ArrayList<String> player1Moves,player2Moves;
	public GameRecord(){
		ties=0;
		player1Score=0;
		player2Score=0;
		player1Moves = new ArrayList<String>();
		player2Moves = new ArrayList<String>();
	}
	/**
	 * 
	 * @param player1Move
	 * @param player2Move
	 * @return - winner of the turn
	 */
	public int addTurn(char player1Move, char player2Move){
		int winner = -1;
		if(ValidMoves.isValidMove(player1Move) && ValidMoves.isValidMove(player2Move)){
			player1Moves.add(player1Move+"");
			player2Moves.add(player2Move+"");
			if(player1Move==player2Move){
				winner=0;
				ties++;
			}
			else if(player1Move == ValidMoves.Rock)
			{
				if(player2Move == ValidMoves.Scissors){
					winner = 1;
				}
				else if(player2Move == ValidMoves.Paper){
					winner = 2;
				}
			}
			else if(player1Move == ValidMoves.Scissors)
			{
				if(player2Move == ValidMoves.Paper){
					winner = 1;
				}
				else if(player2Move == ValidMoves.Rock){
					winner = 2;
				}
			}
			else if(player1Move == ValidMoves.Paper)
			{
				if(player2Move == ValidMoves.Rock){
					winner = 1;
				}
				else if(player2Move == ValidMoves.Scissors){
					winner = 2;
				}
			}
			if(winner==1)
				player1Score++;
			else if(winner==2)
				player2Score++;
			System.out.println();
			System.out.println("Player 1: " + player1Move);
			System.out.println("Player 2: " + player2Move);
			System.out.println("Winner: " + winner);
		}
		else{
			System.out.println("Invalid move");
		}
		
		return winner;
	}
	public int getTies(){
		return ties;
	}
	public int getPlayer1Score(){
		return player1Score;
	}
	public int getPlayer2Score(){
		return player2Score;
	}
	public ArrayList<String> getPlayer1Moves(){
		return player1Moves;
	}
	public ArrayList<String> getplayer2Moves(){
		return player2Moves;
	}
	

}
