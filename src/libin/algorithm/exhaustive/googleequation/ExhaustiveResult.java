package libin.algorithm.exhaustive.googleequation;

import java.util.List;

import libin.algorithm.exhaustive.CharItem;
import libin.algorithm.exhaustive.CharValue;

public class ExhaustiveResult {
	public boolean isValueValidate(
			CharItem char_item, CharValue char_value) {
		if (char_value.isUsed()) {
			return false;
		}
		if (char_item.isLeading() && char_value.getValue() == 0) {
			return false;
		}
		return true;
	}

	public  void doExhaustive(
			List<CharItem> listCharItem, List<CharValue> listCharValue, int index,CharListReadyCallBack callback) {
		if (index == listCharItem.size()) {
			callback.onCharListReady(listCharItem);
			return;
		}
		for (int i = 0; i < listCharValue.size(); ++i) {
			CharItem ci = listCharItem.get(index);
			CharValue cv = listCharValue.get(i);
			if (isValueValidate(ci, cv)) {
				cv.setUsed(true);
				ci.setValue(cv.getValue());
				doExhaustive(listCharItem, listCharValue, index + 1,callback);
				cv.setUsed(false);
			}
		}
	}

}
