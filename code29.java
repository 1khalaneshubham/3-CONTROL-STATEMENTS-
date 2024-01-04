/* Q. Take N as input ,print all it's factors,
 * input = 24;
 * output = 1,2,3,4,6,8,12,24 */

class Demo{
	public static void main(String[] args){

		int N = 24;
	

		for(int i = 1; i <=N; i++){
			if(N % i == 0){
				System.out.println(i);
			}
		}
	}
}

