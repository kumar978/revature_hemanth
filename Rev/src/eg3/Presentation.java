package eg3;

public class Presentation {
	
	public boolean emailvalidation(String email) throws InValidEmailException {
		if(email.matches("^(.+)@(.+)$")) {
			return true;
		}
		else {
			throw new InValidEmailException("Not a Valid Email");
		}
		
	}
	public boolean passwordvalidation(String pwd) throws InValidPasswordException {
		if(pwd.matches("[0-9]{10}")) {
			return true;
		}
		else {
			throw new InValidPasswordException("Not a Valid Password");
		}
		
	}
	public boolean AadharValidation(String adhar) throws InValidAadharException{
		if(adhar.matches("[0-9]{12}")) {
			return true;
		}
		else {
			throw new InValidAadharException("Not a Valid Aadhar Number");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
