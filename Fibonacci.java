
public class Fibonacci{

public static void main(String[] args) { 
       
         
       int a=0,b=1,c,par; 
       System.out.print("Los numeros fibonaccis: "); 
       for(int i=0;i<=10;i++){ 
       c=a+b; 
       a=b; 
       b=c; 
       par=c%2; 
        
      
           
		if (par==0){
		System.out.println("numeros pares:"+c);
		}
		
        } 
	}
}
