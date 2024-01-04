// Q.8.Electricity bill problem, give an integer input A which represent units of electricity consumed at your house, calcalate and print the bill amount units <=: price per unit is 1, units > 100: price per unit is 2.
// INPUT: 50;
// OUTPUT: 50;
// INPPUT: 200;
// OUTPUT: 300;


class Demo{
	public static void main(String[] args){

		int x = 200;

		int y = 100;

		if(x <= 100){
			System.out.println(x*1);
		}
		else{
			System.out.println(100*1+(x-100)*2);
		}
	}
}
