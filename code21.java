





/* Q.5 take an integer N as input. print perfect squares till N. 
 * perfect square: an integer prefect square root is a integer.
 *    25 --> 5  : yes  
 *    81 --> 9  : yes  
 *    10 --> 3.31 : no
 *    1 --> 1 : yes  
 *
 *    input = 30
 *    output = 1,4,9,16,25       */


class Demo{
	public static void main(String[] args){

		int N = 30;
		//int N = 100;
		int i = 1;

		while( i*i <= N ){
			System.out.println(i*i);
			i++;
		}
	}
}
