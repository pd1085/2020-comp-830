package hw6;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class DiceBag {
	
	private List<Token> bag = new ArrayList<Token>();
	
	public int addToken(Token t) {
		if(bag.add(t))
		{
			return 1;
		}
		else
		{
			return 0;
		}
	}

	public Token drawToken() {
		int upperRange = bag.size();
		Token t = null;
		int die;
		if (upperRange > 1 ) {
			die = ThreadLocalRandom.current().nextInt(1, upperRange);
			t = bag.remove(die);
		}   
		return t;
	}
	
	public String toString() {
		String ret = " Dice left: " + bag.size() + "\n";
		for (Token t:bag) {
			ret += t.toString() + "\n";
		}
    	return ret;
	}
}
