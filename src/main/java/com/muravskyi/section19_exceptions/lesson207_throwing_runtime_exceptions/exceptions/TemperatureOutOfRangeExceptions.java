package com.muravskyi.section19_exceptions.lesson207_throwing_runtime_exceptions.exceptions;

public class TemperatureOutOfRangeExceptions extends Exception {

    /**
	 * 
	 */
	private static final long serialVersionUID = -5292089428414212745L;

	public TemperatureOutOfRangeExceptions(String message) {
        super(message);
    }

}