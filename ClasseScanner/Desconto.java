import java.util.Scanner;
public class Desconto {

	public static void main(String args[]) {
		Scanner leia = new Scanner(System.in);
		double prod, desc, novo;
		
		System.out.println("Digite o valor do produto: ");
		prod = leia.nextDouble();
		
		System.out.println("Digite o valor do desconto: ");
		desc = leia.nextDouble();
		
		novo = prod-prod/100*desc;
		
		System.out.println("O valor do produto com o desconto é: R$"+novo);
		leia.close();
	}

}




