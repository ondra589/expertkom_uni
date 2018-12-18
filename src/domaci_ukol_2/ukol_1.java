package domaci_ukol_2;

public class ukol_1 {

	public static void main(String[] args) {
		
		int rows = 10;
		
		for (int i = 0; i < rows; i++) {

            for (int j = 0; j < rows - i; j++) {
                System.out.print(" ");
            }

            for (int k = 0; k <= i; k++) {
                System.out.print("* ");
            }

            System.out.println("");
        }
		}
		

	}

