import java.util.Scanner;
public class Ejercicio12 {
	System.out.print("Ingrese 10 números: ");	
	int[] num = new int [10];
		for(int i = 0; i < 10; i++)
		{
			num[i] = Leer.nextInt();
		}
		System.out.println("Números al reves: " );
	int j = 9;
	while(j >= 0) {
		System.out.println(num[j]);
	j--;
	}
	}
}
