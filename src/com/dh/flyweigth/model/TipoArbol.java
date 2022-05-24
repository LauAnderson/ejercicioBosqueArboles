package com.dh.flyweigth.model;

public enum TipoArbol {
    ORNAMENTALES("verde",400.0 ,200.0 ), //Instanciando los tipos de arboles, con sus atributos.
    FRUTALES("rojo", 300.0, 500.0);


    private String color; //Atributos del arbol
    private Double ancho;
    private Double alto;



    TipoArbol(String color, Double ancho, Double largo) { //Constructor
        this.color = color;
        this.ancho = ancho;
        this.alto = largo;
    }

    public String getColor() { //Métodos accesores
        return color;
    }

    public Double getAncho() {
        return ancho;
    }

    public Double getAlto() {
        return alto;
    }
}
