package com.pratice.string.general;

public class SameContents {

	public boolean check(String[] a, String[] b) {
		boolean result = true;

		if (a.length < 1 || b.length < 1) {
			return false;
		}

		if (a.length != b.length) {
			return false;
		}

		for (int i = 0; i <= a.length - 1; i++) {
			boolean temp = false;
			for (int j = 0; j <= b.length - 1; j++) {
				if (a[i] == b[j]) {
					temp = true;
					break;
				}
			}
			if(!temp){
				return false;
			}
		}
		return result;
	}
	
	public static void main(String args[]){
		SameContents contents = new SameContents();
		System.out.println(contents.check(new String[] {"a"}, new String[] {"a"}));
	}
}
