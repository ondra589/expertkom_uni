package domaci_ukol_2;

import java.io.IOException;

public class ukol_3 {

	public static void main(String[] args) throws IOException {
		System.out.println("Vlo� ��slo: ");
		int cislo = (int) System.in.read();
		
		int i;
		int vysledek = 1;
		
		for (i = 1; i <= cislo; i ++) 
		{
			vysledek *= i; 
		}
				System.out.println("Faktori�l je: "+ vysledek);

	}

}
