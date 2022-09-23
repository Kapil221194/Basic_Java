package com.day21;

interface NumInt
{
	int x=12;
	int Fact();
}
class Factor implements NumInt
{
	int sum=0;
	@Override
	public int Fact()
	{
		for(int i=1;i<=x;i++) {
			if(x%i==0) {
				sum=sum+i;
			}
		}
		System.out.println(sum);
		return sum;
		
	}
}

public class InterfaceExamaple {

	public static void main(String[] args) {

		Factor f=new Factor();
		f.Fact();
	}

}
