package com.muravskyi.java_11_complete.section02;

public class ConvertingTemperatures {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		double fahrenheit = 123.5;

		System.out.println(fahrenheit + " degrees fahrenhait is " + convertToCelsius(fahrenheit) + " deegrees celcius");

	}

	public static double convertToCelsius(double value) {
		return Double.valueOf(
			String.format("%.2f", ((value - 32) * (5.0 / 9.0)))
		);
	}

}