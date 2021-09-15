package greet.message;

public class GreetTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Greeting from JAVA");
		System.out.println("Hows life?");
		byte nurseryRollNumber=60;
		short collegeRollNumber=32000;
		int stanfordUniversityRollNumber=123456;
		long  aadhaarNumber=123412341234L;
		
		float interestRate=3.7F;
		double molecularDistance=0.000345;
		
		boolean willYouMarryWithMe=false;
		System.out.println("**********************************");
		System.out.println("Nursery Roll Number :"+nurseryRollNumber);
		System.out.println("College Roll Number :"+collegeRollNumber);
		System.out.println("Stanford University Roll Number :"+stanfordUniversityRollNumber);
		System.out.println("Aadhaar Number :"+aadhaarNumber);
		System.out.println("**********************************");
		System.out.println("Interest Rate :"+interestRate);
		System.out.println("Molecular Distance :"+molecularDistance);
		System.out.println("**********************************");
		System.out.println("Will You Marry Me??? :"+willYouMarryWithMe);
		System.out.println("**********************************");
		int allKidsRollNumbers[]=new int[30];
		allKidsRollNumbers[0]=1;
		allKidsRollNumbers[1]=2;
		allKidsRollNumbers[2]=3;
		allKidsRollNumbers[3]=4;
		for(int i=0;i<allKidsRollNumbers.length;i++)
		{
			System.out.println("Kid Roll Number : "+allKidsRollNumbers[i]);
		}

	}

}
