package controladores;

import entidades.DAO.ProfessorTurmaDAO;
import entidades.ProfessorTurma;
import java.sql.SQLException;
import java.util.ArrayList;

public class ControlaProfessorTurma {
 
  ProfessorTurmaDAO professorTurmaDAO = new  ProfessorTurmaDAO ();
      
     public boolean salvar(ProfessorTurma c) {
        try {
             professorTurmaDAO.salvar(c);
            return true;
        } catch (SQLException ex) {
            System.out.println("Erro ao salvar professor por turma: " + ex.getMessage());
            return false;
        }
    }
    
   public boolean editar(ProfessorTurma c){
        try {
            professorTurmaDAO.editar(c);
            return true;
        } catch (SQLException ex) {
            System.out.println("Erro ao editar cliente: " + ex.getMessage());
            return false;
        }
    }
    
    public boolean excluir(int id){
        try {
            professorTurmaDAO.excluir(id);
            return true;
        } catch (SQLException ex) {
            System.out.println("Erro ao excluir cliente: " + ex.getMessage());
            return false;
        }
    }
    
    public ProfessorTurma recuperar(int id){
        try {
            ProfessorTurma professorturma = professorTurmaDAO.recuperar(id);
            return professorturma;
        } catch (SQLException ex) {
            System.out.println("Erro ao consultar cliente: " + ex.getMessage());
            return null;
        }
    }
    
    //public void reperarTodos(){
    //    for (int i = 0; i < vetorProfessorTurma.size(); i++) {
    //    ProfessorTurma c = vetorProfessorTurma.get(i);
    //    c.imprimeAtributos();
    //    }
    //}
    
   public ArrayList<ProfessorTurma> recuperarTodos(){
        ArrayList<ProfessorTurma> vetorProfessorTurma = null;
        try {
            vetorProfessorTurma = professorTurmaDAO.recuperarTodos();
        } catch (SQLException ex) {
            System.out.println("Erro ao consultar professor por turma: " + ex.getMessage());
        }
        return vetorProfessorTurma;
    }

}

