import java.util.Scanner;
public class GastoMedio {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		
		double km, litro, kmLitro;
		
		System.out.println("Insira a distância em km: ");
		km=in.nextDouble();
		System.out.println("Insira a capacidade do tanque: ");
		litro=in.nextDouble();
		kmLitro=km/litro;
		if(kmLitro>=10) {
			System.out.println("Econômico");
		}else {
			System.out.println("Não econômico");
		}
		in.close();
	}

}





