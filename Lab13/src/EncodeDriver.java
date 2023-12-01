/**
 * Lab13
 * @author Zachery Nyman
 * 23 Feb 2017
 */

public class EncodeDriver {

	public static void main(String[] args) {
		
		SubstitutionCipher subCipher = new SubstitutionCipher(1);
		System.out.println(subCipher.encode("abcdef"));
		ShuffleCipher shufCipher = new ShuffleCipher(1);
		System.out.println(shufCipher.encode("abcdefghi"));
		SubstitutionCipher subCipher2 = new SubstitutionCipher(3);
		System.out.println(subCipher2.encode("abcdef"));
		

	}

}
