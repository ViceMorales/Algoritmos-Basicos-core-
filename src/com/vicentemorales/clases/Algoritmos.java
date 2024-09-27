package com.vicentemorales.clases;

public class Algoritmos {
	
	public static boolean esPar(int numPar){
		if (numPar % 2 == 0)
			return true;
		else
			return false;
	}
	
	public static boolean esPrimo(int numPrimo){
		
		if (numPrimo % 2 != 0 || numPrimo % 3 != 0 && numPrimo == 2 || numPrimo == 3)
			return true;
		else
			return false;
		
	}

	public static void stringEnReversa(String texto){
		String stringEnReversa = "";
		for (int i = texto.length() - 1; i >= 0; i --) {
			stringEnReversa += texto.charAt(i);}
			System.out.println("La palabra: " + texto + ", al reves sería: " + stringEnReversa );
		
	}
	

	public static boolean esPalindromo(String texto1){
		for (int i = 0; i < texto1.length() / 2; i++) {
	        if (texto1.charAt(i) != texto1.charAt(texto1.length() - 1 - i)) {
	        	System.out.println("La palabra " + texto1 + " es no es un palindromo");
	            return false;
	        }		
	    }System.out.println("La palabra " + texto1 + " es un palindromo");
	    return true;
	}
	
	
	public static void secuenciaFizzbuz(int xnum){
		for (int i = 1; i <= xnum; i++) {
			if (i % 3 == 0)
				 System.out.println("Fizz");
			if  (i % 5 == 0)
				System.out.println("Buzz");
			if  (i % 3 == 0 && i % 5 == 0)
				 System.out.println("Fizzbuzz");
			else
				 System.out.println(i);
		
		}
		
}}
	
		


