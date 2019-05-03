package DataAccess;

/**
 *
 * @author Wanda
 */

import java.sql.*;

public class PaisDAO {
    Connection conexao;
    
    public void AbreConexaoBanco() throws ClassNotFoundException, SQLException, SQLException{
        Class.forName("org.apache.derby.jdbc.ClientDriver");
        //System.out.println("Driver JDBC carregado");
        String url = "jdbc:derby://localhost:1527/projeto";
        String usuario = "projeto";
        String senha = "projeto";

        conexao = DriverManager.getConnection(url, usuario, senha);
        System.out.println("Conexão efetuada com sucesso!");
    }
    
    public void FechaConexaoBanco() throws SQLException{
        conexao.close();
    }

    public int Inserir(int id, String nome, String continente,Double populacao ) throws ClassNotFoundException, SQLException{

        AbreConexaoBanco();
        String sqlInsert = "INSERT INTO PAIS(id, nome, continente,populacao) VALUES (?,?,?,?)";
        PreparedStatement stmInsert = conexao.prepareStatement(sqlInsert);
        stmInsert.setInt(1, id);
        stmInsert.setString(2, nome);
        stmInsert.setString(3, continente);
        stmInsert.setDouble(4, populacao);
        FechaConexaoBanco();
        return stmInsert.executeUpdate();
    }

    public int Atualiza(int id, String nome, String continente,Double populacao ) throws ClassNotFoundException, SQLException{

        AbreConexaoBanco();
        String sqlUpdate = "UPDATE pais SET nome=?,continente=?, populacao=? WHERE ID = ?";
        PreparedStatement stmUpdate = conexao.prepareStatement(sqlUpdate);
        stmUpdate.setInt(1, id);
        stmUpdate.setString(2, nome);
        stmUpdate.setString(3, continente);
        stmUpdate.setDouble(4, populacao);
        FechaConexaoBanco();
        return stmUpdate.executeUpdate();
    }
    
    public int Exclui(int id, String nome, String continente,Double populacao ) throws ClassNotFoundException, SQLException{

        AbreConexaoBanco();
        String sqlDelete = "DELETE FROM pais WHERE ID =?";
        PreparedStatement stmDelete = conexao.prepareStatement(sqlDelete);
        stmDelete.setInt(1,id);
        FechaConexaoBanco();
        return stmDelete.executeUpdate();
    }

    public ResultSet Selecionar() throws SQLException, ClassNotFoundException{
        
        String sqlSelect = "SELECT * FROM pais";
        
        AbreConexaoBanco();
        PreparedStatement stmSelect = conexao.prepareStatement(sqlSelect);
        FechaConexaoBanco();
        return  stmSelect.executeQuery();
    }
    
    
}
