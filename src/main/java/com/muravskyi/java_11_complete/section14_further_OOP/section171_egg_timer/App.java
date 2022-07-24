package com.muravskyi.java_11_complete.section14_further_OOP.section171_egg_timer;

import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

import javax.swing.JOptionPane;

class Alert extends TimerTask {

	@Override
	public void run() {
		JOptionPane.showMessageDialog(null, "Egg cooked!");
	}

}

class Status implements Runnable {

	@Override
	public void run() {
		System.out.println("Timer running...");
	}

}

public class App {

	public static void main(String[] args) {
		
		Timer timer = new Timer();
		timer.scheduleAtFixedRate(new Alert(), 15000L, 15000L);

		ScheduledExecutorService executor = Executors.newScheduledThreadPool(1);
		executor.scheduleWithFixedDelay(new Status(), 0L, 3L, TimeUnit.SECONDS);

	}

}
