package com.javaex.ex05;

public abstract class Calc {
	
	// 필드 
	
	protected int a;
	protected int b;
	
	public Calc() {
		
	}
	
	public Calc(int a, int b) {
		
	}

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	@Override
	public String toString() {
		return "Calc [a=" + a + ", b=" + b + "]";
	}
	
	public void setValue(int a,int b) {
		
	}
	public abstract int calculate();
	

	
}
