package controladores;

import entidades.Aluno;
import entidades.DAO.AlunoDAO;
import java.sql.SQLException;
import java.util.ArrayList;

public class ControlaAluno {
    
    AlunoDAO alunoDAO = new AlunoDAO();
    
    public boolean salvar(Aluno c){
    try {
            alunoDAO.salvar(c);
            return true;
        } catch (SQLException ex) {
            System.out.println("Erro ao salvar aluno: " + ex.getMessage());
            return false;
        }
    }
    
   public boolean editar(Aluno c){
        try {
            alunoDAO.editar(c);
            return true;
        } catch (SQLException ex) {
            System.out.println("Erro ao editar aluno: " + ex.getMessage());
            return false;
        }
    }
    
    public boolean excluir(int id){
        try {
            alunoDAO.excluir(id);
            return true;
        } catch (SQLException ex) {
            System.out.println("Erro ao excluir aluno: " + ex.getMessage());
            return false;
        }
    }
    
    public Aluno recuperar(int id){
        try {
            Aluno aluno = alunoDAO.recuperar(id);
            return aluno;
        } catch (SQLException ex) {
            System.out.println("Erro ao consultar aluno: " + ex.getMessage());
            return null;
        }
    }
    
    //public void reperarTodos(){
    //    for (int i = 0; i < vetorAluno.size(); i++) {
    //    Aluno c = vetorAluno.get(i);
    //   c.imprimirAtributos();
    //    }}
    
       public ArrayList<Aluno> recuperarTodos(){
        ArrayList<Aluno> vetorAlunos = null;
        try {
            vetorAlunos = alunoDAO.recuperarTodos();
        } catch (SQLException ex) {
            System.out.println("Erro ao consultar aluno: " + ex.getMessage());
        }
        return vetorAlunos;
    }

}
