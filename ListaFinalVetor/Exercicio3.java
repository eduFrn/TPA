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
			
			//informa se o n�mero inserido � primo ou n�o
			if(resto>2) {
				System.out.println(a[i]+" n�o � um n�mero primo");
			}
			else {
				System.out.println(a[i]+" � um n�mero primo");
			}
			resto=0;
		}
		
		in.close();
	}
}


