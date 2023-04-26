package com.SurpriseTest;

import java.util.Arrays;

public class SurpriseTestQ2 {

	public static void main(String[] args) {

		String str1 = "the morse code";

		String str2 = "here come dots";

		int size1, size2;
		size1 = str1.length();
		size2 = str2.length();

		
		char c1[], c2[];

		c1 = new char[size1];

		c2 = new char[size2];

		for (int i = 0; i < size1; i++) {
			c1[i] = str1.charAt(i);
		}

		for (int i = 0; i < size1; i++) {
			c2[i] = str2.charAt(i);
		}

		Arrays.sort(c1);
		Arrays.sort(c2);
		
		
		if (size1 != size2) {
			System.out.println("String is not an anagram...");
		}
		else if(size1==size2) {
		int count1 = 0, count2 = 0;
		for (int i = 0, k = 0; i < size1; i++, k++) {
			for (int j = i + 1; j < size1; j++) {
				if (c1[i] == c1[j]) {
					count1++;
					i++;
				}

			}

			for (int j = k + 1; j < size2; j++) {
				if (c2[k] == c2[j]) {
					count2++;
					k++;
				}
			}
			
			if(count1!=count2) {
				System.out.println("Strings are not anagram...");
				break;
			}else {
				count1=0;count2=0;
			}	

		}
		if(count1==0)
		System.out.println("Strings are anagram...");
		}

	}

}
