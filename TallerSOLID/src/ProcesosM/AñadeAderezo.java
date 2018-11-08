/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProcesosM;

import Procesos.*;
import Otros.Aderezo;
import PostresM.Postre;


/**
 *
 * @author Pedro Mendoza
 */
public class AñadeAderezo {
    
    public static void anadirAderezo(Postre postre,Aderezo aderezo){
        postre.getAderezos().add(aderezo);
    }
    
 
    
}
