import java.util.Scanner;
public class AprovadoReprovado {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		
		double nota1, nota2, media, notaExame, novaMedia;
		
		System.out.println("Insira a primeira nota:");
		nota1=in.nextDouble();
		System.out.println("Insira a segunda nota:");
		nota2=in.nextDouble();
		media=(nota1+nota2)/2;
		if(media<3) {
			System.out.println("REPROVADO");
		}else if(media>=6) {
			System.out.println("APROVADO");
		}else {
			System.out.println("Aluno em EXAME. insira a nota de exame: ");
			notaExame=in.nextDouble();
			novaMedia=(media+notaExame)/2;
			if(novaMedia>=6) {
				System.out.println("APROVADO");
			}
			else {
				System.out.println("REPROVADO");

			}
		}
		in.close();
	}

}
