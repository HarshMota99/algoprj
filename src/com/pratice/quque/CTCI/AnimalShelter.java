package com.pratice.quque.CTCI;

import java.util.LinkedList;
import java.util.Queue;

/**
An animal shelter, which holds only dogs and cats, operates on a strictly"first in, first
out" basis. People must adopt either the "oldest" (based on arrival time) of all animals at the shelter,
or they can select whether they would prefer a dog or a cat (and will receive the oldest animal of
that type). They cannot select which specific animal they would like. Create the data structures to
maintain this system and implement operations such as enqueue, dequeueAny, dequeueDog,
and dequeueCat. You may use the built-in Linked List data structure.

 */

interface Animal{
}

class Dog implements Animal{
	int name;
	Dog(int input){
		name = input;
	}
}

class Cat implements Animal{
	int name;
	Cat(int input){
		name = input;
	}
	
}

public class AnimalShelter {
	
	private Queue<Animal> mainAnimalQueue = new LinkedList<>();
	private Queue<Animal> tempAnimalQueue = new LinkedList<>();
	
	public void enQueue(Animal animal){
		mainAnimalQueue.add(animal);
		return;
	}

	public void getAnimal(){
		if(!mainAnimalQueue.isEmpty()){
			System.out.println(mainAnimalQueue.peek());
			return;
		}
	}
	
	public void getCat(){
		while(!mainAnimalQueue.isEmpty()){
			if(mainAnimalQueue.peek() instanceof Cat){
				System.out.println(mainAnimalQueue.peek());
				mainAnimalQueue.remove();
				break;
			}else{
				tempAnimalQueue.add(mainAnimalQueue.peek());
				mainAnimalQueue.remove();
			}
		}
		while(!tempAnimalQueue.isEmpty()){
			mainAnimalQueue.add(tempAnimalQueue.peek());
			tempAnimalQueue.remove();
		}
	}

	public static void main(String args[]){
		
		AnimalShelter animalShelter = new AnimalShelter();
		Cat c1 = new Cat(1);
		Cat c2 = new Cat(2);
		Cat c3 = new Cat(3);
		Dog d1 = new Dog(1);
		Dog d2 = new Dog(2);
		Dog d3 = new Dog(3);
		
		animalShelter.enQueue(d1);
		animalShelter.enQueue(d2);
		animalShelter.enQueue(d3);
		animalShelter.enQueue(c1);
		animalShelter.enQueue(c2);
		animalShelter.enQueue(c3);
		
		animalShelter.getAnimal();
		animalShelter.getCat();
	}
}
