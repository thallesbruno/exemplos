class TestFloatLong{
	public static void main (String [] args){
		long x = 10;
		float y = 9.34;
		long z = x * y;
		System.out.println(z);

		long x1 = 10;
		float y1 = 9.34;
		float z1 = x1 * y1; // compila
		System.out.println(z1);
	}
}