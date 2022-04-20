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
public class ViajeIncentivo extends Viaje {
    //Empresa patrocina el viaje al empleado
    
    //atributo
    private String empresa;

    //constructor
    public ViajeIncentivo(String empresa){
        this.empresa = empresa;
    }
    
    public ViajeIncentivo(String origen, String destino, int costo, Date fechaSalida, Date fechaLlegada, String empresa) {
        super(origen, destino, costo, fechaSalida, fechaLlegada);
        this.empresa = empresa;
    }

    //getter and setter
    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }
    
    //metodos
    @Override
    public String descripcion() {
        return "Viaje incentivo que te envía la empresa "+ empresa;
    }
    
    @Override
    public String cualquierMetodo2(){
        return "Método implementado en la clase hija viaje de incentivo";
    }
}
