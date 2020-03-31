package week1.day1;

public class Android {
		
	// Declare the below five variables:
	
	long mobNum = 88990077;
	Boolean isNumValid = true;
	String name = "Rachit";
	int num = -500;
	float fvar = -900.4f;
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Call the five variables created in the main method by first creating the object:
		
		Android andr = new Android();
		
		//Press Ctrl+2 and then press 'L' for auto-assignment- assigning to local variable
		long mobNum2 = andr.mobNum;
		Boolean isNumValid2 = andr.isNumValid;
		String name2 = andr.name;
		int num2 = andr.num;
		float fvar2 = andr.fvar;
		
		System.out.println(mobNum2);
		System.out.println(isNumValid2);
		System.out.println(name2);
		System.out.println(num2);
		System.out.println(fvar2);

	}

}



