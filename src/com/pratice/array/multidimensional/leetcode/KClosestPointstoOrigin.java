package com.pratice.array.multidimensional.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 We have a list of points on the plane.  Find the K closest points to the origin (0, 0).

(Here, the distance between two points on a plane is the Euclidean distance.)

You may return the answer in any order.  The answer is guaranteed to be unique (except for the order that it is in.)

 

Example 1:

Input: points = [[1,3],[-2,2]], K = 1
Output: [[-2,2]]
Explanation: 
The distance between (1, 3) and the origin is sqrt(10).
The distance between (-2, 2) and the origin is sqrt(8).
Since sqrt(8) < sqrt(10), (-2, 2) is closer to the origin.
We only want the closest K = 1 points from the origin, so the answer is just [[-2,2]].

Example 2:

Input: points = [[3,3],[5,-1],[-2,4]], K = 2
Output: [[3,3],[-2,4]]
(The answer [[-2,4],[3,3]] would also be accepted.)
 

Note:

1 <= K <= points.length <= 10000
-10000 < points[i][0] < 10000
-10000 < points[i][1] < 10000

Hint: https://www.youtube.com/watch?v=eaYX0Ee0Kcg

	Divided into 2 steps
		1. Find the distances of all the points to origin
		2. Find all the k number of points closest to origin. This can be done in many ways and the best way us Max Heap which is a problem in itself.


 */

public class KClosestPointstoOrigin {
	
	public static int[][] kClosest(int[][] points, int K) {
        int N = points.length;
        int[] dists = new int[N];
        for (int i = 0; i < N; ++i)
            dists[i] = dist(points[i]); // Distance of all the points from the origin

        Arrays.sort(dists);
        int distK = dists[K-1]; // Gives the kth numbers of points to be returned

        int[][] ans = new int[K][2]; //So here it says kth number of rows and it has 2 column. 
        int t = 0;
        for (int i = 0; i < N; ++i)
            if (dist(points[i]) <= distK) // So all the points which are smaller or till the kth number of points
                ans[t++] = points[i];
        return ans;
    }

    public static int dist(int[] point) {
        return point[0] * point[0] + point[1] * point[1];
    }

    public static void main(String args[]) {
    	int[][] result = KClosestPointstoOrigin.kClosest(new int[][] {new int[] {-2,2}, new int[] {1,3}, new int[] {1,1}}, 2);
    	
    	for(int i=0; i<=result.length-1; i++) {
    		List<Integer> res = new ArrayList<Integer>();
    		for(int j=0; j<=result[i].length-1; j++) {
    			res.add(result[i][j]);
    		}
    		System.out.println(res);
    	}
    	
    }
}
