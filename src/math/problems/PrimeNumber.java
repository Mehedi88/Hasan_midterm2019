package math.problems;

public class PrimeNumber {

	public static void main(String[] args) {
		/*
		 * Find list of Prime numbers from number 2 to 1 million.
		 * Try the best solution as possible.Which will take less CPU life cycle.
		 * Out put number of Prime numbers on the given range.
		 *
		 *
		 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
		 *
		 */
		int n = 2;
		int m = 10000000;
		int count = 0;
		for ( i = 2;i<m; i++){
			if (i==2) {
				System.out.println(i);
				count++;
			}else{
				if (is prime(i)){
					System.out.println(i);
				}
			}
			}
		}

	{

}

