package PassWordEncryptedAndDecrypted;

import java.beans.Encoder;
import java.util.Base64;
import java.util.Base64.Decoder;

public class PasswordEncrypt {

	public static void main(String[] args) {


		String password = "Pijus";
		
		java.util.Base64.Encoder encoder = Base64.getEncoder();
		
		String encodeString = encoder.encodeToString(password.getBytes());
		
		System.out.println(encodeString);
		
		
		
		Decoder decode = Base64.getDecoder();
		
		byte[] decodeString = decode.decode(encodeString);
		
		System.out.println(new String(decodeString));
		
		
	    }
	 
	


}
