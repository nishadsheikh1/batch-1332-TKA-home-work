import java.util.Scanner;

public class Elligibility_checker {
void check(){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter your age");
	
	int age = sc.nextInt();
 
	if(age>75) {
		System.out.println("you are not elligible for license");
	}
	if(age>18 ) {
	System.out.println("you are elligible for liecence");
	}	else{
		int a2=18-age;
	 System.out.println("you have to wait "+a2 +" more years");	 
	}
}
}
