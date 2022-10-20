import java.util.Scanner;
public class Ejercicio6 {

	public static Scanner Keyboard = new Scanner (System.in);
	
    public static void main(String[] args) {

    	Scanner scanner = new Scanner (System.in);
    	
    	System.out.println ("Introduzca el numero de niveles que tendra la piramide");
    	
    	int NumeroNiveles = scanner.nextInt();
    	int NumeroPosiciones= NumeroNiveles * 2 - 1;
    	int PosDesendente = NumeroNiveles;
    	int PosAsendente = NumeroNiveles;
    	
    	for (int i = 0; i < NumeroNiveles; i++) {
    		int contador = 1;
    		String resultado = "";
    		
    		for (int i = 0; i <= NumeroPosiciones; i++) {
    			if ((i < PosDesendente) || (i > PosAsendente)) {
    				resultado += "";
    				
    			} else {
    				if (i < NumeroNiveles) {
    				resultado += contador;
    				contador++;
    				
        			} else {
        				resultado += contador;
        				contador --;

    			}
    		}
    	}
    	
    	System.out.println("resultado");
    	PosAsendente ++;
    	PosDesendente --;	
}
}
}