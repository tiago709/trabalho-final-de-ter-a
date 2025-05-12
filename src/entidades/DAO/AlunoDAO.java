package entidades.DAO;

import apoio.ConexaoBD;
import entidades.Aluno;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


public class AlunoDAO {
    
     ResultSet resultadoQ = null;

    public void salvar(Aluno c) throws SQLException {

        String sql = ""
                + "INSERT INTO aluno (cidadeAluno, bairroAluno, ruaAluno, numeroAluno, cepAluno, nomeAluno, cpfAluno, rgAluno, dataNascAluno, sexoAluno, estadoCivilAluno, racaAluno) VALUES ("
                + "'" + c.getCidadeAluno()+ "',"
                + "'" + c.getBairroAluno()+ "',"
                + "'" + c.getRuaAluno()+ "',"
                + "'" + c.getNumeroAluno()+ "',"
                + "'" + c.getCepAluno()+ "',"
                + "'" + c.getNomeAluno()+ "',"
                + "'" + c.getCpfAluno()+ "',"
                + "'" + c.getRgAluno()+ "',"
                + "'" + c.getDataNascAluno()+ "',"
                + "'" + c.getSexoAluno()+ "',"
                + "'" + c.getEstadoCivilAluno()+ "',"
                + "'" + c.getRacaAluno()+ "' "
                + ")";
        
        System.out.println("sql: " + sql);
        
        ConexaoBD.executeUpdate(sql);

    }

    public ArrayList<Aluno> recuperarTodos() throws SQLException {
        ArrayList<Aluno> alunos = new ArrayList();

        String sql = ""
                + "SELECT * FROM aluno ";

        resultadoQ = ConexaoBD.executeQuery(sql);

        while (resultadoQ.next()) {
            Aluno aluno = new Aluno();

            aluno.setBairroAluno(resultadoQ.getString("bairroAluno"));
            aluno.setCdAluno(resultadoQ.getInt("cdAluno"));
            aluno.setCepAluno(resultadoQ.getString("cepAluno"));
            aluno.setCidadeAluno(resultadoQ.getString("cidadeAluno"));
            aluno.setCpfAluno(resultadoQ.getString("cpfAluno"));
            aluno.setDataNascAluno(resultadoQ.getString("dataNascAluno"));
            aluno.setEstadoCivilAluno(resultadoQ.getString("estadoCivilAluno"));
            aluno.setNomeAluno(resultadoQ.getString("nomeAluno"));
            aluno.setNumeroAluno(resultadoQ.getInt("numeroAluno"));
            aluno.setRacaAluno(resultadoQ.getString("racaAluno"));
            aluno.setRgAluno(resultadoQ.getString("rgAluno"));
            aluno.setRuaAluno(resultadoQ.getString("ruaAluno"));
            aluno.setSexoAluno(resultadoQ.getString("sexoAluno"));
            

            alunos.add(aluno);
        }

        return alunos;
    }
    
    public Aluno recuperar(int id) throws SQLException {
        Aluno aluno = null;
        String sql = ""
                + "SELECT * FROM aluno WHERE cdAluno = " + id;

        resultadoQ = ConexaoBD.executeQuery(sql);

        if (resultadoQ.next()) {
            aluno = new Aluno();

            aluno.setBairroAluno(resultadoQ.getString("bairroAluno"));
            aluno.setCdAluno(resultadoQ.getInt("cdAluno"));
            aluno.setCepAluno(resultadoQ.getString("cepAluno"));
            aluno.setCidadeAluno(resultadoQ.getString("cidadeAluno"));
            aluno.setCpfAluno(resultadoQ.getString("cpfAluno"));
            aluno.setDataNascAluno(resultadoQ.getString("dataNascAluno"));
            aluno.setEstadoCivilAluno(resultadoQ.getString("estadoCivilAluno"));
            aluno.setNomeAluno(resultadoQ.getString("nomeAluno"));
            aluno.setNumeroAluno(resultadoQ.getInt("numeroAluno"));
            aluno.setRacaAluno(resultadoQ.getString("racaAluno"));
            aluno.setRgAluno(resultadoQ.getString("rgAluno"));
            aluno.setRuaAluno(resultadoQ.getString("ruaAluno"));
            aluno.setSexoAluno(resultadoQ.getString("sexoAluno"));
            
        }

        return aluno;
    }

    public void editar(Aluno c) throws SQLException {
        String sql = ""
                + "UPDATE aluno "
                + "SET "
                + "cidadeAluno = '" + c.getCidadeAluno()+ "',"
                + "bairroAluno = '" + c.getBairroAluno()+ "',"
                + "ruaAluno = '" + c.getRuaAluno()+ "',"
                + "numeroAluno = '" + c.getNumeroAluno()+ "',"
                + "cepAluno = '" + c.getCepAluno()+ "',"
                + "nomeAluno = '" + c.getNomeAluno()+ "',"
                + "cpfAluno = '" + c.getCpfAluno()+ "',"
                + "rgAluno = '" + c.getRgAluno()+ "',"
                + "dataNascAluno = '" + c.getDataNascAluno()+ "',"
                + "sexoAluno = '" + c.getSexoAluno()+ "',"
                + "estadoCivilAluno = '" + c.getEstadoCivilAluno()+ "',"
                + "racaAluno = '" + c.getRacaAluno()+ "' "
                + "WHERE cdAluno = " + c.getCdAluno();

        System.out.println("sql: " + sql);

        ConexaoBD.executeUpdate(sql);
    }

    public void excluir(int id) throws SQLException {
        String sql = ""
                + "DELETE FROM aluno WHERE cdAluno = " + id;

        System.out.println("sql: " + sql);

        ConexaoBD.executeUpdate(sql);
    }
}


