import java.util.Scanner;
public class Exercicio9 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		final int TAM = 10;
		int a[] = new int[TAM];
		int i, n=0;
		
		System.out.println("Insira o n�mero:");
		for(i=0;i<TAM;i++) {
			a[i]=in.nextInt();
		}

		for(i=0;i<TAM;i++) {
			
			if(a[i]==a[(TAM-1)-i]) {
				n++;
			}
			
		}

		//diz se o n�mero � palindromo ou n�o
		if(n==TAM) {
			System.out.println("N�mero pal�ndromo");
		}
		else {
			System.out.println("N�o � um n�mero pal�ndromo.");
		}
		
		in.close();
	}
}