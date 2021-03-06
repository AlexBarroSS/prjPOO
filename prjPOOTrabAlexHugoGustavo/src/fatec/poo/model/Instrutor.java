package fatec.poo.model;

import java.util.ArrayList;

public class Instrutor extends Pessoa{

    private String Formacao;
    private String AreaAtuacao;
    private ArrayList<Turma> turmas;
     
    public Instrutor(String cpf, String nome) {
        super(cpf, nome);
        turmas = new ArrayList<Turma>();
    }

    public void setFormacao(String Formacao) {
        this.Formacao = Formacao;
    }

    public void setAreaAtuacao(String AreaAtuacao) {
        this.AreaAtuacao = AreaAtuacao;
    }
    
    public void addTurma(Turma t){
        turmas.add(t);
        t.setInstrutor(this);
    }
    
    public void setTurma(Turma t){
        turmas.add(t);
    }

    public String getFormacao() {
        return Formacao;
    }

    public String getAreaAtuacao() {
        return AreaAtuacao;
    }

    public ArrayList<Turma> getTurmas() {
        return turmas;
    }
}
