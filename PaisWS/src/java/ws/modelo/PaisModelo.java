/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws.modelo;

/**
 *
 * @author tadeu
 */
public class PaisModelo {
    
    private int idPais;
    private String NomePais;
    private String PopulacaoPais;
    private String ContinentePais;

    /**
     * @return the NomePais
     */
    public String getNomePais() {
        return NomePais;
    }

    /**
     * @param NomePais the NomePais to set
     */
    public void setNomePais(String NomePais) {
        this.NomePais = NomePais;
    }

    /**
     * @return the PopulacaoPais
     */
    public String getPopulacaoPais() {
        return PopulacaoPais;
    }

    /**
     * @param PopulacaoPais the PopulacaoPais to set
     */
    public void setPopulacaoPais(String PopulacaoPais) {
        this.PopulacaoPais = PopulacaoPais;
    }

    /**
     * @return the ContinentePais
     */
    public String getContinentePais() {
        return ContinentePais;
    }

    /**
     * @param ContinentePais the ContinentePais to set
     */
    public void setContinentePais(String ContinentePais) {
        this.ContinentePais = ContinentePais;
    }

    public void Set(String brasil) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * @return the idPais
     */
    public int getIdPais() {
        return idPais;
    }

    /**
     * @param idPais the idPais to set
     */
    public void setIdPais(int idPais) {
        this.idPais = idPais;
    }
    
    
}
