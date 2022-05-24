package com.dh.flyweigth.factory;

import com.dh.flyweigth.model.Arbol;
import com.dh.flyweigth.model.TipoArbol;

import java.util.HashMap;

public class ArbolFactory {
    private static final HashMap<TipoArbol, Arbol> ARBOL_MAP = new HashMap<>(); //Creando un método para que se fije en el cache si esta el árbol

    public static Arbol obtenerArbol(TipoArbol tipoArbol){ //Método obtener árbol, por su tipo
        Arbol arbol =  ARBOL_MAP.get(tipoArbol); //Creando un árbol, primero se fija si esta en el cache y si es así que lo obtenga por el tipo
        if (arbol == null){ //Evaluando la condición de si el árbol es igual a nulo
            arbol = new Arbol(tipoArbol); //Entonces cree es nuevo árbol por su tipo
            ARBOL_MAP.put(tipoArbol, arbol); //Y ahora con el método map lo agregue al cache, por su tipo
            System.out.println("Creando arbol del tipo:" + tipoArbol);
            return arbol; //Retorna el árbol creado
        }
        System.out.println("Recuperando arbol del tipo: " + tipoArbol); //Si el árbol esta guardado en el cache, que lo recupere y retorne
        return arbol;

    }

}
