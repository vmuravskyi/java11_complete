package com.muravskyi.java_11_complete.section16_inner_classes.lesson182_hashcode_this;

public class Fox {

	public String name;
	
	public Fox() {
		System.out.println(this);
		this.name = "Ferdinald";
	}

}
