package com.pratice.general;

// == says if the refernce are equels
// to check if the objects are meaningfully equal -- override equals methid
// If you orver ride the equals methid the hash code will be same

public class EquHasTest {

	int size;
	
	public EquHasTest(int size){
		this.size = size;
	}
	
	public int getSize(){
		return size;
	}
	
	public boolean equals(EquHasTest o){
		if((o instanceof EquHasTest) && o.size == this.size){
			return true;
		}else{
			return false;
		}
	}

	public int hashCode(){
		return 20;
	}
	
	public static void main(String args[]){
		EquHasTest e1 = new EquHasTest(10);
		EquHasTest e2 = new EquHasTest(8);
		EquHasTest e3 = new EquHasTest(10);
		System.out.println(e1.equals(e2));
		System.out.println(e1.equals(e3));
	}
}
