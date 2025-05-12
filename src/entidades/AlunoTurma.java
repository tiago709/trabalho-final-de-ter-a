package entidades;

public class AlunoTurma {
  
    private int cdAlunoTurma;
    private int cdAluno;
    private int cdTurma;
    private int frequencia;
    private double nota1;
    private double nota2;
    private double nota3;

    public AlunoTurma() {
    }
    
    public int getCdAlunoTurma() {
        return cdAlunoTurma;
    }

    public void setCdAlunoTurma(int cdAlunoTurma) {
        this.cdAlunoTurma = cdAlunoTurma;
    }

    public int getCdAluno() {
        return cdAluno;
    }

    public void setCdAluno(int cdAluno) {
        this.cdAluno = cdAluno;
    }

    public int getCdTurma() {
        return cdTurma;
    }

    public void setCdTurma(int cdTurma) {
        this.cdTurma = cdTurma;
    }

    public int getFrequencia() {
        return frequencia;
    }

    public void setFrequencia(int frequencia) {
        this.frequencia = frequencia;
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public double getNota3() {
        return nota3;
    }

    public void setNota3(double nota3) {
        this.nota3 = nota3;
    }
    
    public void imprimeAtributos(){
        System.out.println("Código da turma vinculado ao aluno: " + cdAlunoTurma);
        System.out.println("Código do aluno: " + cdAluno);
        System.out.println("Código da turma: " + cdTurma);
        System.out.println("Frequencia: " + frequencia);
        System.out.println("Nota 1: " + nota1);
        System.out.println("Nota 2: " + nota2);
        System.out.println("Nota 3: " + nota3);
    }
}