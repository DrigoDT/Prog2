/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BD;

import Classes.Jogo;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
/**
 *
 * @author rodrigodelbone
 */
public class ABDJogo {
    public class BD implements BDJogo{

    private Connection getConnection() {
        String url = "jdbc:derby://localhost:1527/sistema_jogo"; /*conectar com o bd JDBC */
        String user = "jogo";
        String password = "jogo";
        try {
            Connection conn = DriverManager.getConnection(url, user, password);
            return conn;
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public boolean create(Jogo jogo) {
        try {
            Connection conn = getConnection();
            String sql = "INSERT INTO jogo (id, timeA, timeB, golsA, golsB) VALUES (?,?,?,?,?)";
            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setInt(1, jogo.getId());
            pstm.setString(2, jogo.getTimeA());
            pstm.setString(3, jogo.getTimeB());
            pstm.setInt(4, jogo.getGolsA());
            pstm.setInt(5, jogo.getGolsB());
            pstm.executeUpdate();

            conn.close();
            return true;
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public Jogo read(int id) {
        try {
            Jogo resposta = new Jogo();
            Connection conn = getConnection();
            String sql = "SELECT * FROM jogo WHERE id=?";
            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setInt(1, id);
            ResultSet rs = pstm.executeQuery();

            if (!rs.next()){ 
                return null; }

            resposta.setId(rs.getInt(sql));
            resposta.setTimeA(rs.getString(sql));
            resposta.setTimeB(rs.getString(sql));
            resposta.setGolsA(rs.getInt(sql));
            resposta.setGolsB(rs.getInt(sql));
            
            pstm.close();
            conn.close();
            return resposta;
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public boolean update(Jogo jogo) {
        try{
            Connection conn= getConnection ();
            String sql = "UPDATE jogo SET timeA=?, timeB=?, golsA=?, golsB=? WHERE id=?";
            PreparedStatement pstm= conn.prepareStatement(sql);
            pstm.setString(1, jogo.getTimeA());
            pstm.setString(2, jogo.getTimeB());
            pstm.setInt(3, jogo.getGolsA());
            pstm.setInt(4, jogo.getGolsB());
            pstm.setInt(5, jogo.getId());
            pstm.executeUpdate();
            
            pstm.close();
            conn.close();
            return true;
            
        } catch (Exception e){
            e.printStackTrace();
        }
        return false;
    }

    public boolean delete(Jogo jogo) {
        try {
            Connection conn = getConnection();
            String sql = "DELETE FROM jogo WHERE id=?";
            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setInt(1, jogo.getId());
            pstm.executeUpdate();
            
            pstm.close();
            conn.close();
            return true;
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
}

    
}
