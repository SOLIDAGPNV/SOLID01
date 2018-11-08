/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PostresM;

import Postres.*;
import java.util.ArrayList;
import Otros.Aderezo;

/**
 *
 * @author Pedro Mendoza
 */
public class Helado extends Postre {
  
    public Helado(String sabor){
        super(sabor);
    }
    
   

    @Override
    public String toString() {
        return "Helado{" + "sabor=" + sabor + ", precioParcial=" + precioParcial + ", aderezos=" + aderezos + '}';
    }
    
    
    
    
    
}
