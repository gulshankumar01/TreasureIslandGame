package com.aurionpro;

import java.util.Scanner;

public class TreasureIslandGame {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		System.out.println("Welcome to Treasure Island. Your mission is to find the treasure.");

		System.out.print("Left or right? ");
		String choice1 = scanner.next();

		if (choice1.equalsIgnoreCase("left")) {
			System.out.print("Swim or wait? ");
			String choice2 = scanner.next();

			if (choice2.equalsIgnoreCase("wait")) {
				System.out.print("Red or blue? ");
				String choice3 = scanner.next();

				if (choice3.equalsIgnoreCase("blue")) {
					System.out.print("Which door? ");
					String choice4 = scanner.next();

					if (choice4.equalsIgnoreCase("yellow")) {
						System.out.println("You Win!");
					} else {
						System.out.println("Eaten by beasts. Game Over!");
					}
				} else {
					System.out.println("Burned by fire. Game Over!");
				}
			} else {
				System.out.println("Attacked by trout. Game Over!");
			}
		} else {
			System.out.println("Fall into a hole. Game Over!");
		}
	}
}