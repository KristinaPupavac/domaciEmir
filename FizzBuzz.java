
public class FizzBuzz {
/* Napisati program koji ce ocekivati broj kao argument i za proslijedjeni broj 
 * ispisati:
 *	- ako je broj djeljiv sa 3 - "Fizz"
 *	- ako je broj djeljiv sa 5 - "Buzz"
 *	- ako je broj djeljiv i sa 3 i sa 5 - "FizzBuzz"
 *	- inace ispisati sam broj
 *
 *	Ocekivani ulaz/izlaz:
 *	3 - Fizz
 *	5 - Buzz
 *	15 - FizzBuzz
 *	17 - 17 
 */
	public static void main(String[] args) {
		int num = 17;
		
		if (num % 3 == 0 && num % 5 ==0){
			System.out.println("FizzBuzz");
		} else if (num % 3 == 0) {
			System.out.println("Fizz");
		} else if (num % 5  == 0) {
			System.out.println("Buzz");
		} else {
			System.out.println(num);
		}
	}

}
