package libin.algorithm.goriver;

public class ItemState {
	int localMonster;
	int localMonk;
	int remoteMonster;
	int remoteMonk;
	BoatLocation boat;
	int descIndex;
	public ItemState(){}
	
	public ItemState(int localMonster, int localMonk, int remoteMonster,
			int remoteMonk, BoatLocation boat, int descIndex) {
		super();
		this.localMonster = localMonster;
		this.localMonk = localMonk;
		this.remoteMonster = remoteMonster;
		this.remoteMonk = remoteMonk;
		this.boat = boat;
		this.descIndex = descIndex;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof ItemState) {
            ItemState state = (ItemState) obj;
            if (this.localMonster == state.localMonster
                    && this.remoteMonk == state.remoteMonk
                    && this.remoteMonster == state.remoteMonster
                    && this.remoteMonk == state.remoteMonk
                    && this.boat == state.boat) {
                return true;
            }
        }
        return false;
	}

	@Override
	public String toString() {
		return "[" + localMonster + ", " + localMonk + ", " + remoteMonster
                + ", " + remoteMonk + ", " + boat + "]";
	}

	public int getLocalMonster() {
		return localMonster;
	}

	public void setLocalMonster(int localMonster) {
		this.localMonster = localMonster;
	}

	public int getLocalMonk() {
		return localMonk;
	}

	public void setLocalMonk(int localMonk) {
		this.localMonk = localMonk;
	}

	public int getRemoteMonster() {
		return remoteMonster;
	}

	public void setRemoteMonster(int remoteMonster) {
		this.remoteMonster = remoteMonster;
	}

	public int getRemoteMonk() {
		return remoteMonk;
	}

	public void setRemoteMonk(int remoteMonk) {
		this.remoteMonk = remoteMonk;
	}

	public BoatLocation getBoat() {
		return boat;
	}

	public void setBoat(BoatLocation boat) {
		this.boat = boat;
	}

	public int getDescIndex() {
		return descIndex;
	}

	public void setDescIndex(int descIndex) {
		this.descIndex = descIndex;
	}
	
	
	
}
