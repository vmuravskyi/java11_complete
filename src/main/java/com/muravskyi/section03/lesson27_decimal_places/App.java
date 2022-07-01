package com.muravskyi.section03.lesson27_decimal_places;

public class App {

	public static void main(String[] args) {

		double fahrenheit = 123.5;

		System.out.println(fahrenheit + " degrees fahrenhait is " + convertToCelsius(fahrenheit) + " deegrees celcius");

		double value = 1.13234324;
		System.out.printf("Hello %f", value);
		System.out.printf("\nHello %.2f", value);
		
		
	}

	public static double convertToCelsius(double value) {
		return Double.valueOf(
			String.format("%.2f", ((value - 32) * (5.0 / 9.0)))
		);
	}

}
