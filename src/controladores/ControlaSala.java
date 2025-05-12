package controladores;

import entidades.DAO.SalaDAO;
import entidades.Sala;
import java.sql.SQLException;
import java.util.ArrayList;

public class ControlaSala {
   
    SalaDAO salaDAO = new  SalaDAO ();
      
     public boolean salvar(Sala c) {
        try {
             salaDAO.salvar(c);
            return true;
        } catch (SQLException ex) {
            System.out.println("Erro ao salvar sala: " + ex.getMessage());
            return false;
        }
    }
    
    public boolean editar(Sala c){
        try {
            salaDAO.editar(c);
            return true;
        } catch (SQLException ex) {
            System.out.println("Erro ao editar sala: " + ex.getMessage());
            return false;
        }
    }
    
    public boolean excluir(int id){
        try {
            salaDAO.excluir(id);
            return true;
        } catch (SQLException ex) {
            System.out.println("Erro ao excluir sala: " + ex.getMessage());
            return false;
        }
    }
    
    public Sala recuperar(int id){
        try {
            Sala cliente = salaDAO.recuperar(id);
            return cliente;
        } catch (SQLException ex) {
            System.out.println("Erro ao consultar sala: " + ex.getMessage());
            return null;
        }
    }
    
    //public void reperarTodos(){
    //    for (int i = 0; i < vetorSala.size(); i++) {
    //    Sala c = vetorSala.get(i);
    //    c.imprimeAtributos();
    //    }
    //}
    
  public ArrayList<Sala> recuperarTodos(){
        ArrayList<Sala> vetorSala = null;
        try {
            vetorSala = salaDAO.recuperarTodos();
        } catch (SQLException ex) {
            System.out.println("Erro ao consultar sala: " + ex.getMessage());
        }
        return vetorSala;
    }

}
