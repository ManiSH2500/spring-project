package com.spring.sampleproject;

public class Laptop implements Computer {
	int age;
		public Laptop(int age) {
			this.age=age;
		}
		@Override
		public void display() {
			System.out.println("LAPTOP");
		}
}
