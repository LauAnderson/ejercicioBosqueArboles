package com.dh.flyweigth;

import com.dh.flyweigth.model.Bosque;
import com.dh.flyweigth.model.TipoArbol;

public class Main {

    public static void main(String[] args) {
        Bosque bosque1 = new Bosque("bosqueCeli"); //Instanciamos el bosque
        for (int i = 0; i < 5 ; i++){ //For para recorrer la lista de arboles
            bosque1.plantarArbol(TipoArbol.FRUTALES); //Plantamos arboles del tipo frutal
            bosque1.plantarArbol(TipoArbol.ORNAMENTALES); //Plantamos arboles del tipo ornamental
        }
        bosque1.listarArboles(); //Listamos la lista de arboles
    }
}
