package com.pratice.comparator;

/**
 * Comparable and Comparator

The object which needs to be compared can be made to implement comparable and in turn become comparable. 
It has method compareto.
It can have only one way to compare because the method is written inside the object itself.

If we want many ways to compare, is when comparator comes into picture and it is written outside the class itself. 
 */


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableTestMovie implements Comparable<ComparableTestMovie> {

	String name;
	Integer year;

	public ComparableTestMovie(String name, Integer year) {
		this.year = year;
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public Integer getYear() {
		return year;
	}

	@Override
	public int compareTo(ComparableTestMovie o) {
		return this.getYear().compareTo(o.getYear());
	}

	public static void main(String args[]) {
		ComparableTestMovie movie1 = new ComparableTestMovie("X", 4);
		ComparableTestMovie movie2 = new ComparableTestMovie("C", 3);
		ComparableTestMovie movie3 = new ComparableTestMovie("B", 2);
		ComparableTestMovie movie4 = new ComparableTestMovie("A", 1);

		List<ComparableTestMovie> movieList = new ArrayList<>();
		movieList.add(movie1);
		movieList.add(movie2);
		movieList.add(movie3);
		movieList.add(movie4);

		Collections.sort(movieList);

		for (ComparableTestMovie m : movieList) {
			System.out.println(m.getName());
		}
	}
}
