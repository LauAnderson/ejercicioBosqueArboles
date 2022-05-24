package com.dh.flyweigth.model;

public class Arbol {
    private TipoArbol tipoArbol; //Atributo del TipoArbol instanciado en el enum


    public Arbol(TipoArbol tipoArbol) { //Constructor
        this.tipoArbol = tipoArbol;
    }


    public TipoArbol getTipoArbol() { //Métodos accesores
        return tipoArbol;
    }

    public void setTipoArbol(TipoArbol tipoArbol) {
        this.tipoArbol = tipoArbol;
    }

}
