/* Q.take N as input print all it's factors 
 * input = 4
 * output = 24 */

class Demo{
	public static void main(String[] args){

		int N = 4;
		int fact = 1;

		for(int i = 1; i<=N; i++){

			fact = fact*i;
		}
		System.out.println(fact);

	}
}

