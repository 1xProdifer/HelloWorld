package com.adhyanchandhoke;
import java.util.Scanner;
/**
* @author adhyan chandhoke
* date 06/06/2024
* A java implementation of hello world
*/
public class HelloWorld {
/**
 * Main method
 * @param args Command line arguements
 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//Get info from user
		System.out.println("Please enter your name");
		String name = input.nextLine();
		System.out.println("Please enter a greating");
		String greeting = input.nextLine();
		
		//Display the greeting
		String greetMesssage = generateGreeting(greeting, name);
		System.out.println(greetMesssage);
		
	}
	/**
	 * Creates a greeting using a custom greeting and name
	 * @param greeting  What greeting to use
	 * @param name  Who to greet
	 * @return The greeting
	 */
	public static String generateGreeting(String greeting, String name) {
		return greeting+ "," + name;
	}
}

