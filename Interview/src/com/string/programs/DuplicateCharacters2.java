package com.string.programs;

public class DuplicateCharacters2 {

	public static void main(String[] args) {

		String s = "abcabcdeeffg";
		char[] a = s.toCharArray();

		String duplicate = "";
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] == a[j] && !duplicate.contains(a[i] + "")) {

					duplicate = duplicate + " " + a[i];

				}

			}

		}
		if (!duplicate.isEmpty()) 

			System.out.print("Duplicate characters" + "  " + duplicate);
		else
		{
			System.out.print("No duplicates");
		}
		

	}

}
