import java.util.Random;
public class MatrizMaiorMenor {

	public static void main(String[] args) {
		
		Random x = new Random();
		
		int v[][] = new int[3][3];
		int i, j, menor, maior;
		
		//insere os valores aleatórios no vetor v
		for(i=0;i<3;i++) {
			for(j=0;j<3;j++) {
				v[i][j]=x.nextInt()%30;
			}
		}
		
		menor=v[0][0];
		maior=v[0][0];
		
		//verifica se o número é maior ou menor
		for(i=0;i<3;i++) {
			for(j=0;j<3;j++) {
				if(v[i][j]>maior) {
					maior=v[i][j];
				}
				if(v[i][j]<menor) {
					menor=v[i][j];
				}
			}
		}
		
		//apresenta a matriz com todos os valores
		System.out.println("Valores da matriz:");
		for(i=0;i<3;i++) {
			for(j=0;j<3;j++) {
				System.out.print(v[i][j]+" ");
			}
			System.out.println();
		}
		
		//apresenta os valores menores e maiores
		System.out.println();
		System.out.println("Menor valor: "+menor);
		System.out.println("Maior valor: "+maior);
	}

}
