package com.pratice.comparator;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortPeople {

	public List<Person> sortPeople(List<Person> list) {
		Collections.sort(list);
		return list;
	}
	
	public void print(List<Person> list){
		for(Person prs : list){
			System.out.println(prs);
		}
	}

	public void printLastNameWithM(List<Person> list){
		for(Person prs : list){
			System.out.println(prs);
		}
	}
	
	public static void main(String args[]) {

		SortPeople people = new SortPeople();
		List<Person> list = Arrays.asList(new Person("Harsh", "XYZ"), new Person("Harsh", "Mota"), new Person("Asha", "Test"), new Person("Harsh", "ABC"),new Person("Suzanne", "Mota"));
		people.sortPeople(list);
		people.print(list);
	}
}
