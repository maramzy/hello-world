package com.ramzy.collections.array;

public class Demo {

	public static void main(String args[])
	{
		Person person1 = new Person(1,"Ramzy",27);
		Person person2 = new Person(2,"Ahmed",25);
		Person person3 = new Person(3,"Ahmed",25);
		
		Person[] persons={person1,person2,person3};
		
		for(int i=0;i<persons.length;i++)
		{
			persons[i].previewData();
		}
				
	}
}
