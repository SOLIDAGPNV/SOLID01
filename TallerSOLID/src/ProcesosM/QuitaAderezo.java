/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProcesosM;

import Otros.Aderezo;
import PostresM.Postre;

/**
 *
 * @author Administrador
 */
public class QuitaAderezo {
       public static void quitarAderezo(Postre postre,Aderezo aderezo){
        postre.getAderezos().remove(aderezo);
    }
}
