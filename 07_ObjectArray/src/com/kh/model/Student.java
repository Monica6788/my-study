package com.kh.model;
// 학생 정보를 담을 객체 배열 선언 및 할당
// 학생 클래스(Student) com.kh.model.Student
//	- name: String
//	- age: int
// 	- score: double
//	+ Student()
//	+ Student(name: String, age: int, score: double)
//	+ getter/setter
//	+ printInfo(): void

public class Student {
	private String name;
	private int age;
	private double score;
	
	public Student() {}
	public Student(String name, int age, double score) {
		this.name = name;
		this.age = age;
		this.score = score;
	}
	
/* 복습 차원에서 name 필드의 getter, setter만 Generator 없이 만들기
* public String getName() {
*		return name;
*	}
*	public void setName(String name) {
*		this.name = name;
*	}
*/

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
	public double getScore() {
		return score;
	}
	public void setScore(double score) {
		this.score = score;
	}
	public void printInfo() {
		System.out.printf("%d세 %s 학생의 점수는 %.1f점입니다.\n", age, name, score);
	}

}
