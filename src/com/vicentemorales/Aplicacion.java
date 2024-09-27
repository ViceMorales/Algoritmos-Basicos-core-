package com.vicentemorales;

import com.vicentemorales.clases.Algoritmos;

public class Aplicacion {

	public static void main(String[] args){
        
		boolean resultado = Algoritmos.esPar(2);
            System.out.println(resultado);
        
        boolean resultado1 = Algoritmos.esPrimo(2);
        	System.out.println(resultado1); 	
        
        Algoritmos.stringEnReversa("rober");
    
        Algoritmos.esPalindromo("ana");
        
        
        Algoritmos.secuenciaFizzbuz (15);
    }
}
