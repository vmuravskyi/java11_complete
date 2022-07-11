package com.muravskyi.section19_exceptions.lesson207_throwing_runtime_exceptions.exceptions;

public class TemperatureTooHighException extends TemperatureOutOfRangeExceptions {
    
    /**
	 * 
	 */
	private static final long serialVersionUID = 7855712493648158588L;

	public TemperatureTooHighException(String message) {
        super(message);
    }

}