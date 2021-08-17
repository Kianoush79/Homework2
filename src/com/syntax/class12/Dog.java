package com.syntax.class12;

public class Dog {
	
	 
	String name;
	String breed;
	String color;
	int age;
	double h;
	char gender;
	
	//behaiviour
	
	void bark() {
		System.out.println(name+ "dog can bark"); //behaivors
	}
	void sleep() {
		System.out.println("dog can sleep");
	}

	// to create object we right name of the class Dog dog1=new Dog();
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Dog dog1=new Dog();  //property atribute
	dog1.name="james";
	dog1.breed="bull dog";
	dog1.color="grey";
	dog1.age=20;
	dog1.h=15;
	dog1.gender='M';
	dog1.bark();
	
	Dog dog2=new Dog();
	dog2.name="John";
	dog2.breed="shitzu";
	dog2.color="black";
	dog2.age=12;
	dog2.h=10;
	dog2.gender='F';
	
	
	}
	
	}


