
package controladores;

import entidades.DAO.ProfessorDAO;
import entidades.Professor;
import java.sql.SQLException;
import java.util.ArrayList;

public class ControlaProfessor {
   
      ProfessorDAO professorDAO = new ProfessorDAO();
      
     public boolean salvar(Professor c) {
        try {
             professorDAO.salvar(c);
            return true;
        } catch (SQLException ex) {
            System.out.println("Erro ao salvar professor: " + ex.getMessage());
            return false;
        }
    }
    
    public boolean editar(Professor c){
        try {
            professorDAO.editar(c);
            return true;
        } catch (SQLException ex) {
            System.out.println("Erro ao editar professor: " + ex.getMessage());
            return false;
        }
    }
    
    public boolean excluir(int id){
        try {
            professorDAO.excluir(id);
            return true;
        } catch (SQLException ex) {
            System.out.println("Erro ao excluir professor: " + ex.getMessage());
            return false;
        }
    }
    
    public Professor recuperar(int id){
        try {
            Professor professor = professorDAO.recuperar(id);
            return professor;
        } catch (SQLException ex) {
            System.out.println("Erro ao consultar professor: " + ex.getMessage());
            return null;
        }
    }
    
    //public void reperarTodos(){
    //    for (int i = 0; i < vetorProfessor.size(); i++) {
    //    Professor c = vetorProfessor.get(i);
    //    c.imprimeAtributos();
    //    }
    //}
    
    public ArrayList<Professor> recuperarTodos(){
        ArrayList<Professor> vetorProfessor = null;
        try {
            vetorProfessor = professorDAO.recuperarTodos();
        } catch (SQLException ex) {
            System.out.println("Erro ao consultar professor: " + ex.getMessage());
        }
        return vetorProfessor;
    }

}
