import java.util.Scanner;

public class NumerosRomanos{
	
	public static void main (String []args){
	
		Scanner teclado = new Scanner(System.in);
		String numRom;
		int sumador=0;
		int length;
		int[] arreglo;
		
		System.out.println("Ingresar numero romano con MAYUSCULAS:");
		numRom = teclado.nextLine();
		length = numRom.length();
		arreglo = new int[length +1];
		
		for(int i=0; i < length; i++){
			char letra;
			letra = numRom.charAt(i);
			
			if(letra == 'I'){
				arreglo[i] = 1;
			}
			if(letra == 'V'){
				arreglo[i] = 5;
			}
			if(letra == 'X'){
				arreglo[i] = 10;
			}
			if(letra == 'L'){
				arreglo[i] = 50;
			}
			if(letra == 'C'){
				arreglo[i] = 100;
			}
			if(letra == 'D'){
				arreglo[i] = 500;
			}
			if(letra == 'M'){
				arreglo[i] = 1000;
			}
		}
		for(int i=0;i < length;i++){
			if(arreglo[i] < arreglo[i + 1]){
				sumador = sumador + (arreglo[i + 1] - arreglo[i]);
				i++;
			}else{
				sumador = sumador + arreglo[i];
			}
		}
		System.out.println("El numero arabigo es:"+sumador);
	}
	
}