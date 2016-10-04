package com.assignment_4.superclasses;


/**
 * <h1>The BankAssignement!</h1>
 * @author Daniel Sjösten
 * @version 1.0
 * @since 2016-10-03
 *
 */
//SuperClass
public class Human {



	String name = "";
	int age = 0;
	
	
	/**
	 * @param name Constructor that takes name as inparameter
	 * @param age Constructor that takes age as inparameter
	 */
	public Human(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	//Get and set
	/**
	 * @return name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name sets name
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return age
	 */
	public int getAge() {
		return age;
	}
	/**
	 * @param age sets age
	 */
	public void setAge(int age) {
		this.age = age;
	}
	
	
	
}
