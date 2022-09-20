package com.day17;

class Application{
	String app_name;
	String app_type;
}
class SocialMedia extends Application{
	String app_owner;
	float app_ratng;
	long app_user;
}
class Facebook extends SocialMedia{
	int year_of_launch;
	int age_limit;
	 public void getAppInfo() {
		 app_name= "FaceBook";
		 app_type= "Social Media";
		 app_owner="Mark zuckerberg";
		 app_ratng=4.5f;
		 app_user=1523000;
		 year_of_launch= 2004;
		 age_limit= 12;
		 
	 }
	 public void ShowAppDetails() {
		 System.out.println("Application Name :"+app_name+"\n"+"Application Type :"+app_type+"\n"+"Application owner :"+app_owner+"\n"
	 +"Application Rating :"+app_ratng+"/5"+"\n"+"Age limit for user :"+age_limit+" Years"+"\n"+"Application Users :"+app_user+"\n"+"Year of lanuch :"+year_of_launch);
	 }
}

public class MultiLevelExample {

	public static void main(String[] args) {

		Facebook f=new Facebook();
		f.getAppInfo();
		f.ShowAppDetails();
		
	}

}
