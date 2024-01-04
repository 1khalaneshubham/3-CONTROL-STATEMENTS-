





class Demo{
	public static void main(String[] args){

		int Num =  1352;
		int Mult = 1;

		while(Num != 0){
			int x = Num % 10;
			Mult = Mult * x;
		Num = Num / 10;
		}
	System.out.println(Mult);
	}
}

