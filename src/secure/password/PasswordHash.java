package secure.password;


import java.security.SecureRandom;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.SecretKeyFactory;
import java.math.BigInteger;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import java.util.Arrays;
import java.util.Random;

/*
 * PBKDF2 salted password hashing.
 * Author: havoc AT defuse.ca
 * www: http://crackstation.net/hashing-security.htm
 */
public class PasswordHash
{   
    	  static Random RANDOM = new SecureRandom();
    	  static int ITERATIONS = 10000;
    	  static int KEY_LENGTH = 256;
    	  
    	 /**
    	   * Returns a random salt to be used to hash a password.
    	   *
    	   * @return a 16 bytes random salt
    	   */
    	   public static byte[] getNextSalt() {
    	    byte[] salt = new byte[16];
    	    RANDOM.nextBytes(salt);
    	    return salt;
    	  }

    	  /**
    	   * Returns a salted and hashed password using the provided hash.<br>
    	   * Note - side effect: the password is destroyed (the char[] is filled with zeros)
    	   *
    	   * @param password the password to be hashed
    	   * @param salt     a 16 bytes salt, ideally obtained with the getNextSalt method
    	   *
    	   * @return the hashed password with a pinch of salt
    	   */
    	  public static byte[] hash(char[] password, byte[] salt) {
    	    PBEKeySpec spec = new PBEKeySpec(password, salt, ITERATIONS, KEY_LENGTH);
    	    Arrays.fill(password, Character.MIN_VALUE);
    	    try {
    	      SecretKeyFactory skf = SecretKeyFactory.getInstance("PBKDF2WithHmacSHA1");
    	      return skf.generateSecret(spec).getEncoded();
    	    } catch (NoSuchAlgorithmException | InvalidKeySpecException e) {
    	      throw new AssertionError("Error while hashing a password: " + e.getMessage(), e);
    	    } finally {
    	      spec.clearPassword();
    	    }
    	  }

    	  public static String generateRandomPassword(int length) {
    		    StringBuilder sb = new StringBuilder(length);
    		    for (int i = 0; i < length; i++) {
    		      int c = RANDOM.nextInt(62);
    		      if (c <= 9) {
    		        sb.append(String.valueOf(c));
    		      } else if (c < 36) {
    		        sb.append((char) ('a' + c - 10));
    		      } else {
    		        sb.append((char) ('A' + c - 36));
    		      }
    		    }
    		    return sb.toString();
    		  }
    		}
