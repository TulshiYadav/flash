package com.durgasoft1;

public class RemoveSpecialCharacter {

	public static void main(String[] args) {
		String str="TULS%23@&/!";
		
		String str1=str.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(str1);

	}

}
