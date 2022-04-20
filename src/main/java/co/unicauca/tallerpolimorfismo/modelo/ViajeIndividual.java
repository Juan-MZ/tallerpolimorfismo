/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.unicauca.tallerpolimorfismo.modelo;

import java.util.Date;

/**
 *
 * @author JuanMZ
 */
public class ViajeIndividual extends Viaje {

    //constructor
    public ViajeIndividual(){
    
    }
    
    public ViajeIndividual(String origen, String destino, int costo, Date fechaSalida, Date fechaLlegada) {
        super(origen, destino, costo, fechaSalida, fechaLlegada);
    }
    
    //metodo
    @Override
    public String descripcion() {
        return "Disfruta tu viaje individual";
    }
    
    //No se sobreescribe cualquierMetodo2()
}
