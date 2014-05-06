public class RPSServer
{
	public static void main(String[] args)
	{
		RPSClient player1 = new TomRPSClient2();
		RPSClient player2 = new ChadRPSClient();
		int NumberOfRounds = 5000;//Integer.parseInt(args[0]);
		int winner;
		GameRecord game = new GameRecord();
		for(int i=0;i<NumberOfRounds;i++)
		{
			winner = game.addTurn(player1.nextMove(), player2.nextMove());
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
		}
		System.out.println();
		System.out.println("=FINAL SCORE=");
		System.out.println("Player 1: "+game.getPlayer1Score() + " "+ game.getPlayer1Percent());
		System.out.println("Player 2: "+game.getPlayer2Score() + " "+ game.getPlayer2Percent());
		System.out.println("Ties: "+game.getTies());
	}
}
