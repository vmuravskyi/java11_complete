package com.muravskyi.section14_further_OOP.section170_exersice;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

class Status implements Runnable {

	@Override
	public void run() {
		System.out.println("Status 'OK'");		
	}
	
}

class Alert implements Runnable {

	@Override
	public void run() {
		System.out.println("This is an Alert");
	}
	
}

public class App {
	
	public static void main(String[] args) {
		
		ScheduledExecutorService executor = Executors.newScheduledThreadPool(1);
		executor.scheduleWithFixedDelay(new Alert(), 0L, 1L, TimeUnit.SECONDS);
		executor.scheduleWithFixedDelay(new Status(), 0L, 1L, TimeUnit.SECONDS);
		
	}

}
