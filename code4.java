// Q.4. Give the temperater of person if farenheit, print whether the person has high normal, low temperater
//  > 98.6.......................= high
//  98.0 <= and <= 98.6;.........= normal
//  < 98.0 ......................= low


class Demo{
	public static void main(String[] args){

		float temp = 98.4f; //  check all case if pass then right

		if(temp > 98.6f){
			System.out.println("HIGH");
		}
		else if(temp < 98.0){
			System.out.println("LOW");
		}
		else{
			System.out.println("NORMAL");
		}
	}
}

