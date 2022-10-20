import java.util.Scanner;

public class Ejercicio2 {
	
	public static Scanner keyboard = new Scanner (System.in);
	
    public static void main(String[] args) {
    	
    	int dolar = 4600;
    	int conversor = 0;
    	int resultado = 0;
    	
    	System.out.println ("Ingrese los dolares que desea cambiar");
    	conversor = keyboard.nextInt ();
    	
    	resultado = conversor*dolar;
    	
    	
    	System.out.println ("La conversion es = " + resultado);
    
    }
}

