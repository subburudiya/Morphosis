package com.string.programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DuplicateCharacters {

	public static void main(String[] args) {
		String s = "abcdabcdea";
		char[] a = s.toCharArray();
		char duplicate[]=new char[s.length()];
		int index = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] == a[j]  && !Arrays.toString(duplicate).contains(a[i]+"")) {
					 duplicate[index++]= a[i];
				}
			}
		}
		duplicate = Arrays.copyOf(duplicate, index);
		System.out.print("Duplicate characters" + "  " + Arrays.toString(duplicate));
	}
}
