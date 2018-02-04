package com.ramzy.collections.array;

public class Person {
	
	 int id;
	 String name;
	 int age;
	 
	 Person(int id , String name, int age)
	 {
		 this.id=id;
		 this.name=name;
		 this.age=age;
	 }
	
	public void previewData()
	{
		System.out.println("person id :"+ id);
		System.out.println("person name :"+name);
		System.out.println("person dat of birth :"+age);
		System.out.println();
	}

}
