package com.muravskyi.java_11_complete.section03.lesson29_user_input;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter value in fahrenheit: ");
		double userInput = scanner.nextDouble();
		
		scanner.close();
				
		String result = String.format(
			"The result of convertin %.2f fahrenheit to celcius is: %.2f", userInput, convertToCelsius(userInput)
		);
		System.out.println(result);
	}

	public static double convertToCelsius(double value) {
		return Double.valueOf(
			String.format("%.2f", ((value - 32) * (5.0 / 9.0)))
		);
	}

}
