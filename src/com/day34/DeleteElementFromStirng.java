package com.day34;

public class DeleteElementFromStirng {

	public static void deleteSameElem(String str1, String str2) {
		
			char[] ch1=str1.toCharArray();
			char[] ch2=str2.toCharArray();
			
			for(int i=0;i<ch1.length;i++)
			{
				boolean isVisited=false;
				for(int j=0;j<ch2.length;j++)
				{
					if(ch1[i]==ch2[j])
					{
						isVisited=true;
						break;
					}
				}
				if(isVisited==false)
				{
					System.out.print(ch1[i]);
				}
			}

	}
	

	public static void main(String[] args) {

		String s1 = "india";
		String s2 = "in";

		deleteSameElem(s1, s2);

	}

}
