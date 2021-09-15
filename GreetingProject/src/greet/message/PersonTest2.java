package greet.message;
class Person{
	private char gender;
	private String name;
	private int age;
	private String emailId;
Person(String nm, char g, int a, String em) {
		
		System.out.println("Begin of Person(...) constructor");
		System.out.println("Setting person details.....");
		
		String nameExpression = "^[a-zA-Z\\s]+";
		if(nm.matches(nameExpression))
			name = nm;
		else {
			System.out.println("Invalid name");
			return ;
		}
		
		if(g=='M' || g=='m' || g=='F' || g=='f') {
			gender = g;
		}
		else {
			System.out.println("Invalid gender");
			return ; 
		}
	
		
		if(a>=1 && a<=80) {
			age = a;         
		}
		else {
			System.out.println("Invalid Person Age ");
			return ;
		}
		
		String emailPattern = "^(.+)@(.+)$";
		
		if(em.matches(emailPattern))
			emailId = em;
		else {
			System.out.println("Invalid email");
			return ;
		}
		System.out.println("End of Person(...) constructor");
		return ;
	}
	
	void printPerson()
	{
		System.out.println("Gender :"+gender);
		System.out.println("Name :"+name);
		System.out.println("Age :"+age);
		System.out.println("Email address :"+emailId);
		System.out.println("******************");
	}
	Person() {
		 System.out.println("Person constructor called...");
	}
}
public class PersonTest2 {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person P1=new Person("Martin",'M',27,".com");
			P1.printPerson();
		
		Person P2=new Person("Priti",'F',30,"Priti@gmail.com");
			P2.printPerson();
		
		Person P3=new Person("Bob", 'M',-125,"Bob@gmail.com" );
			P3.printPerson();
		
		Person P4=new Person("Julie",'L',35 , "Julie@gmail.com");
			P4.printPerson();
		
}

}
