import java.util.Scanner;
public class Exercicio5 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		final int TAM = 15;
		int[] a = new int[TAM];
		int[] b = new int[TAM];
		int r, n, i;
		
		//leitura do vetor A

		System.out.println("Insira os números: ");
		for(i=0; i<TAM; i++) {
			a[i]=in.nextInt();
		}
		
		for(i=0; i<TAM; i++) {
			r=1;
			for(n=a[i];n>0;n--) {
				r=r*n;
			}
			b[i]=r;
		}
		
		//apresentação do vetor B

		System.out.println("Valores de B:");
		System.out.print("[ ");
		for(i=0; i<TAM; i++) {
			System.out.print(b[i]+", ");
		}
		System.out.print("]");

		in.close();

	}

}
