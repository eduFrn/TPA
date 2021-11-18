import java.util.Scanner;
public class Exercicio4 {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		final int TAM = 10;
		
		int i, j, resto=0, a[];
		a = new int[TAM];
		
		//leitura do vetor A

		System.out.println("Insira os valores: ");
		for(i=0;i<TAM;i++) {
			a[i]=in.nextInt();
			for(j=1;j<=a[i];j++) {
			
				if(a[i]%j==0) {
					resto++;
				}
				
			}
			
			//informa se o número inserido é primo ou não
			if(resto>2) {
				System.out.println(a[i]+" não é um número primo");
			}
			else {
				System.out.println(a[i]+" é um número primo");
			}
			resto=0;
		}
		
		in.close();
	}
}


