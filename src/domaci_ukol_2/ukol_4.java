package domaci_ukol_2;

import java.io.IOException;

public class ukol_4 {

	public static void main(String[] args) throws IOException {
		System.out.println("Zadej ��slo a zjisti zda se jedn� o prvo��slo: ");
		int i = System.in.read();
		
		
		if (!(i % 2 == 0)) {
		System.out.println("Jedn� se prvo��slo");
		}
		else {
			System.out.println("Nejedn� se prvo��slo");
		}
	}

}
