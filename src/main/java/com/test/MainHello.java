package com.test;

public class MainHello {

	public static void main(String[] args) throws Exception {

		ShowTimer showTimer = new ShowTimer();
		for(int i=0;i<10000;i++){
			System.out.println("this is "+i);
		}

	}
}
