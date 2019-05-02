package com.pratice.sort;

public class QuickSort {

	public void qST(int[] inArr, int low, int high) {

		if (low >= high) {
			return;
		}
		int split = partition(inArr, low, high);
		qST(inArr, low, split);
		qST(inArr, split + 1, high);

	}

	private int partition(int[] inArr, int low, int high) {

		int pivot = inArr[low];
		int temp = 0;
		int j = 0;
		int i = low;
		for (int k = low+1; k <= high; k++) {
			j = k;
			if (inArr[k] < pivot) {
				while (j > i) {
					temp = inArr[j];
					inArr[j] = inArr[j-1];
					inArr[j-1] = temp;
					j--;
				}
				i++;
			}
		}
		return i;
	}

	public static void main(String args[]) {
		QuickSort qs = new QuickSort();
		int[] test = new int[]{7,3,5,2,6,1,4 };
		qs.qST(test, 0, 6);
		for(int i= 0; i<test.length;i++){
			System.out.println(test[i]);
		}
	}
}
