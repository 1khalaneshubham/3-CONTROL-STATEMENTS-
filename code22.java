 /* Q. write the program to reverse the given number */
  


class Demo{
	public static void main(String[] args){

		int N = 123;
		int rev = 0;

		while(N != 0){

			int rem = N % 10;
			rev = rev * 10 + rem;
			
			N = N % 10;
		System.out.prientln(rem);
		}

	}

}

