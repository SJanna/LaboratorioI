/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arbol;

import java.io.Serializable;
import java.util.LinkedList;

/**
 *
 * @author alexz
 */
public abstract class Nodo implements Serializable{
    
    private LinkedList<Nodo> hijos;

    public LinkedList getHijos() {
        return hijos;
    }
}
