/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

/**
 *
 * @author rodrigodelbone
 */
public class Jogo {
    private int id;
    private String timeA;
    private String timeB;
    private int golsA;
    private int golsB;

    public Jogo() {

    }
    
    public Jogo(int id, String timeA, String timeB, int golsA, int golsB){
        this.id = id;
        this.timeA = timeA;
        this.timeB = timeB;
        this.golsA = golsA;
        this.golsB = golsB;       
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public int getId(){
        return id;
    }
    
    public void setTimeA(String timeA){
        this.timeA = timeA;
    }
    
    public String getTimeA(){
        return timeA;
    }
    
    public void setTimeB(String timeB){
        this.timeB = timeB;
    }
    
    public String getTimeB(){
        return timeB;
    }
    
    public void setGolsA(int golsA){
        this.golsA = golsA;
    }
    
    public int getGolsA(){
        return golsA;
    }
    
    public void setGolsB(int golsB){
        this.golsB = golsB;
    }
    
    public int getGolsB(){
        return golsB;
    }  
}
