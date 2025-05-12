package entidades;

import java.util.Date;

public class Aluno {

    private int cdAluno;           
    private String cidadeAluno;     
    private String bairroAluno;      
    private String ruaAluno;         
    private int numeroAluno;         
    private String cepAluno;         
    private String nomeAluno;       
    private String cpfAluno;        
    private String rgAluno;         
    private String dataNascAluno;      
    private String sexoAluno;          
    private String estadoCivilAluno; 
    private String racaAluno;        

    public Aluno() {
    }

    public int getCdAluno() {
        return cdAluno;
    }

    public void setCdAluno(int cdAluno) {
        this.cdAluno = cdAluno;
    }

    public String getCidadeAluno() {
        return cidadeAluno;
    }

    public void setCidadeAluno(String cidadeAluno) {
        this.cidadeAluno = cidadeAluno;
    }

    public String getBairroAluno() {
        return bairroAluno;
    }

    public void setBairroAluno(String bairroAluno) {
        this.bairroAluno = bairroAluno;
    }

    public String getRuaAluno() {
        return ruaAluno;
    }

    public void setRuaAluno(String ruaAluno) {
        this.ruaAluno = ruaAluno;
    }

    public int getNumeroAluno() {
        return numeroAluno;
    }

    public void setNumeroAluno(int numeroAluno) {
        this.numeroAluno = numeroAluno;
    }

    public String getCepAluno() {
        return cepAluno;
    }

    public void setCepAluno(String cepAluno) {
        this.cepAluno = cepAluno;
    }

    public String getNomeAluno() {
        return nomeAluno;
    }

    public void setNomeAluno(String nomeAluno) {
        this.nomeAluno = nomeAluno;
    }

    public String getCpfAluno() {
        return cpfAluno;
    }

    public void setCpfAluno(String cpfAluno) {
        this.cpfAluno = cpfAluno;
    }

    public String getRgAluno() {
        return rgAluno;
    }

    public void setRgAluno(String rgAluno) {
        this.rgAluno = rgAluno;
    }

    public String getDataNascAluno() {
        return dataNascAluno;
    }

    public void setDataNascAluno(String dataNascAluno) {
        this.dataNascAluno = dataNascAluno;
    }

    public String getSexoAluno() {
        return sexoAluno;
    }

    public void setSexoAluno(String sexoAluno) {
        this.sexoAluno = sexoAluno;
    }

    public String getEstadoCivilAluno() {
        return estadoCivilAluno;
    }

    public void setEstadoCivilAluno(String estadoCivilAluno) {
        this.estadoCivilAluno = estadoCivilAluno;
    }

    public String getRacaAluno() {
        return racaAluno;
    }

    public void setRacaAluno(String racaAluno) {
        this.racaAluno = racaAluno;
    }
    
    public void imprimirAtributos() {
        System.out.println("Código do Aluno: " + cdAluno);
        System.out.println("Nome: " + nomeAluno);
        System.out.println("CPF: " + cpfAluno);
        System.out.println("RG: " + rgAluno);
        System.out.println("Data de Nascimento: " + dataNascAluno);
        System.out.println("Sexo: " + sexoAluno);
        System.out.println("Estado Civil: " + estadoCivilAluno);
        System.out.println("Raça: " + racaAluno);
        System.out.println("Endereço: " + ruaAluno + ", " + numeroAluno + ", " + bairroAluno + ", " + cidadeAluno);
        System.out.println("CEP: " + cepAluno);
    }
}
