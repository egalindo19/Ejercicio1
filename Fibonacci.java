
public class Fibonacci{
          
    int a=0,b=1,c,par,suma=0; 
	int []vec;  
	
    public void pares(){ 
		System.out.println("Los numeros fibonaccis: "); 
			for(int i=0;i<30;i++){ 
				c=a+b; 
				a=b; 
				b=c; 
				par=c%2; 
                suma=suma+c;
				
				if (par==0){
					System.out.println("Numeros pares:"+c);
					
					
				}
			}
	}	

	public void suma(){
		
        System.out.println("La suma de los elementos es:"+suma);
	
	}

	public static void main(String[] args) { 
		Fibonacci fb = new Fibonacci();
		fb.pares();
		fb.suma();
		
	}
}
