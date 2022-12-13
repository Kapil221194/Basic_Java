package com.test;

public class DemoTest {
	
	public static void getCount(int a [])
	{
		int count=0;
		for(int i=0;i<a.length;i++)
		{
			int c=0;
			for(int j=1;j<=a[i];j++)
			{
				if(a[i]%j==0)
				{
					c++;
				}
			}
			if(c==2)
			{
				count++;
				
			}
		}
		System.out.print("Count is "+count);
	}

	public static void main(String[] args) {

		int a[]= {2,5,7,9,6,11,24,56};
		
		getCount(a);
	}

}
