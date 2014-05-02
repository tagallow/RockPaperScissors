public interface RPSClient{
	/**
	 * char - the move the player choses. Valid moves are:
	 * 'r', 'p' and 's'
	 */
	char getNextMove(); 
	/**
	 * Lets the player know if they won, lost or tied
	 * @param result - valid results are:
	 * 'w','l', and 't'
	 */
	void sendResult(char result); //
}