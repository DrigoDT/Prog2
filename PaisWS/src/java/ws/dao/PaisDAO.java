/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import ws.modelo.PaisModelo;


public class PaisDAO {
    
    public PaisDAO()
    {
        
    }
    
    public boolean inserir(PaisModelo Pais)
    {
        String sql = "INSERT INTO db_pais.dbo.dbPais(nome,continente,populacao) VALUES(?,?,?)";
        Boolean retorno = false;
        PreparedStatement pst = Conexao.getPreparedStatement(sql);
        //PreparedStatement pst = dao.Conexao.getPreparedStatement(sql);
        try {
            pst.setString(1, Pais.getNomePais());
            pst.setString(2, Pais.getContinentePais());
            pst.setString(3, Pais.getPopulacaoPais());
            
            if(pst.executeUpdate()>0)
            {
                retorno = true;
            }
                
        } catch (SQLException ex) {
            Logger.getLogger(PaisDAO.class.getName()).log(Level.SEVERE, null, ex);
            retorno = false;
        }
        
        return retorno;
    
    }
    
    public boolean atualizar(PaisModelo Pais)
    {
        String sql = "UPDATE Pais set nome=?,continente=?,populacao=? where id=?";
        Boolean retorno = false;
        PreparedStatement pst = Conexao.getPreparedStatement(sql);
        try {
          
            pst.setString(1, Pais.getNomePais());
            pst.setString(2, Pais.getContinentePais());
            pst.setString(3, Pais.getPopulacaoPais());
            
            if(pst.executeUpdate()>0)
            {
                retorno = true;
            }
                
        } catch (SQLException ex) {
            Logger.getLogger(PaisDAO.class.getName()).log(Level.SEVERE, null, ex);
            retorno = false;
        }
        
        
        return retorno;
        
    }
    
    public boolean excluir(PaisModelo Pais)
    {
        String sql = "DELETE FROM Pais where id=?";
        Boolean retorno = false;
        PreparedStatement pst = Conexao.getPreparedStatement(sql);
        try {
          
            pst.setInt(1, Pais.getIdPais());
            if(pst.executeUpdate()>0)
            {
                retorno = true;
            }
                
         } catch (SQLException ex) {
            Logger.getLogger(PaisDAO.class.getName()).log(Level.SEVERE, null, ex);
            retorno = false;
        }
        
        return retorno;
    }
    
    public List<PaisModelo> listar()
    {
        String sql = "SELECT * FROM Pais";
        List<PaisModelo> lista = new ArrayList<PaisModelo>();
        PaisModelo pais = null;
        
        PreparedStatement pst = Conexao.getPreparedStatement(sql);
        try {
           
            ResultSet res = pst.executeQuery();
            while(res.next()){
            
                pais = new PaisModelo();
                pais.setIdPais(res.getInt("id"));
                pais.setNomePais(res.getString("Nome"));
                pais.setContinentePais(res.getString("Continente"));
                pais.setPopulacaoPais(res.getString("Populacao"));
                lista.add(pais);
            }
               
        } catch (SQLException ex) {
            Logger.getLogger(PaisDAO.class.getName()).log(Level.SEVERE, null, ex);
            pais = new PaisModelo();
            pais.setNomePais(ex.getMessage().toString());
            lista.add(pais);
        }
        
        return lista;
        
    }
    
    public PaisModelo buscar(PaisModelo Pais)
    {
        String sql = "SELECT * FROM Pais where Nome=?";
        PaisModelo retorno = null;
        
        PreparedStatement pst = Conexao.getPreparedStatement(sql);
        try {
           
            pst.setString(1, Pais.getNomePais());
            ResultSet res = pst.executeQuery();
            
            if(res.next())
            {
                retorno = new PaisModelo();
                retorno.setIdPais(res.getInt("id"));
                retorno.setNomePais(res.getString("Nome"));
                retorno.setContinentePais(res.getString("Continente"));
                retorno.setPopulacaoPais(res.getString("Populacao"));
            }
               
        } catch (SQLException ex) {
           Logger.getLogger(PaisDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        /*PaisDAO pais = new PaisDAO();
        PaisModelo modelo = new PaisModelo();
        modelo.setNomePais(nmPais);
        pais.buscar(modelo);
        Gson g = new Gson();*/
        return retorno;
    }
}
