import java.util.Scanner;
public class Exercicio8 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a[] ,n, i;
		
		final int TAM = 10;
		a = new int[TAM];
		
		System.out.println("Insira os n�meros:");
		for(i=0;i<TAM;i++) {
			a[i]=in.nextInt();
		}
		
		System.out.println("Insira o elemento X:");
		n=in.nextInt();
		
		//diz se o elemento foi encontrado e onde est�
		for(i=0;i<TAM;i++) {
			if(a[i]==n) {
				System.out.println("O elemento X de valor "+n+" est� em A na "+(i+1)+" posi��o.");
			}
		}

		in.close();
		
	}

}
