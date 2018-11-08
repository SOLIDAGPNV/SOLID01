/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PrincipalM;
import CalculosM.CalculoPrecioFinal;
import PostresM.*;
import ProcesosM.*;
import OtrosM.*;
/**
 *
 * @author djurado
 */
public class Sistema {
    public static void main(String [ ] args){
        // Producir un helado de vainilla y una torta de chocolate, 
        // a ambos agregarles CREMA y FRUTILLAS
        
        // Producir Helado
        Helado helado_vainilla = new Helado("Vainilla");
        AñadeAderezo.anadirAderezo(helado_vainilla, Aderezo.CREMA);
        AñadeAderezo.anadirAderezo(helado_vainilla, Aderezo.FRUTILLA);
        System.out.println(helado_vainilla);
        
        // Producir Pastel
        Pastel pastel_chocolate = new Pastel("Chocolate");
        QuitaAderezo.quitarAderezo(pastel_chocolate, Aderezo.CREMA);
        QuitaAderezo.quitarAderezo(pastel_chocolate, Aderezo.FRUTILLA);
        System.out.println(pastel_chocolate);
     
    }
}
