public class RPSServer
{
	public static void main(String[] args)
	{
		RPSClient player1 = new TestRPSClient();
		RPSClient player2 = new TomRPSClient();
		int NumberOfRounds = 5000;//Integer.parseInt(args[0]);
		int winner;
		int[] score = new int[]{0,0,0};
		for(int i=0;i<NumberOfRounds;i++)
		{
			winner = evaluateWinner(player1.nextMove(),player2.nextMove());
			if(winner==0)
			{
				player1.result(GameStates.Tie);
				player2.result(GameStates.Tie);
			}
			else if(winner==1)
			{
				player1.result(GameStates.Win);
				player2.result(GameStates.Lose);
			}
			else if(winner==2)
			{
				player1.result(GameStates.Lose);
				player2.result(GameStates.Win);
			}
			score[winner]++;
		}
		System.out.println();
		System.out.println("=FINAL SCORE=");
		System.out.println("Player 1: "+score[1]);
		System.out.println("Player 2: "+score[2]);
		System.out.println("Ties: "+score[0]);
	}
	/**
	 * Returns the winner of the match. 0 means tie, -1 means invalid move.
	 */
	private static int evaluateWinner(char playerOne, char playerTwo)
	{
		int winner = -1;
		if(playerOne == playerTwo)
			winner = 0;
		else if(playerOne == ValidMoves.Rock)
		{
		
			if(playerTwo == ValidMoves.Scissors)
				winner = 1;
			else if(playerTwo == ValidMoves.Paper)
				winner = 2;
		}
		else if(playerOne == ValidMoves.Scissors)
		{
			if(playerTwo == ValidMoves.Paper)
				winner = 1;
			else if(playerTwo == ValidMoves.Rock)
				winner = 2;
		}
		else if(playerOne == ValidMoves.Paper)
		{
			if(playerTwo == ValidMoves.Rock)
				winner = 1;
			else if(playerTwo == ValidMoves.Scissors)
				winner = 2;
		}
		System.out.println();
		System.out.println("Player 1: " + playerOne);
		System.out.println("Player 2: " + playerTwo);
		System.out.println("Winner: " + winner);
		return winner;
		
	}
}
