/* Armstrong numbers = 
 * 23 --> 2 digits = 2^2 + 3^2;
 * 153 --> 3 digits = 1^3 + 5^3 + 3^3;
 * 1634 --> 4 digits = 1^4 + 6^4 + 3^4 + 4^4; */

class Demo{
	public static void main(String[] args){

		int N = 153;
		int temp1 = N;
		int temp2 = N;
		int count = 0;

		while(temp1 != 0){
			count++;

			temp1 = temp1/10;

			while(N != 0){
				int sum = 0;
				int rem = N%10;
				int mult = 1;

				for(int i = 1; i <= count; i++){


				}
				sum = sum + mult;
				N = N / 10;

				if(temp2 == sum){
					System.out.println("Armstrong numbers");
				}
				else{
					System.out.println("Non-Armstrong numbers");
				}
			}
		}
	}
}


