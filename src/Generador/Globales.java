/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Generador;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author rodri
 */
public class Globales {
    
    public static HashMap<String,Object> Variables = new HashMap<>();
    public static ArrayList<Token> tekens = new ArrayList<>();
    public static ArrayList<Token> error = new ArrayList<>();
      public static void imprimirHashMap() {
        for (Map.Entry<String, Object> entry : Variables.entrySet()) {
            String clave = entry.getKey();
            Object valor = entry.getValue();
            System.out.println("Clave: " + clave + ", Valor: " + valor);
        }
    }
      
    public static void guardarVariables(String clave, Object valor) {
        Variables.put(clave, valor);
    }
}

