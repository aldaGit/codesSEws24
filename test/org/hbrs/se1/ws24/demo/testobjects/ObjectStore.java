package org.hbrs.se1.ws24.demo.testobjects;

import java.util.ArrayList;
import java.util.List;

public class ObjectStore {
	
	private List<TObject> liste = new ArrayList();

	public void addTObject(TObject tObject) {
		liste.add(tObject);
	}
	
	public int count(){
		return liste.size();
	}
	
	public boolean equals ( Object object ) {
		ObjectStore store = (ObjectStore) object;
		if ( this.count() == store.count() ) {
			return true;
		}
		return false;
	}
	
	public String toString() {
		String name = "";
		for (TObject object : liste) {
			name = name + object.getString();
		} 
		return name;
		
	}
}
 