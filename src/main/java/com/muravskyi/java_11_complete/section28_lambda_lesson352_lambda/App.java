package com.muravskyi.java_11_complete.section28_lambda_lesson352_lambda;

import java.util.List;
import java.util.function.Consumer;

public class App {

	public static void main(String[] args) {

		var list = List.of("one", "two", "three");
		
		list.forEach(new Consumer<String>() {

			@Override
			public void accept(String t) {
				System.out.print(t);				
				System.out.print(" ");				
			}
			
		});

	}

}
