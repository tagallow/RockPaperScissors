import java.text.NumberFormat;
import java.util.Random;
public class RandomRPSClient implements RPSClient
{
	private char lastMove;
	private int rocks,papers,scissors;
	private Random rand;
	
	public RandomRPSClient()
	{
		rand = new Random();
		rocks=0;
		papers=0;
		scissors=0;
	}
	public char nextMove()
	{
		int r = rand.nextInt(3);
		if(r<1){
			lastMove=ValidMoves.Rock;
			rocks++;
		}
		else if(r<2){
			lastMove=ValidMoves.Paper;
			papers++;
		}
		else if(r<3){
			lastMove=ValidMoves.Scissors;
			scissors++;
		}
		else{
			lastMove='x';
		}
		return lastMove;
	}
	public void result(char result)
	{
	}
	
	public void printStats(){
		NumberFormat percentFormat = NumberFormat.getPercentInstance();
		double percent = 0;
		int sum = rocks+papers+scissors;
		
		percent=(double)rocks/sum;
		System.out.println("Rocks: "+percentFormat.format(percent));
		
		percent=(double)papers/sum;
		System.out.println("Papers: "+percentFormat.format(percent));
		
		percent=(double)scissors/sum;
		System.out.println("Scissors: "+percentFormat.format(percent));
	}
}
