package lekce_2;
import java.io.IOException;

public class ukol_2 {

	public static void main(String[] args) throws IOException {
		System.out.println("Vlož písmeno: ");
		char keyboardEntry = (char) System.in.read();
		
		if(keyboardEntry == 'k') {
			System.out.println("Správnì");
		}else {
			System.out.println("Chybnì");
		}
	}

}


