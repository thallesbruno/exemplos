class TesteCastingDoubleInt{
	public static void main (String[] args){
		double largura = 100.37;
		int tamanho = (int)largura;//compila mas perde a precisão
		System.out.println(tamanho);
	}
}