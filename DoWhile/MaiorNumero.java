import java.util.Scanner;
public class MaiorNumero {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n, valor, menor, maior;
		
		System.out.println("Insira o n�mero de valores que deseja inserir:");
		n=in.nextInt();
		
		if(n>0) {
			System.out.println("Insira um n�mero:");
			valor=in.nextInt();
			maior=valor;
			n--;
			do {
				System.out.println("Insira um n�mero:");
				valor=in.nextInt();
				if(valor>maior) {
					maior=valor;
				}
				n--;
				if(n==0) {
					System.out.println("O maior n�mero �: "+maior);
					System.out.println("Insira o n�mero de valores que deseja inserir:");
					n=in.nextInt();
					if(n>0) {
						System.out.println("Insira um n�mero:");
						valor=in.nextInt();
						maior=valor;
						n--;
					}
				}
			}while(n>0);
		}
		in.close();
		
	}
}