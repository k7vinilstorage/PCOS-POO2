
package Model;

public class Professor extends Pessoa{
    String formacao;
    String disciplina;
    String horario[][];
    int pCod;

    public Professor() {
        formacao = "";
        disciplina = "";
        horario = new String[][] {};
        pCod = 0;
    }
    
    public Professor(String formacao, String disciplina, String[][] horário, int pCod) {
        this.formacao = formacao;
        this.disciplina = disciplina;
        this.horario = horario;
        this.pCod = pCod;
    }

    public String getFormacao() {
        return formacao;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public String[][] getHorário() {
        return horario;
    }

    public int getpCod() {
        return pCod;
    }

    public void setFormacao(String formacao) {
        this.formacao = formacao;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    public void setHorário(String[][] horário) {
        this.horario = horario;
    }

    public void setpCod(int pCod) {
        this.pCod = pCod;
    }
}
