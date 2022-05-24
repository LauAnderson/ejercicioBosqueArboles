package com.dh.flyweigth.model;

import com.dh.flyweigth.factory.ArbolFactory;

import java.util.ArrayList;
import java.util.List;

public class Bosque {
    private String nombre; //Atributos
    private List<Arbol> bosqueArboles = new ArrayList<>(); //Haciendo una lista de arboles

    public Bosque(String nombre) {
        this.nombre = nombre;
    } //Constructor

    public String getNombre() {
        return nombre;
    } //Métodos accesores

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Arbol> getBosqueArboles() {
        return bosqueArboles;
    }

    public void setBosqueArboles(List<Arbol> bosqueArboles) {
        this.bosqueArboles = bosqueArboles;
    }

    public void plantarArbol(TipoArbol tipoArbol){ //Obtener del factory el árbol, por su tipo y agregarlo a la lista de arboles
        bosqueArboles.add(ArbolFactory.obtenerArbol(tipoArbol));
        System.out.println("Planteando el arbol:" + tipoArbol);
    }
    public void listarArboles(){
        int contadorRojo= 0; //Iniciamos los contadores en 0
        int contadorVerde= 0;

        for (Arbol arbol: bosqueArboles
             ) {
            if (arbol.getTipoArbol().getColor().equals("rojo")) { //Evaluamos la condición de si el arbol obtenido del factory

                contadorRojo ++ ; //si es igual a rojo, que lo sume al contador
            } else {
                contadorVerde ++;// si es igual a verde, que lo sume al contador
            }
        }
        System.out.println("La cantidad de arboles rojos es:" + contadorRojo); //Mostramos por pantalla la cantidad de arboles de cada color.
        System.out.println("La cantidad de arboles verdes es:" + contadorVerde);
    }
}