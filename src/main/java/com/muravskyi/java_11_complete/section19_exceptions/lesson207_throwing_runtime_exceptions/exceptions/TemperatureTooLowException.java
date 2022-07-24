package com.muravskyi.java_11_complete.section19_exceptions.lesson207_throwing_runtime_exceptions.exceptions;

public class TemperatureTooLowException extends TemperatureOutOfRangeExceptions {

    /**
	 * 
	 */
	private static final long serialVersionUID = 3280247348182167459L;

	public TemperatureTooLowException(String message) {
        super(message);
    }

}