import java.util.Scanner;
public class SomaLinha {
	public static void main(String[] args) {
		Scanner	in = new Scanner(System.in);

		int v[][]=new int [3][4];
		int i, j, r=0;
		
		//lê os valores inseridos pelo usuario
		for(i=0;i<3;i++ ) {
			System.out.println("\nInsira os 3 primeiros valores da "+(i+1)+"a linha.");
			for(j=0;j<3;j++) {
				v[i][j]=in.nextInt();
			}
		}

		//soma os valores da matriz
		for(i=0;i<3;i++ ) {
			for(j=0;j<4;j++) {
				r=v[i][j]+r;
				if(j==3) {
					v[i][3]=r;
				}
			}
		r=0;
		}

		//apresentação da matriz
		System.out.println("\nValores da Matriz");
		for(i=0;i<3;i++ ) {
			for(j=0;j<4;j++) {
				System.out.print(v[i][j]+" ");
			}
			System.out.println();
		}
		
	}

}
