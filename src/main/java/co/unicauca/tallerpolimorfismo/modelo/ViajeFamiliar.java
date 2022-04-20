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
public class ViajeFamiliar extends Viaje {
    //cantidad de integrantes de una familia
    private int familia;

    public ViajeFamiliar(int familia){
        this.familia = familia;
    }
    
    public ViajeFamiliar(String origen, String destino, int costo, Date fechaSalida, Date fechaLlegada, int familia) {
        super(origen, destino, costo, fechaSalida, fechaLlegada);
        this.familia = familia;
    }

    //metodos
    @Override
    public String descripcion() {
        return "viaje para disfrutar con toda tu familia";
    }
    
    @Override
    public String cualquierMetodo2(){
        return "Método implementado en la clase hija ViajeFamiliar";
    }
    
    //getter and setter
    public int getFamilia() {
        return familia;
    }

    public void setFamilia(int familia) {
        this.familia = familia;
    }
}
