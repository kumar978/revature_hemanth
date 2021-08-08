package eg3;

import java.util.Scanner;

public class PresentationMain {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String email=sc.nextLine();
		Presentation p=new Presentation();
		try {
			if(p.emailvalidation(email)) {
				System.out.println("Email Validated");
			}
		}
		catch (InValidEmailException e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
		String pwd=sc.nextLine();
		try {
			if(p.passwordvalidation(pwd)) {
				System.out.println("Secure Password");
			}
		}
		catch (InValidPasswordException e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
		String adhar=sc.nextLine();
		try {
			if(p.AadharValidation(adhar)) {
				System.out.println("Valid Aadhar Number");
			}
		}
		catch (InValidAadharException e) {
			System.out.println(e.getMessage());
		}
	}

}
