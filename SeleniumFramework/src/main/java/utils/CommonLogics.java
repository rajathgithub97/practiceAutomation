package utils;

import java.security.SecureRandom;
import java.util.Random;
public class CommonLogics {

	private boolean isMale = true;

	// Method to return "male" or "female" alternatively each time it's called
	public String alternateGender() {
		String gender = isMale ? "male" : "female";
		isMale = !isMale;
		return gender;
	}
	
	//Method to generate random email id everytime.
	public String generateRandomEmail(String fName, String lName) {
		String domain = "example.com";	
		  Random random = new Random();
	        int randomNum = random.nextInt(1000); // Generate a random number between 0 and 999
	        String email = fName + "." + lName + randomNum + "@" + domain;
	        return email.toLowerCase();
	}
	
	//Method to generate random alpha numeric string
	public String generateRandomAlphaNumeric() {
		String SPECIAL_CHARACTERS = "!@#$%^&*()_+{}[]-|:;<>,.?/~";
		 StringBuilder sb = new StringBuilder();
	        SecureRandom random = new SecureRandom();

	        // Add at least one special character
	        sb.append(SPECIAL_CHARACTERS.charAt(random.nextInt(SPECIAL_CHARACTERS.length())));

	        // Add at least one number
	        sb.append((char) (random.nextInt(10) + '0'));

	        // Add at least one alphabet character (lowercase or uppercase)
	        sb.append((char) (random.nextInt(26) + 'a'));
	        sb.append((char) (random.nextInt(26) + 'A'));

	        // Fill the remaining characters with random alphanumeric characters
	        for (int i = 0; i < 7; i++) {
	            char randomChar = (char) (random.nextInt(26 * 2 + 10) + '0');
	            sb.append(randomChar);
	        }

	        // Shuffle the characters in the string
	        String randomString = sb.toString();
	        char[] charArray = randomString.toCharArray();
	        for (int i = 0; i < charArray.length; i++) {
	            int randomIndex = random.nextInt(charArray.length);
	            char temp = charArray[i];
	            charArray[i] = charArray[randomIndex];
	            charArray[randomIndex] = temp;
	        }

	        return new String(charArray);
		
	}
}
