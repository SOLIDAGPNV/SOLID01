/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProductosM;


/**
 *
 * @author Administrador
 */
public class Producto implements CalculoPrecio{
        protected double precioParcial;

    public double getPrecioParcial() {
        return precioParcial;
    }

    public void setPrecioParcial(double precioParcial) {
        this.precioParcial = precioParcial;
    }
    
    @Override
    public double calcularPrecioFinal(){
        double precioFinal;
        precioFinal=(getPrecioParcial()+(getPrecioParcial()*0.12));
        return precioFinal;
    } 
}
