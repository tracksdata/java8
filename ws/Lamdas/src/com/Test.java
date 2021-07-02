package com;

import java.util.Arrays;
import java.util.List;

@FunctionalInterface
interface Draw {

	void drawLine();
	
}

class Line implements Draw {
	@Override
	public void drawLine() {
		System.out.println(">>>>> Drawing a line ....");

	}
	
}

public class Test {

	public static void main(String[] args) {
		
		Line l=new Line();
		l.drawLine();
		
		Draw circle=new Draw() {
			
			@Override
			public void drawLine() {
				System.out.println("====> Drawing Circle");
				
			}
			
		};
		
		Draw squre=new Draw() {
			@Override
			public void drawLine() {
				System.out.println(">>>>> Drawing Square...");
				
			}
			
		};
		
		Draw rect=()->{
			 System.out.println(">>>> Draawing rectangle");
		};
		
		
		Draw v1=()->System.out.println("... Hellooooooo");
		
		rect.drawLine();
		v1.drawLine();
		
		circle.drawLine();
		squre.drawLine();
		
		

		// Lamdas in java 8

		List<String> cities = Arrays.asList("Chennai", "Delhi", "Hyderabad", "Pune", "Kolkata");

		System.out.println(cities);

		for (int i = 0; i < cities.size(); i++) {
			System.out.println(cities.get(i));
		}

		System.out.println("----------------------------------------");

		// for each java 1.5
		for (String city : cities) {
			System.out.println(city);
		}

		System.out.println("-----------------------------------------");

		// java 8 new feature:: forEach

		cities.forEach(cityName -> { // recursive function
			System.out.println(cityName);
		});

		System.out.println("-----------------------------------------");
		System.out.println("-----------------------------------------");

		// method reference

		cities.forEach(System.out::println);

	}

}
