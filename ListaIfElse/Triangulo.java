import java.util.Scanner;
public class Triangulo {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		
		double A, B, C;
		
		System.out.println("Insira o primeiro valor:");
		A=in.nextDouble();
		System.out.println("Insira o segundo valor:");
		B=in.nextDouble();
		System.out.println("Insira o terceiro valor:");
		C=in.nextDouble();
		if(A>B+C || B>A+C || C>A+B) {
			System.out.println("N�o � um tri�ngulo.");
			
		}else {
			if(A==B && B==C) {
				System.out.print("Tri�ngulo Equil�tero.");
			}else if(A!=B && B!=C && A!=C) {
				System.out.println("Tri�ngulo Escaleno");
			}else {
				System.out.print("Tri�ngulo Is�celes.");
			}
		}
		in.close();
	}

}



