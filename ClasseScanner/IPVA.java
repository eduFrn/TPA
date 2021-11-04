import java.util.Scanner;
public class IPVA {

	public static void main(String args[]) {
		Scanner leia = new Scanner(System.in);
		double veiculo, ipva;
		
		System.out.println("Insira o preço do veículo: ");
		veiculo = leia.nextDouble();
		
		ipva = veiculo/100*4;
		
		System.out.println("O valor do IPVA é: R$"+ipva);
		leia.close();
	}

}



