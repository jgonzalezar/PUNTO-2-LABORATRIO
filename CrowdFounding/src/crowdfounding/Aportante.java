/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crowdfounding;

import java.util.ArrayList;

/**
 *
 * @author ElJuano
 */
public class Aportante extends Participante {

    private ArrayList <Idea> ideas;
    private ArrayList <Fondo> fondos;
    private ArrayList <Recurso> recursos;
    private ArrayList<Promotor> Ofertantes;

    public Aportante(String tipo, String nombre) {
        super(tipo, nombre);
        this.Ofertantes = new ArrayList<>();

    }
    
    public void ofertar(){
        
    }

    public ArrayList<Promotor> getOfertantes() {
        return Ofertantes;
    }

    public void setOfertantes(ArrayList<Promotor> Ofertantes) {
        this.Ofertantes = Ofertantes;
    }

    
}
