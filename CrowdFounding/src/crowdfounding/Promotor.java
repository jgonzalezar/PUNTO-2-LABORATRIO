/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crowdfounding;

/**
 *
 * @author ElJuano
 */
public class Promotor extends Participante{
    private double montoSolicitado;
    private String descripcionIniciativa;

    public Promotor(double montoSolicitado, String descripcionIniciativa, String tipo, String nombre) {
        super(tipo, nombre);
        this.montoSolicitado = montoSolicitado;
        this.descripcionIniciativa = descripcionIniciativa;
    }

    public double getMontoSolicitado() {
        return montoSolicitado;
    }

    public void setMontoSolicitado(double montoSolicitado) {
        this.montoSolicitado = montoSolicitado;
    }

    public String getDescripcionIniciativa() {
        return descripcionIniciativa;
    }

    public void setDescripcionIniciativa(String descripcionIniciativa) {
        this.descripcionIniciativa = descripcionIniciativa;
    }

        
    
}
