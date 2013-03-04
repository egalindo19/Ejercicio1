import java.util.Scanner;
import java.util.Date; 
import java.text.SimpleDateFormat; 

public class NumerosPrimos{

	public static void main(String []args){
		//Definicion de formato de tiempo
		Date now = new Date(); 
		SimpleDateFormat format = new SimpleDateFormat("HH:mm:ss:SSS"); 
		//Variables
		Scanner teclado = new Scanner(System.in);
		int num;
		int cont=1;
		int primo=2;
		int div=2;
		//Inicio
		System.out.print("Captura numero:");
		num = teclado.nextInt();
		//Imprime tiempo inicial
		now = new Date(); 
		System.out.println(" 	Hora Inicial: " + format.format(now)); 
		
		while(cont<=num){
			if(primo % div == 0){
				if(primo == div){
					//Aqui se imprime el numero primo uno por uno...
					//System.out.print(primo+", ");
					cont++;
				}
				div=2;
			primo++;
			}else{
				div++;
				}
		}
		System.out.println(" 	No. primo:"+primo);
		//Imprime tiempo final
		now = new Date(); 
		System.out.println(" 	Hora   Final: " + format.format(now));
	}
}