class Demo{
	public static void main(String[] args){

		int x = 10;
		{
			int y = 20;
			System.out.println(x+" "+y);
		}
		{
			System.out.println(x+" "+y);  // error..........y is not dfine
		}
		System.out.println(x+" "+y);   // error.............y is not dfine
	}
}

