package libin.algorithm.exhaustive.googleequation;

import java.util.ArrayList;
import java.util.List;

import libin.algorithm.exhaustive.CharItem;
import libin.algorithm.exhaustive.CharValue;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<CharItem> listChar = new ArrayList<CharItem>();
		listChar.add(new CharItem("W", -1, true));
		listChar.add(new CharItem("G", -1, true));
		listChar.add(new CharItem("D", -1, true));
		listChar.add(new CharItem("L", -1, false));
		listChar.add(new CharItem("E", -1, false));
		listChar.add(new CharItem("O", -1, false));
		listChar.add(new CharItem("T", -1, false));
		listChar.add(new CharItem("C", -1, false));
		listChar.add(new CharItem("M", -1, false));

		List<CharValue> listNumber = new ArrayList<CharValue>();
		for (int i = 0; i < 10; i++) {
			listNumber.add(new CharValue(false, i));
		}
		CharListReadyCallBackImpl mGoogle = new CharListReadyCallBackImpl();
		mGoogle.searchingResult(listChar, listNumber, 0);
	}

}
