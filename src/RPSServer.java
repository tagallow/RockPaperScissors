public class RPSServer
{
	public static void main(String[] args)
	{
		RPSClient player1 = new TestRPSClient();
		RPSClient player2 = new TestRPSClient();
		int NumberOfRounds = Integer.parseInt(args[0]);
		int winner;
		int[] score = new int[]{0,0,0};
		for(int i=0;i<NumberOfRounds;i++)
		{
			winner = evaluateWinner(player1.nextMove(),player2.nextMove());
			if(winner==0)
			{
				player1.result('t');
				player2.result('t');
			}
			else if(winner==1)
			{
				player1.result('w');
				player2.result('l');
			}
			else if(winner==2)
			{
				player1.result('l');
				player2.result('w');
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
		else if(playerOne == 'r')
		{
		
			if(playerTwo == 's')
				winner = 1;
			else if(playerTwo == 'p')
				winner = 2;
		}
		else if(playerOne == 's')
		{
			if(playerTwo == 'p')
				winner = 1;
			else if(playerTwo == 'r')
				winner = 2;
		}
		else if(playerOne == 'p')
		{
			if(playerTwo == 'r')
				winner = 1;
			else if(playerTwo == 's')
				winner = 2;
		}
		System.out.println();
		System.out.println("Player 1: " + playerOne);
		System.out.println("Player 2: " + playerTwo);
		System.out.println("Winner: " + winner);
		return winner;
		
	}
}
