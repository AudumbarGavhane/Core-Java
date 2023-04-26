package com.SurpriseTest;

import java.util.Arrays;

public class SurTestQue2Logic2 {

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
		
		
		int count=0;
		if(size1!=size2) {
			System.out.println("Strings are not anagram...");
		}else if(size1==size2) {
			for(int i=0;i<size1;i++) {
				if(c1[i]==c2[i]) {
					count++;
				}else {
					count=0;
				}
			}
			 if(count!=size1) {
				 System.out.println("Strings are not anagram...");
			 }else {
				 System.out.println("Strings are anagram...");
			 }
		}
		
		
	}

}
