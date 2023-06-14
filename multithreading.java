package com.day12;

public class multithreading {

	public static void main(String[] args) {
		
		multithreadThing myThing = new multithreadThing();{
		multithreadThing myThing2 = new multithreadThing();
		multithreadThing myThing3 = new multithreadThing();
		
		
		
		myThing.start();
		myThing2.start();
		myThing3.start();
		}

	}

}

