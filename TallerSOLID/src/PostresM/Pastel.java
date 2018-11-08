/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PostresM;

/**
 *
 * @author Pedro Mendoza
 */
public class Pastel extends Postre{

    public Pastel(String sabor)
    {
        super(sabor);      
    }
    
 
    @Override
    public String toString() {
        return "Pastel{" + "sabor=" + sabor + ", precioParcial=" + precioParcial + ", aderezos=" + aderezos + '}';
    }
    
    
}
