import java.util.ArrayList;
import java.util.Random;
public class TestRPSClient implements RPSClient
{
	private ArrayList<char> myPreviousMoves;
	private ArrayList<char> opponentPreviousMoves;
	private int wins,loss,tie;
	private char lastMove;
	public TestRPSClient()
	{
		myPreviousMoves = new ArrayList<char>();
		opponentPreviousMoves = new ArrayList<char>();
		wins=0;
		loss=0;
		tie=0;
	}
	public char nextMove()
	{
		Random r = new Random();
		r = r*3;
		
		if(r<1){
			lastMove='r';
		}
		else if(r<2){
			lastMove='p';
		}
		else if(r<3){
			lastMove='s';
		}
		else{
			lastMove='x';
			System.Out.println("error");
		}
		return lastMove;
			
	}
	public void result(char result)
	{
		if(result=='w'){
			wins++;
		}
		if(result=='l'){
			loss++;
		}
		else{
			tie++;
		}
	}
}