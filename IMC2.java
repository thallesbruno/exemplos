import java.util.Scanner;

public class IMC2{
	public static void main(String[] args){
		Scanner entrada = new Scanner (System.in);

		System.out.print("Nome: ");
		String nome = entrada.nextLine();

		System.out.print("Peso: ");
		int peso = entrada.nextInt();

		System.out.print("Altura: ");
		double altura = entrada.nextDouble();

		System.out.print("Sexo (1 para 'M' ou outro numero para 'F'): ");
		char sexo = entrada.nextShort() == 1 ? 'M' : 'F';

		double imc = peso / (altura * altura);

		if (sexo == 'F'){
			if (imc < 19.1) {
				System.out.println("Abaixo do peso.");
			} else if (imc <= 25.8) {
				System.out.println("Peso ideal.");
			}
			///e continua...
		} else{
			if (imc < 20.7) {
				System.out.println("Abaixo do peso.");
			} else if (imc <= 26.4) {
				System.out.println("Peso ideal.");
			} else if (imc <= 27.7) {
				System.out.println("Um pouco acima do peso.");
			} else if (imc <= 31) {
				System.out.println("Acima do peso ideal.");
			} else {
				System.out.println("Obeso.");
			}
		}
	}
}