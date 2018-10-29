package com.nissan.training_core_java;

class child {
	void display()
	{
		System.out.println("This is Parent class");
	}
}
class Parent extends child
{
	void display()
	{
		System.out.println("This is child class");
	}

	public static void main(String[] args) {
		Parent obj=new Parent();
		obj.display();

	}

}
