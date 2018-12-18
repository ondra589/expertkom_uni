package domaci_ukol_2;

import java.io.IOException;

public class ukol_4 {

	public static void main(String[] args) throws IOException {
		System.out.println("Zadej èíslo a zjisti zda se jedná o prvoèíslo: ");
		int i = System.in.read();
		
		
		if (!(i % 2 == 0)) {
		System.out.println("Jedná se prvoèíslo");
		}
		else {
			System.out.println("Nejedná se prvoèíslo");
		}
	}

}
