package libin.algorithm.exhaustive.googleequation;

import java.util.List;

import libin.algorithm.exhaustive.CharItem;
import libin.algorithm.exhaustive.CharValue;

public class CharListReadyCallBackImpl implements CharListReadyCallBack {

	public  void onCharListReady(List<CharItem> list) {
		String minuend = "WWWDOT";
		String subtrahend = "GOOGLE";
		String diff = "DOTCOM";
		int m = convertListToValue(list, minuend);
		int s = convertListToValue(list, subtrahend);
		int d = convertListToValue(list, diff);
		if ((m - s) == d) {
			System.out.println(m + "-" + s + "=" + d);
		}
	}

	public  void searchingResult(
			List<CharItem> listCharItem, List<CharValue> listCharValue, int index) {
		ExhaustiveResult er = new ExhaustiveResult();
		er.doExhaustive(listCharItem, listCharValue, index,
				CharListReadyCallBackImpl.this);
	}
/*
 * 将字符串转换成数字
 */
	public int convertListToValue(List<CharItem> listCharItem,
			String s) {
		int value = 0;
		for (int i = 0; i < s.length(); i++) {
			CharItem ci = getCharItem(listCharItem, s.substring(i, i + 1));
			if (ci == null)
				return 0;
			value = value * 10 + ci.getValue();
		}

		return value;
	}
/*
 * 查找字母对应的CharItem
 */
	public  CharItem getCharItem(List<CharItem> listCharItem,
			String str) {
		for (int i = 0; i < listCharItem.size(); ++i) {
			CharItem ci = listCharItem.get(i);
			if (ci.getLetter().equals(str)) {
				return ci;
			}
		}
		return null;
	}
}
