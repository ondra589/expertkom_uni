package domaci_ukol;

public class ukol_3 {

	public static void main(String[] args) {
 
   
		 int i =0;
	     int cislo =0;
	     String  prvocisla = "";

	       for (i = 1; i <= 200; i++)         
	       { 		  	  
	          int citac=0; 	  
	          for(cislo =i; cislo>=1; cislo--)
		  {
	             if(i%cislo==0)
		     {
	 		citac = citac + 1;
		     }
		  }
		  if (citac ==2)
		  {
		    
		     prvocisla = prvocisla + i + " ";
		  }	
	       }	
	       System.out.println("Prvoèísla od 2 do 100 jsou :");
	       System.out.println(prvocisla);
	   }
	}