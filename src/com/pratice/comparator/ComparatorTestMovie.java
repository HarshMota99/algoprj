package com.pratice.comparator;

/**
 * 
 * Compatator example
 * 
 */



import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorTestMovie implements Comparator<ComparableTestMovie>{

	@Override
	public int compare(ComparableTestMovie o1, ComparableTestMovie o2) {
		return Integer.compare(o1.getYear(), o2.getYear());
	}

	public static void main(String args[]){
		ComparableTestMovie movie1 = new ComparableTestMovie("X", 4);
		ComparableTestMovie movie2 = new ComparableTestMovie("C", 3);
		ComparableTestMovie movie3 = new ComparableTestMovie("B", 2);
		ComparableTestMovie movie4 = new ComparableTestMovie("A", 8);

		List<ComparableTestMovie> movieList = new ArrayList<>();
		movieList.add(movie1);
		movieList.add(movie2);
		movieList.add(movie3);
		movieList.add(movie4);
		
		ComparatorTestMovie comparatorTestMovie = new ComparatorTestMovie();

		Collections.sort(movieList,comparatorTestMovie);

		for (ComparableTestMovie m : movieList) {
			System.out.println(m.getName());
		}
	}
}
