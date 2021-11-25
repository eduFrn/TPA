
public class MatrizDobro {
	public static void main(String[] args){
		int v[][]=new int[4][4];
		int i, j, r=1;

		//duplicando os valores da matriz
		for(i=0; i<4;i++) {
			for(j=0;j<4;j++) {
				v[i][j]=r*2;
				r=v[i][j];
			}
		}
		
		//apresentando a matriz gerada
		System.out.println("Valores da matriz:");
		for (i=0; i<4; i++) {
			for (j=0; j<4; j++) {
				System.out.print(v[i][j]+" ");
			}
			System.out.println();
		}
	}

}
