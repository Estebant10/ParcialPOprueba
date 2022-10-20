import java.util.Scanner;
public class Ejercicio11 {
	
	System.out.println ("Escriba una palabra: ");
	String caracteres = Leer.next().toUpperCase();
	char[] Carac = new char[caracteres.length()]; 
	if(caracteres.length() < 10) {
		System.out.println("Palabra desglosada en el arreglo: ");
	for(int i = 0; i < caracteres.length(); i++)
	{
		Carac[i] = caracteres.charAt(i);	
	}
	for(char c : Carac) {
		System.out.println(c);
	}
	}
	else
		System.out.println("Limite superado para el arreglo. ");

}
}
