package com.org.cse;


 class CSE{
	
	public void Kalnadai() {
		System.out.println("eat food");
	}
}

class IT extends CSE{

	public void Kalnadai() {
		System.out.println("eat food");
		System.out.println("eat food - rice");
		
	}
}

public class Demo {

	
			public void print() {
				System.out.println("I am print method");
			}
			
			public static void disp() {
				System.out.println("I am disp method");
			}
	
	public static void main(String[] args) {
		
		System.out.println("Hai Panni");
	
		Demo d = new Demo();
		
		d.print();
		Demo.disp();
		
	}

}
