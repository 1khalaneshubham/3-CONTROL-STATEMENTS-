
/*.........................................BREAK AND CONTINUE...................................................*/


class Demo{
	public static void main(String[] args){
		
		int N = 15;
		int count = 0;

		for(int i = 0; i <= N; i++){

			if(N % i == 0){
				count++;
			}
			if(count > 2){
				break;
			}
		if(count == 2 ){
			System.out.println("Prime");
		}
		else{
			System.out.println(i);
		}
	}

	}
}



