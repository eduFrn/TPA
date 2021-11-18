
public class Exercicio4 {
	public static void main(String[] args) {

		int r, i, j;
		int[] a = new int[10];
		
		for(i=1;i<10;i++) {
			r=2;
			
			for(j=1;j<i;j++) {
				r=2*r;
			}
			a[i]=r;
		}

		//apresentação do vetor A
		System.out.println("Valores:");
			System.out.println("2 elevado a "+i+" = "+1);
		for(i=1;i<10;i++) {
			System.out.println("2 elevado a "+i+" = "+a[i]);
		}

	}

}
