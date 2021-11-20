import java.util.Scanner;
public class Exercicio10 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		final int TAM = 10;
		int a[] = new int[TAM];
		int i, j, c;
		
		System.out.println("Insira os números:");
		for(i=0;i<TAM;i++) {
			a[i]=in.nextInt();
		}

		for(i=0;i<TAM;i++) {			
			for(j=0;j<TAM;j++){

				if(a[i]<=a[j]){
					c=a[i];
					a[i]=a[j];
					a[j]=c;
				}
			
			}			
		}
		
		System.out.println("Apresentação do vetor:");
		System.out.print("[ ");
		for(i=0;i<TAM;i++){

			System.out.print(a[i]+", ");

		}
		System.out.println("]");
	}
}
