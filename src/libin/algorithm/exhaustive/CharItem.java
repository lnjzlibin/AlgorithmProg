package libin.algorithm.exhaustive;

public class CharItem {

	public CharItem(String letter, int value, boolean leading) {
		super();
		this.letter = letter;
		this.value = value;
		this.leading = leading;
	}
	public String getLetter() {
		return letter;
	}

	public void setLetter(String letter) {
		this.letter = letter;
	}
	

	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	public boolean isLeading() {
		return leading;
	}
	public void setLeading(boolean leading) {
		this.leading = leading;
	}
	String letter;
	int value;
	boolean leading;
	
}
