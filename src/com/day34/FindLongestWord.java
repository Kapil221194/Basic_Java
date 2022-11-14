package com.day34;

public class FindLongestWord {
	public static void check_word(String st) {
		String words[] = st.split(" ");
		String s = " ";
		int m=0;
		int max=0;
		for (int i = 0; i < words.length; i++) {
			s = words[i];
			m=words[i].length();
			
		}
		
		if(max<m)
		{
			max=m;
			System.out.println(s);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "i like programming ";

		check_word(s);
	}

}
