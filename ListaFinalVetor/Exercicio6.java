import java.util.Scanner;
public class Exercicio6 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		final int TAM=10;
		
		int a[], b[], c[], i, j, k=0;
		boolean encontrado;
		
		a = new int[TAM];
		b = new int[TAM];
		c = new int[TAM];
		

		//leitura do vetor A
		System.out.println("Vetor A:");
		for(i=0;i<TAM;i++) {
			a[i]=in.nextInt();
		}
		
		//leitura do vetor B
		System.out.println("Vetor B:");
		for(i=0;i<TAM;i++) {
			b[i]=in.nextInt();
		}
		
		for(i=0;i<TAM;i++) {
			
			encontrado=false;
			
			for(j=0;j<TAM;j++) {
				if(a[i]==b[j]) {
					encontrado=true;
				}
			}
			if(encontrado==true) {
				c[k]=a[i];
				k++;
			}
			
		}
		
		//apresentação do vetor C
		System.out.println("Vetor C:");
		System.out.print("C = [ ");
		for(i=0;i<TAM;i++) {
			System.out.print(c[i]+", ");
		}
		System.out.print("]");

		in.close();
	}

}
