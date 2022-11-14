package com.day31String;

public class DemoOfStringMethod {

	public static void main(String[] args) {

		String str = "HELLO";
		String str1 = "Hello";
		String str2 = "hello";
		String str3 = new String("HELLO");
		String str4 = new String("Hello");
		String str5 = new String("hello");
		String str6 = new String("I like to write java code. java is use to write code");

		// charAt(int index)
		char ch = str.charAt(4);
		System.out.println("Chara at index 4 from " + str + " is " + ch);

		System.out.println("--------------------------------------------");
		// subString(int index) subString(int start_index, int end_index)
		System.out.println("Original string :" + str6);
		String s = str6.substring(9);
		System.out.println("Sub String from index 9 :" + s);
		String s1 = str6.substring(2, 15);
		System.out.println("Sub String from index 2 to 15 :" + s1);

		System.out.println("--------------------------------------------");
		// string.equals(object another_string)
		System.out.println("str is equals str1 :" + str.equals(str1));
		System.out.println("str is equals str3 :" + str.equals(str3));

		System.out.println("--------------------------------------------");
		// compareTo()
		System.out.println(str.compareTo(str3));
		System.out.println(str2.compareTo(str5));
		System.out.println(str.compareTo(str1));
		
		System.out.println("--------------------------------------------");
		// split(expression) split(expression, limit)
		String[] words = str6.split("\\s");
		System.out.println("String after splitting (white space) :");
//		for(int i=0;i<str6.length();i++) {
//			System.out.println(str6);
//		}
		for (String w : words) {
			System.out.println(w);
		}
		System.out.println("String after splitting (white space & limit 0) :");
		for (String w : s1.split("\\s", 0)) {
			System.out.println(w);
		}
		System.out.println("String after splitting (white space & limit 1) :");
		for (String w : s1.split("\\s", 1)) {
			System.out.println(w);
		}
		System.out.println("String after splitting (white space & limit 2) :");
		for (String w : s1.split("\\s", 2)) {
			System.out.println(w);
		}

		System.out.println("--------------------------------------------");
		// indexOf()
		int index1 = str6.indexOf("java"); // returns the index of is substring
		System.out.println(index1);
		int index2 = str6.indexOf("java", 24); // returns the index of is substring after 24th index
		System.out.println(index2);
		int index3 = str6.indexOf('c'); // returns the index of s char value
		System.out.println(index3);

		System.out.println("--------------------------------------------");
		// toLowerCase()
		String lowercase = str.toLowerCase();
		System.out.println(str);
		System.out.println(lowercase);

		System.out.println("--------------------------------------------");
		// tUpperCase()
		String uppercase = str2.toUpperCase();
		System.out.println(str2);
		System.out.println(uppercase);

		

		System.out.println("--------------------------------------------");
		// lastIndexOf()
		int index4 = str6.lastIndexOf('j');// returns last index of 'j' char value
		System.out.println(index4);
		int index5 = str6.lastIndexOf('j', 26);//last index from the string before index value.
		System.out.println(index5);
		int index6 = str6.lastIndexOf("java");   //last index of the substring.
		System.out.println(index6);
		int index7 = str6.lastIndexOf("code", 26);//last index from the string before index value.
		System.out.println(index7);
		
	}

}
