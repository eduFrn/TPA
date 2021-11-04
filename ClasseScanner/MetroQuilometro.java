import java.util.Scanner;
public class MetroQuilometro {
	
	public static void main(String args[]) {
		Scanner leia = new Scanner(System.in);
		double m, km;
		
		System.out.println("Insira o valor em metros: ");
		m = leia.nextDouble();
		
		km=m/1000;
		
		System.out.println("O valor de "+m+" m em quilômetros é: "+km+" km.");
		leia.close();
	}

}



