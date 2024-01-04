/* Q.6. Give an integer N, print all it's digit 
INPUT = 6531
OUTPUT = 1
         3
	 5
	 6  */

class Demo{
	public static void main(String[] args){

		int N = 6531;
		
		while(N != 0){
			System.out.println(N % 10);
			N = N % 10;
		}
	}
}

