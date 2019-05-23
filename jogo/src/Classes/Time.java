/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

/**Isabella
 *
 * @author rodrigodelbone
 */
public class Time {
    private int id;
    private String nome;
    private  int anofundacao;
    private String cidade; 
    private String estado;
    
    public Time(int id, String nome, int ano_fundacao, String cidade, String estado){
        this.id = id;
        this.nome = nome;
        this.anofundacao = anofundacao;
        this.cidade = cidade;
        this.estado = estado; 
    }

    public Time() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
  
    public void setId(int id) {
        this.id = id;
    }
    public int getId(){
        return this.id;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
 
    public String getNome(){
        return this.nome;
    }
    public void setAnofundacao(int anofundacao){
        this.anofundacao = anofundacao;
    }
    public int getAnofundacao(){
        return this.anofundacao;
    }
    public void setCidade (String cidade){
        this.cidade = cidade;
    }
    public String getCidade(){
        return this.cidade;
    }
    public void setEstado (String estado){
        this.estado = estado;
    }
    public String getEstado(){
        return this.estado;
    }
    
}
