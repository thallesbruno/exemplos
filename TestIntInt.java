class TestIntInt{
	public static void main (String[] args){
		/*int x = 3;
		int y = 2;
		float z = x / y; era para funcionar
		System.out.println(z);*/
		
		/*int x = 3;
		float y = 2;
		float z = x / y; não funciona
		System.out.println(z);*/

		int x = 3;
		int y = 2;
		float z = x / (float) y; //usando casting de variável
		System.out.println(z);
	}
}