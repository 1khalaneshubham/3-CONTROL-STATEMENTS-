// Q.7. Give an integer value as input ,print FIZZ if it is divisible by 3, print BUZZ if it is divisible by 5, print FIZZ-BBUZZ if it is divisible by both, if not than print "Not divisible by both";


class Demo{
	public static void main(String[] args){

		int x = 32;

		if(x%3==0 && x%5==0){
			System.out.println("Divisibel by both");
		}
		else if(x % 3 == 0 ){
			System.out.println("Divisible by 3");
		}
		else if(x % 5 == 0 ){

			System.out.println("Divisible by 5");
		}
		else{
			System.out.println("Both are not equal");
		}
	}
}
