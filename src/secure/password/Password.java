package secure.password;

import java.math.BigInteger;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.spec.InvalidKeySpecException;
import java.util.Arrays;

import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.PBEKeySpec;


public class Password {
	
	final static int Iterations = 1000;
	final static int hash_length = 24;
	
	public static Boolean create_hash_pass() throws NoSuchAlgorithmException, InvalidKeySpecException 
    {
	
		
	 //make the salt
		byte[] salt = new byte[16];
		SecureRandom random = new SecureRandom();
		random.nextBytes(salt);
		System.out.println(Arrays.toString(salt));
	 //Generate goodHash
		byte[] hash = pbkdf2("Hi".toCharArray(), salt, Iterations, hash_length);
	 //convert hash to Hex string 
	    String goodHash  = (Iterations + ":" + toHex(salt) + ":" + toHex(hash));
	    System.out.println(goodHash); 
				
	    return true;
    }	 
	 private static byte[] pbkdf2(char[] password, byte[] salt, int iterations, int bits)
		        throws NoSuchAlgorithmException, InvalidKeySpecException
		    {
		        PBEKeySpec spec = new PBEKeySpec(password, salt, iterations, bits*8);		     		     
		        SecretKeyFactory skf = SecretKeyFactory.getInstance("PBKDF2WithHmacSHA1");
		        return skf.generateSecret(spec).getEncoded();
		    }
	 
	 private static String toHex(byte[] array)
	    {
	        BigInteger bi = new BigInteger(1,array);
	        String hex = bi.toString(16);	     
	        int paddingLength = (array.length * 2) - hex.length();
	        if(paddingLength > 0) 
	            return String.format("%0" + paddingLength + "d", 0) + hex;
	        else
	            return hex;
	    }
	 private static byte[] fromHex(String hex)
	    {
	        byte[] bytes = new byte[hex.length() / 2];
	        for(int i = 0; i<bytes.length ;i++)
	        {
	            bytes[i] = (byte)Integer.parseInt(hex.substring(2 * i, 2 * i + 2), 16);
	        }
	        return bytes;
	    }
	 
	public static Boolean validate_pass(String valid_pass_hash, String entered_pass) throws NoSuchAlgorithmException, InvalidKeySpecException
	{
		//Splitting the valid hash 
		String[] params = valid_pass_hash.split(":");
		byte[] salt_retrived = fromHex(params[1]); 
		String hashed_pass = params[2];   //HASH from DB
		
		//Converted user logged password to hash again		
		byte[] conv_hash_bytes = Password.pbkdf2(entered_pass.toCharArray(), salt_retrived, Iterations, hash_length);
		String conv_hash = toHex(conv_hash_bytes);  //HASH from user
		//Now compare the two 
		 
		 if(hashed_pass.equals(conv_hash))
		 {
			 return true;
		 }
		else
		return false;
	}
	 
}
