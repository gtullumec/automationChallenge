package common;


public class Utilities {

	public String replaceText(String xpath, String reemplazo) {
		return xpath.replaceFirst("#txt#", reemplazo);		
	}
	
	public static String randomNumber() {
		int numero = (int)(Math.random()*(9999)+1);
		return String.valueOf(numero);
	}
	
}
