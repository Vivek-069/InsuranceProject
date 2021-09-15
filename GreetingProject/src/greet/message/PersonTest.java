package greet.message;

public class PersonTest {
	public static void printPerson(char gender, String name, int age,String email)
	{
		System.out.println("Gender :"+gender);
		System.out.println("Name :"+name);
		System.out.println("Age :"+age);
		System.out.println("Email address :"+email);
		System.out.println();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char gender='M';
		String name="Martin";
		int age=23;
		String emailId="Martin@gmail.com";
		printPerson(gender,name,age,emailId);
		char gender2='F';
		String name2="Julie";
		int age2=32;
		String emailId2="Julie@gmail.com";
		printPerson(gender2,name2,age2,emailId2);
	
		char gender3='M';
		String name3="Bob";
		int age3=40;
		String emailId3="Bob@gmail.com";
		printPerson(gender3,name3,age3,emailId3);
		
		char gender4='F';
		String name4="Mary";
		int age4=35;
		String emailId4="Mary@gmail.com";
		printPerson(gender4,name4,age4,emailId4);
	}

}
