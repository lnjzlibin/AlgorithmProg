package libin.algorithm.exhaustive;

public class CharValue {
	public CharValue(boolean used, int value) {
		super();
		this.used = used;
		this.value = value;
	}
	public boolean isUsed() {
		return used;
	}
	public void setUsed(boolean used) {
		this.used = used;
	}
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	boolean used;
	int value;
}
