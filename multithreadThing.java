package com.day12;

public class multithreadThing extends Thread{
	
	@Override
	public void run() {
		for (int i=1; i<=10; i++) {
			
			System.out.println(i*3);
			
			
			}
			
		}
		
		
	}

