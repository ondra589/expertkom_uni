package lekce_2;

import java.io.IOException;

public class ukol_1 {

	public static void main(String[] args) throws IOException {
		System.out.println("Stiskni tlaèítko a enter: ");
		char keyboardEntry = (char) System.in.read();
		System.out.println("Zadal jsi: "+keyboardEntry);

	}

}
