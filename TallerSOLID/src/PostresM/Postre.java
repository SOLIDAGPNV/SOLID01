/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PostresM;

import OtrosM.Aderezo;
import ProductosM.Producto;
import java.util.ArrayList;

/**
 *
 * @author Administrador
 */
public class Postre extends Producto{
    protected String sabor;
    protected ArrayList<Aderezo> aderezos;

    
    public Postre(String sabor) {
        this.sabor = sabor;
        aderezos= new ArrayList<>();
    }
    
     
    public ArrayList<Aderezo> getAderezos() {
        return aderezos;
    }

    
    @Override
    public double calcularPrecioFinal() {
        double precioFinal;
        precioFinal=(getPrecioParcial()+(getPrecioParcial()*0.12))+(aderezos.size()*0.50);
        return precioFinal;
    }
    
    
}
