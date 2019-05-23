/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SQL;

import Classes.Jogo;
import BD.BDJogo;

/**
 *
 * @author rodrigodelbone
 */
public class Teste {
    
    public static void main(String[] args) {
        
        BDJogo ddb;
        ddb = new BDJogo() {
            @Override
            public boolean create(Jogo jogo) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public Jogo read(int id) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public boolean update(Jogo jogo) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public boolean delete(Jogo jogo) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        };
        Jogo in = new Jogo(88,"Atletico","Cruzeiro",7,10);
        if (ddb.create(in)){
            System.out.println("Funciona...");
        }
    }
    
}
