// Define the Set class

import java.util.ArrayList;

class Set {

	private ArrayList<Integer> members;
	private boolean identical=false;

	public Set(ArrayList<Integer> members){
		this.members = members;
	}	

	public ArrayList<Integer> getMembers(){
		return members;
	}
	public boolean getIdentical(){
		return identical;
	}

	// toString() method
	public String toString() {
		return members.toString();
	}

	// Return true if 'this' is a subset of 'set', 
	// otherwise return false.
	public boolean isSubset(Set set) {
		for(int i: this.getMembers()){
			if(!set.getMembers().contains(i)){
				return false;
			}
		}
		if(this.getMembers().containsAll(set.getMembers())){
			identical = true;
		}
		return true; // this is a stub
	}
}

