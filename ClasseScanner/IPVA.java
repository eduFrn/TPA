import java.util.Scanner;
public class IPVA {

	public static void main(String args[]) {
		Scanner leia = new Scanner(System.in);
		double veiculo, ipva;
		
		System.out.println("Insira o pre�o do ve�culo: ");
		veiculo = leia.nextDouble();
		
		ipva = veiculo/100*4;
		
		System.out.println("O valor do IPVA �: R$"+ipva);
		leia.close();
	}

}



