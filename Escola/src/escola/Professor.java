package escola;

import java.util.Date;

public class Professor extends Pessoa {
    public Professor(String _nome, String _cpf, Date _data) {
        super(_nome, _cpf, _data);
    }
    public double salario;
    public String disciplina;
    
    public String retornaDisciplina(){
        return disciplina;
    }
}