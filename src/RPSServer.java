public class RPSServer
{
	public static void main(String[] args)
	{
		RockPaperScissorsClient player1 = new RockPaperScissorsClient();
		RockPaperScissorsClient player2 = new RockPaperScissorsClient();
		int NumberOfRounds = Integer.parseInt(args[0]);
		int winner;
		for(int i=0;i<NumberOfRounds;i++)
		{
			winner = evaluateWinner(player1.getNextMove(),playerTwo.getNextMove());
			if(winner==0)
			{
				player1.sendResult('t');
				player2.sendResult('t');
			}
			else if(winner==1)
			{
				player1.sendResult('w');
				player2.sendResult('l');
			}
			else if(winner==2)
			{
				player1.sendResult('l');
				player2.sendResult('w');
			}
		}
	}
	private static int evaluateWinner(char playerOne, char playerTwo)
	{
		int winner = -1;
		if(playerOne==playerTwo)
			winner = 0;
		else if(playerOne=='r')
		{
			if(playerTwo=='s')
				winner = 1;
			else
				winner = 2;
		}
		else if(playerOne=='s')
		{
			if(playerTwo=='p')
				winner = 1;
			else
				winner = 2;
		}
		else if(playerOne=='p')
		{
			if(playerTwo=='r')
				winner = 1;
			else
				winner = 2;
		}
		return winner;
		
	}
}
