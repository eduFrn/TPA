import java.util.Scanner;
public class VetorInvertido {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		final int TAM=10; //constante com valor 10
		
		int i, a[], b[];
		
		a = new int[TAM];
		b = new int[TAM];
		
		//leitura do vetor A
		for(i=0;i<TAM;i++) {
			System.out.println("Entre com o "+(i+1)+"o valor:");
			a[i] = in.nextInt();
			b[(TAM-1)-i] = a[i];
		}
		
		//apresenta��o do vetor B
		System.out.println("Apresenta��o do Vetor B:");
		System.out.print("b[] = {");
		for(i=0; i<TAM; i++) {
			System.out.print(b[i]+", ");
		}
		System.out.print("};");
		
		in.close();

		
	}

}
