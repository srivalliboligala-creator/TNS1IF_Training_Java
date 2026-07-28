package org.tnsif.acc.c2tc.manager;

class Human{
	String name;
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	int age;
	
	}
public class EncapsulationDemo {

	public static void main(String[] args) {
		Human obj=new Human();
		System.out.println(obj.name);
		
	}

}
