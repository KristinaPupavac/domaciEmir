
public class DioDana {
/*System.currentTimeMillis() vraca broj milisekundi koji je prosao od ponoci 
 * 1.1.1970, UTC (UTC je oznaka za vremensku zonu koja kasni 2 sata za nasom zonom).
 * Napisati program koji ce na osnovu vracene vrijednosti pomenute metode na 
 * standardni izlaz ispisati koji je dio dana:
 * 6 - 10 - "Jutro"
 * 10 - 18 - "Dan"
 * 18 - 22 - "Vece"
 *22 - 6 - "Noc" 
 */
	public static void main(String[] args) {
		
		 long t = System.currentTimeMillis();
		 long hours = t / 3600000;
		 
		 long hours1 = (hours % 24) + 2;

	
			if (hours1 <= 10 && hours1 >= 6 ) {
				System.out.println("Jutro");
			}

			else if (hours1 <= 18 && hours1 >= 10 ) {
				System.out.println("Dan");
			}

			else if (hours1 <= 22 && hours1 >= 18 ) {
				System.out.println("Vece");
			}

			else if (hours1 >= 22 && hours1 <= 6) {
				System.out.println("Noc");
			}
		 
		
		 //System.out.print("Current Time in milliseconds = ");
		   //System.out.println(System.currentTimeMillis());
	


	}

}
