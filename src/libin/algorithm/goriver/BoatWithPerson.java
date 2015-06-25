package libin.algorithm.goriver;

import java.util.ArrayList;
import java.util.List;

public class BoatWithPerson {

	public static void main(String[] args) {
		List<ItemState> states = new ArrayList<ItemState>();
		states.add(new ItemState(3,3,0,0,BoatLocation.LOCAL, -1));
		new BoatWithPerson().processState(states);
	}
	public void processState(List<ItemState> states) {
        ItemState state = states.get(states.size() - 1);
        if (state.equals(new ItemState(0, 0, 3, 3, BoatLocation.REMOTE, -1))) {
            printResult(states);
            states.remove(states.size() - 1);
            return;
        }
        ActionName actions[] = ActionName.values();
        for (int i = 0; i < actions.length; i++) {
            ItemState itemState = makeActionNewState(states, actions[i]);
            if (isValidState(states, itemState)) {
                states.add(itemState);
                processState(states);
            }
        }
        states.remove(states.size() - 1);
    }
	private void printResult(List<ItemState> states) {
		System.out.println(states.toString());
		
	}
	public ItemState makeActionNewState(List<ItemState> states,
            ActionName actionName) {
        ItemState state = states.get(states.size() - 1);
        ItemState newState = new ItemState();

        BoatLocation newBoatcation = this.getBoatLocationByActionName(actionName);
        if (newBoatcation != state.getBoat()) {
            int monster = 0, monk = 0;
            switch (actionName) {
            case ONE_MONSTER_GO:
                monster = 1;
                break;
            case TWO_MONSTER_GO:
                monster = 2;
                break;
            case ONE_MONK_GO:
                monk = 1;
                break;
            case TWO_MONK_GO:
                monk = 2;
                break;
            case ONE_MONSTER_ONE_MONK_GO:
                monster = 1;
                monk = 1;
                break;

            case ONE_MONSTER_BACK:
                monster = -1;
                break;
            case TWO_MONSTER_BACK:
                monster = -2;
                break;
            case ONE_MONK_BACK:
                monk = -1;
                break;
            case TWO_MONK_BACK:
                monk = -2;
                break;
            case ONE_MONSTER_ONE_MONK_BACK:
                monster = -1;
                monk = -1;
                break;
            }
            newState.localMonster = state.localMonster - monster;
            newState.localMonk = state.localMonk - monk;
            newState.remoteMonster = state.remoteMonster + monster;
            newState.remoteMonk = state.remoteMonk + monk;
            newState.boat = newBoatcation;
            newState.descIndex=actionName.ordinal();

            if (riverOnSideValid(newState.localMonster, newState.localMonk)) {
                if (riverOnSideValid(newState.remoteMonster,
                        newState.remoteMonk)) {
                    return newState;
                }
            }
            return null;
        }
        return null;
    }
	
	private BoatLocation getBoatLocationByActionName(ActionName actionName) {
		BoatLocation location;
		if (actionName== ActionName.ONE_MONSTER_GO||actionName== ActionName.TWO_MONSTER_GO||actionName==ActionName.ONE_MONK_GO||
				actionName== ActionName.TWO_MONK_GO||actionName== ActionName.ONE_MONSTER_ONE_MONK_GO)
		{
			location=BoatLocation.REMOTE;
		}
		else {
			
			location = BoatLocation.LOCAL;
		}	
			
		return location;
	}
	public boolean riverOnSideValid(int monster, int monk) {
        if (monster < 0 || monk < 0) {
            return false;
        }

        if (monster == 0 || monk == 0) {
            return true;
        } else {
            if (monk >= monster) {
                return true;
            }
            return false;
        }
    }
	
	public boolean isValidState(List<ItemState> states, ItemState state) {
        if (state != null) {
            for (int i = 0; i < states.size(); i++) {
                ItemState itemState = states.get(i);
                if (state.equals(itemState)) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }
}
