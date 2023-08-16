package Basics2;

public class StringOperation {

	public static void main(String[] args) {
		String str="Akash";
		String str1="black";
		String str2="Pink";
		System.out.println("Length of string is :"+str. length());
		System.out.println("Uppercase :"+str.toUpperCase());
		System.out.println("Lowercase :"+str.toLowerCase());
		System.out.println("Is both strings are equal :"+str.compareToIgnoreCase(str2));
		System.out.println("Concat :"+str.concat(str2));
		System.out.println("Concat :"+str.concat(str1));//Adding both strings
	System.out.println("Index of s :" +str.indexOf('s'));//find s index position
	System.out.println("Contains of :" +str.contains("z"));//check for letter
	System.out.println("Substring of :" +str.substring(1,3));//by index position.
	String str6=" ";
			System.out.println("is String is empty :" +str6.isEmpty());
			System.out.println("is String is blank :"+str6.isBlank());
	}

}
