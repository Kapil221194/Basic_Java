package com.day15;


public class PrimeAvg {

	public static void main(String[] args) {

		int  n=0, sum=0, count1=0;
		 for(int i=1;i<=20;i++) {
			int count=0;
			 for(int j=1; j<=20;j++) {
				 if(i%j==0) {
					 count++;
					 n=i;
				 }
			 }
			 if(count==2) {
				 count1++;
				//System.out.println(n);
				  sum=sum+n;
				 //System.out.println("sum="+sum);
			 }
		 }
		 System.out.println("count="+count1);
		 System.out.println("sum="+sum);
		float avg=(float)sum/count1;
		 System.out.println("AVG="+avg);
	}

}
