package oop;

public class Student {

	public Student() {

	}

	public Student(String name, int age) {
		this.name = name;
		this.age = age;
	}

	// class attributes
	String name;
	int age;

	// class method
	void learnjava() {
		System.out.println("Learn Java with HoiDanIT");
	}

	String getAge() {
		return "Hỏi Dân IT";
	}
}
