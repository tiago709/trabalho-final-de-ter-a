
package controladores;

import entidades.AlunoTurma;
import entidades.DAO.AlunoTurmaDAO;
import java.sql.SQLException;
import java.util.ArrayList;

public class ControlaAlunoTurma {
  
     AlunoTurmaDAO alunoTurmaDAO = new AlunoTurmaDAO();
    
   public boolean salvar(AlunoTurma c) {
        try {
             alunoTurmaDAO.salvar(c);
            return true;
        } catch (SQLException ex) {
            System.out.println("Erro ao salvar aluno por tuma: " + ex.getMessage());
            return false;
        }
    }

    
    public boolean editar(AlunoTurma c){
        try {
            alunoTurmaDAO.editar(c);
            return true;
        } catch (SQLException ex) {
            System.out.println("Erro ao editar aluno turma: " + ex.getMessage());
            return false;
        }
    }
    
    public boolean excluir(int id){
        try {
            alunoTurmaDAO.excluir(id);
            return true;
        } catch (SQLException ex) {
            System.out.println("Erro ao excluir aluno turma: " + ex.getMessage());
            return false;
        }
    }
    
    public AlunoTurma recuperar(int id){
        try {
            AlunoTurma cliente = alunoTurmaDAO.recuperar(id);
            return cliente;
        } catch (SQLException ex) {
            System.out.println("Erro ao consultar aluno turma: " + ex.getMessage());
            return null;
        }
    }
    
    //public void reperarTodos(){
    //    for (int i = 0; i < vetorAlunoTurma.size(); i++) {
    //    AlunoTurma c = vetorAlunoTurma.get(i);
    //    c.imprimeAtributos();
    //    }
    //}
    
    public ArrayList<AlunoTurma> recuperarTodos(){
        ArrayList<AlunoTurma> vetorAlunosTurmas = null;
        try {
            vetorAlunosTurmas = alunoTurmaDAO.recuperarTodos();
        } catch (SQLException ex) {
            System.out.println("Erro ao consultar alunos por turma: " + ex.getMessage());
        }
        return vetorAlunosTurmas;
    }

}
