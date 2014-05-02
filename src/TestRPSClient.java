import java.util.ArrayList;
import java.util.Random;
public class TestRPSClient implements RPSClient
{
	//private ArrayList<char> myPreviousMoves;
	//private ArrayList<char> opponentPreviousMoves;
	private int wins,loss,tie;
	private char lastMove;
	public TestRPSClient()
	{
		//myPreviousMoves = new ArrayList<char>();
		//opponentPreviousMoves = new ArrayList<char>();
		wins=0;
		loss=0;
		tie=0;
	}
	public char nextMove()
	{
		Random rand = new Random();
		int r = rand.nextInt(3);
		
		if(r<1){
			lastMove=ValidMoves.Rock;
		}
		else if(r<2){
			lastMove=ValidMoves.Paper;
		}
		else if(r<3){
			lastMove=ValidMoves.Scissors;
		}
		else{
			lastMove='x';
		}
		return lastMove;
			
	}
	public void result(char result)
	{
		if(result==GameStates.Win){
			wins++;
		}
		else if(result==GameStates.Lose){
			loss++;
		}
		else if(result==GameStates.Tie){
			tie++;
		}
	}
}
