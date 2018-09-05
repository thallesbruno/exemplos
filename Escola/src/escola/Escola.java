//exemplo Herança em POO
package escola;

import java.util.Date;
import java.util.Scanner;

public class Escola {

    public static void main(String[] args) {
        Aluno i = new Aluno("Jose Francisco", "123.456.789-00", new Date());
        System.out.println("Veja como os atributos foram preenchidos\n\nNome: " + i.nome);
        System.out.println("CPF: " + i.cpf);
        System.out.println("Data de nascimento: " + i.data_nascimento.toString());
        
        Scanner teclado = new Scanner(System.in);
        Professor j = new Professor("Thalles Bruno", "321.654.789-00", new Date());
        System.out.println("Veja como os atributos foram preenchidos\n\nNome: " + i.nome);
        System.out.println("CPF: " + i.cpf);
        System.out.println("Data de nascimento: " + i.data_nascimento.toString());
        System.out.println("Disciplina ministrada?");
        j.disciplina = teclado.next();
        System.out.println("O professor " + j.nome + " ministra a disciplina: " + j.retornaDisciplina());
    }
}