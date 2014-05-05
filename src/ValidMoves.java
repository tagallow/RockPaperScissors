public class ValidMoves {
		public final static char Rock = 'r';
		public final static char Paper = 'p';
		public final static char Scissors = 's';
		public static boolean isValidMove(char c){
			return (c==Rock || c==Paper || c==Scissors);
		}
}