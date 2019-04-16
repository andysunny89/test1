package com.example;

public class Hello {

	public static void main(String[] args) {

		System.out.println("TEST 1");
	}
	
	int printNum(int num) {
		if(num<100) {
			System.out.println(num);
			return printNum(num++);
		}
		else
			return num++;
	}
}
