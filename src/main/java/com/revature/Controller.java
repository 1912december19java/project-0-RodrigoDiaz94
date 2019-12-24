package com.revature;

import java.util.Scanner;
import java.util.InputMismatchException;

public class Controller {

	public static void main(String args[]) {

		Scanner userInput = new Scanner(System.in);

		System.out.print("Welcome! Are you already registered (Y/N?)");

		try {

			String answerOne = userInput.next();
			if (!answerOne.equalsIgnoreCase("Y") || !answerOne.equalsIgnoreCase("N")) {
				throw new InputMismatchException("Not a valid input");
			}
		} catch (InputMismatchException e) {
			e.printStackTrace();
		}

		userInput.close();
	}
}