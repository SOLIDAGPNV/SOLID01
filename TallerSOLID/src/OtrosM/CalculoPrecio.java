/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OtrosM;

import PostresM.Postre;
import ProductosM.Producto;

/**
 *
 * @author Administrador
 */
public class CalculoPrecio {
    
        public double calcularPrecioFinal(Producto producto){
        double precioFinal;
        double extras=0;
        
        if(producto instanceof Postre){
            Postre p=(Postre) producto;
            extras=p.getAderezos().size();
        }
        
        precioFinal=(producto.getPrecioParcial()+(producto.getPrecioParcial()*0.12))+(extras*0.50);
        return precioFinal;
    }
}
