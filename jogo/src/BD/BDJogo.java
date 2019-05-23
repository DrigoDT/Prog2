/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BD;

import Classes.Jogo;

/**
 * Metodos - interface do das acoes create,update...
 * @author rodrigodelbone
 */
public interface BDJogo {
    public boolean create(Jogo jogo);
    public Jogo read (int id);
    public boolean update (Jogo jogo);
    public boolean delete (Jogo jogo);
}
