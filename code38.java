/* print even  numbers 1 to 100   */

class Demo{
	public static void main(String[] args){

		int N = 100;

		for( int i = 1; i <= N; i++ ){

			if(i % 2 == 0){
				System.out.println(i);
			}
		}
	}
}

