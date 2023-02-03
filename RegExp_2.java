package Week_2;
public class RegExp_2 {
	
	    
	    public static boolean checkPasswordValidity(String password) {
	        String regex="^(?=.*[0-9])"+
	        			"(?=.*[A-Z])(?=.*[a-z])"+
	        			"(?.*[!@#$%&*_])"+
	        			"(?=\\s+$).{8,20}$";

	        if(password.matches(regex)){
	        		return true;
	        	}
	    	return false;
	    }
	    
	    public static void main(String[] args) {
	        
	        //Change the value of password for testing your code with different passwords
	        String password = "P@$sW0rd";
	        System.out.println("The password is "+ (checkPasswordValidity(password) ? "valid!" : "invalid!"));
	    }
	    
	}



