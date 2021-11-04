import java.util.Scanner;
public class Idade {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		
		int nasc, atual, id;
		System.out.println("Insira o ano de nascimento:");
		nasc=in.nextInt();
		System.out.println("Insira o ano atual:");
		atual=in.nextInt();
		id=atual-nasc;
		System.out.println("A sua idade é: "+id);
		if(id<10) {
			System.out.println("Criança");
		}else if(id<18) {
			System.out.println("Adolescente");
		}else if(id<60) {
			System.out.println("Adulto");
		}else {
			System.out.println("Idoso");
		}
		in.close();
	}
}

