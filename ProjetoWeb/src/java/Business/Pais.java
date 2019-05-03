package Business;

import DataAccess.PaisDAO;
import java.sql.ResultSet;

/**
 *
 * @author Wanda
 */
public class Pais {
    
    PaisDAO dao = new PaisDAO();
    
    public String Inserir(int id, String nome, String continente,Double populacao ){
        try{
            dao.Inserir(id, nome, continente, populacao);
            return "Registro incluído com sucesso!";
        }
        catch(Exception ex){
            return "Erro ao inserir o registro:" + ex.getMessage();
        }
    }

    public String Atualiza(int id, String nome, String continente,Double populacao ){
        try{
            dao.Atualiza(id, nome, continente, populacao);
            return "Registro atualizado com sucesso!";
        }
        catch(Exception ex){
            return "Erro ao atualizar o registro:" + ex.getMessage();
        }
    }
    
    public String Exclui(int id, String nome, String continente,Double populacao ){
        try{
            dao.Inserir(id, nome, continente, populacao);
            return "Registro excluído com sucesso!";
        }
        catch(Exception ex){
            return "Erro ao excluir o registro:" + ex.getMessage();
        }
    }

    public ResultSet Selecionar(){
        try{
            return dao.Selecionar();
        }
        catch(Exception ex){
            return null;
        }
    }


    
}
