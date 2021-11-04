import java.util.Scanner;
public class Bissexto {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int aInicial, aFinal, anos=0;
		
		System.out.println("Entre com o ano inicial:");
		aInicial=in.nextInt();
		
		System.out.println("Entre com o ano final:");
		aFinal=in.nextInt();
		
		do {
			if(aInicial % 4 == 0) {
				anos++;
				System.out.println(aInicial+" é ano bissexto");
			}
			aInicial++;	
		}while(aInicial<=aFinal);
		System.out.println("Total de anos bissextos: "+anos);
		in.close();
	}
}