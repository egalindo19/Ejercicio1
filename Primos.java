
class Primos{

public static void main(String [] args){

	int i;
	int j;
	boolean primo;
	
	for(i=2;i<=10001;i++){
		primo=true;
		for(j=2;j<i;j++){
			if(i % j ==0){
				primo=false;
			}
		}
		if(primo){
			System.out.print(i+"-");
		}
	}
}

}