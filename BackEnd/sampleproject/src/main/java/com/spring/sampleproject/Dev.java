package com.spring.sampleproject;

public class Dev {
	private Computer comp;
	private int age;
	
	public Dev(int a) {
		age=a;
	}


	public Computer getComp() {
		return comp;
	}





	public void setComp(Computer comp) {
		this.comp = comp;
	}





	public void Display() {
		comp.display();
		System.out.println("HELLO WORLD"+age);

	}
	
}
