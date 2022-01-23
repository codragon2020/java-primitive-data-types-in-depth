package com.primitive.datatypes;

public class MyChar {

	private char ch;

	public MyChar(char ch) {
		this.ch = ch;
	}

	public boolean isVowel() {
		if (ch == 'a') {
			return true;
		}

		return false;
	}

	public boolean isDigit() {
		if (ch >= 48 && ch <= 57) {
			return true;
		}

		return false;
	}

	public boolean isAlphabet() {
		if (ch >= 65 && ch <= 90 || ch >= 97 && ch <= 122) {
			return true;
		}

		return false;
	}

	public boolean isConsonant() {
		if (isAlphabet() && !isVowel()) {
			return true;
		}

		return false;
	}

	public static void printLowerCaseAlphabets() {
		for (char ch = 'a'; ch <= 'z'; ch++) {
			System.out.println(ch);
		}

	}

	public static void printUpperCaseAlphabets() {
		for (char ch = 'A'; ch <= 'Z'; ch++) {
			System.out.println(ch);
		}
	}

}
