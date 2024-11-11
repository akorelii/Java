package model;

public class Animal { // super class
	/* sub class
	// 	super anahtar kelimesi miras aldığın class'ın içini temsil eder. 
	this mevcut class, super diger class. ---------- super(); ise ust sınıfın constructer'ıne gitmek icin kullanılır.*/
	
	
	public Long id;
	public String name;
	public int age;
	public String color;
	public int numOfLeg;
	
	public void sesVer()
	{
		System.out.println("Hayvan ses veriyor.");
	}
	
	
}
