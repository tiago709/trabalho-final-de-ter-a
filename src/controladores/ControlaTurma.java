
package controladores;

import entidades.DAO.TurmaDAO;
import entidades.Turma;
import java.sql.SQLException;
import java.util.ArrayList;

public class ControlaTurma {

   TurmaDAO turmaDAO = new  TurmaDAO ();
      
     public boolean salvar(Turma c) {
        try {
             turmaDAO.salvar(c);
            return true;
        } catch (SQLException ex) {
            System.out.println("Erro ao salvar turma: " + ex.getMessage());
            return false;
        }
    }
    
     public boolean editar(Turma c){
        try {
            turmaDAO.editar(c);
            return true;
        } catch (SQLException ex) {
            System.out.println("Erro ao editar turma: " + ex.getMessage());
            return false;
        }
    }
    
    public boolean excluir(int id){
        try {
            turmaDAO.excluir(id);
            return true;
        } catch (SQLException ex) {
            System.out.println("Erro ao excluir turma: " + ex.getMessage());
            return false;
        }
    }
    
    public Turma recuperar(int id){
        try {
            Turma cliente = turmaDAO.recuperar(id);
            return cliente;
        } catch (SQLException ex) {
            System.out.println("Erro ao consultar turma: " + ex.getMessage());
            return null;
        }
    }
    
    //public void reperarTodos(){
    //    for (int i = 0; i < vetorTurma.size(); i++) {
    //    Turma c = vetorTurma.get(i);
    //    c.imprimeAtributos();
    //    }
    //}
    
   public ArrayList<Turma> recuperarTodos(){
        ArrayList<Turma> vetorTurma = null;
        try {
            vetorTurma = turmaDAO.recuperarTodos();
        } catch (SQLException ex) {
            System.out.println("Erro ao consultar turma: " + ex.getMessage());
        }
        return vetorTurma;
    }

}

