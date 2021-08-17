package com.syntax.class12;

public class Cat {

	
	
	String name;
	String color;
	int age;
	
	//    to drfine behaivors we use void
	
	void eat () {
		System.out.println(name+" is eating");
	}
	void sleep () {
		System.out.println(name+" is sleeping");
	}
	//combaining attributes to behaivors
	
	public static void main(String[] args) {//object cat 1 and cat 2 else is behaivor
		// TODO Auto-generated method stub

	
	Cat cat1=new Cat();
	cat1.name="rose";
	cat1.color="white";
	cat1.age=12;
	cat1.eat();
	cat1.sleep();
	Cat cat2=new Cat();
	cat2.name="ginger";
	cat2.color="brown";
	cat2.age=3;
	cat2.eat();
	
	}

}
