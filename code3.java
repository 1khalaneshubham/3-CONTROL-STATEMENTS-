// Q.3. Take two integers A and B as input ,print the max of two INPUT x = 5 y = 5 OUTPUT = both are equal



class Demo{
	public static void main(String[] args){

		int num1 = 5;
		int num2 = 5;

		if(num1 > num2){
			System.out.println(num1+" is greater");
		}
		else if(num2 > num1){
			System.out.println(num2+" is greater");
		}
		else{
			System.out.println("Both are equal");
		}
	}
}
