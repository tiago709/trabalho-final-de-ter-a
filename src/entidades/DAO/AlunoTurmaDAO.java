package entidades.DAO;

import apoio.ConexaoBD;
import entidades.AlunoTurma;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class AlunoTurmaDAO {
    

 ResultSet resultadoQ = null;

    public void salvar(AlunoTurma c) throws SQLException {

        String sql = ""
                + "INSERT INTO alunoTurma (cdAluno, cdTurma, frequencia, nota1, nota2, nota3) VALUES ("
                + "'" + c.getCdAluno()+ "',"
                + "'" + c.getCdTurma()+ "',"
                + "'" + c.getFrequencia()+ "',"
                + "'" + c.getNota1()+ "',"
                + "'" + c.getNota2()+ "',"
                + "'" + c.getNota3()+ "' "
                + ")";
        
        System.out.println("sql: " + sql);
        
        ConexaoBD.executeUpdate(sql);

    }

    public ArrayList<AlunoTurma> recuperarTodos() throws SQLException {
        ArrayList<AlunoTurma> alunosturmas = new ArrayList();

        String sql = ""
                + "SELECT * FROM alunoTurma ";

        resultadoQ = ConexaoBD.executeQuery(sql);

        while (resultadoQ.next()) {
            AlunoTurma alunoturma = new AlunoTurma();

            alunoturma.setCdAluno(resultadoQ.getInt("cdAluno"));
            alunoturma.setCdAlunoTurma(resultadoQ.getInt("cdAlunoTurma"));
            alunoturma.setCdTurma(resultadoQ.getInt("cdTurma"));
            alunoturma.setFrequencia(resultadoQ.getInt("frequencia"));
            alunoturma.setNota1(resultadoQ.getDouble("nota1"));
            alunoturma.setNota2(resultadoQ.getDouble("nota2"));
            alunoturma.setNota3(resultadoQ.getDouble("nota3"));
            

            alunosturmas.add(alunoturma);
        }

        return alunosturmas;
    }
    
    public AlunoTurma recuperar(int id) throws SQLException {
        AlunoTurma alunoTurma = null;
        String sql = ""
                + "SELECT * FROM alunoTurma WHERE cdAlunoTurma = " + id;

        resultadoQ = ConexaoBD.executeQuery(sql);

        if (resultadoQ.next()) {
            alunoTurma = new AlunoTurma();

            alunoTurma.setCdAluno(resultadoQ.getInt("cdAluno"));
            alunoTurma.setCdAlunoTurma(resultadoQ.getInt("cdAlunoTurma"));
            alunoTurma.setCdTurma(resultadoQ.getInt("cdTurma"));
            alunoTurma.setFrequencia(resultadoQ.getInt("frequencia"));
            alunoTurma.setNota1(resultadoQ.getDouble("nota1"));
            alunoTurma.setNota2(resultadoQ.getDouble("nota2"));
            alunoTurma.setNota3(resultadoQ.getDouble("nota3"));
            
        }

        return alunoTurma;
    }

    public void editar(AlunoTurma c) throws SQLException {
        String sql = ""
                + "UPDATE alunoTurma "
                + "SET "
                + "cdAluno = '" + c.getCdAluno()+ "',"
                + "cdTurma = '" + c.getCdTurma()+ "',"
                + "frequencia = '" + c.getFrequencia()+ "',"
                + "nota1 = '" + c.getNota1()+ "',"
                + "nota2 = '" + c.getNota2()+ "',"
                + "nota3 = '" + c.getNota3()+ "' "
                + "WHERE cdAlunoTurma = " + c.getCdAlunoTurma();

        System.out.println("sql: " + sql);

        ConexaoBD.executeUpdate(sql);
    }

    public void excluir(int id) throws SQLException {
        String sql = ""
                + "DELETE FROM alunoTurma WHERE cdAlunoTurma = " + id;

        System.out.println("sql: " + sql);

        ConexaoBD.executeUpdate(sql);
    }
}
