





 /* Q.7. Give an integer N. print sum of it's N >= 0:
  * input = 6532 
  * output = 15   */

class Demo{
	public static void main(String[] args){

		int N = 6531;
		int sum = 0;

		while(N != 0){
			int rem = N % 10;
			sum = sum + rem;
			N = N/10;
		}
			System.out.println(sum);

	}
}

