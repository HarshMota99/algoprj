package com.pratice.array.singleArray.leet;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle1 {
	public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> finalRes = new ArrayList<List<Integer>>();

        for(int i=0; i<numRows; i++) {
        	
        	List<Integer> prevRow = finalRes.size()==0? null: finalRes.get(finalRes.size()-1);
        	
        	List<Integer> nthRow = generatenthRow(i,prevRow);
        	
        	finalRes.add(nthRow);
        }
        return finalRes;
    }
	
	private static List<Integer> generatenthRow(int i, List<Integer> previousList) {
		List<Integer> res = new ArrayList<Integer>();
		
		if(previousList == null) {
			res.add(1);
			return res;
		}
		
		res.add(1);
		int pre = 1;
		
		for(int j=1; j<i;j++){
			int cur = previousList.get(j);
			res.add(pre+cur);
			pre = cur;
		}
		res.add(1);
		return res;
	}

	public static void main(String args[]) {
		List<List<Integer>> result = PascalTriangle1.generate(5);
		for(List<Integer> i : result) {
			for(Integer j : i) {
				System.out.print(j);
				System.out.print(",");
			}
			System.out.println();
		}
	}
	
}
