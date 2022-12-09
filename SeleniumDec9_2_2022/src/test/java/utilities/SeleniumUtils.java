package utilities;

import java.util.Random;

public class SeleniumUtils {

	public int generateRandomNumber() {
		Random rnd = new Random();
		return rnd.nextInt();

	}
	public static void main(String[] args) {
		SeleniumUtils sel = new SeleniumUtils();
		System.out.println(sel.generateRandomNumber()); //1569744770 -2129744675

		
	}

}
