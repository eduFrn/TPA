import java.util.Scanner;
public class VelhoNovo {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		
		int id, idVelho, idNovo;
		String nome, nomeVelho, nomeNovo;
		
		System.out.println("Insira o primeiro nome:");
		nome=in.next();
		System.out.println("Insira a primeira idade:");
		id=in.nextInt();
		idVelho=id;
		nomeVelho=nome;
		idNovo=id;
		nomeNovo=nome;
		System.out.println("Insira o segundo nome:");
		nome=in.next();
		System.out.println("Insira a segunda idade:");
		id=in.nextInt();
		if(id>idVelho) {
			idVelho=id;
			nomeVelho=nome;
		}else if(id<idNovo) {
			idNovo=id;
			nomeNovo=nome;
		}
		System.out.println("Insira o terceiro nome:");
		nome=in.next();
		System.out.println("Insira a terceira idade:");
		id=in.nextInt();
		if(id>idVelho) {
			idVelho=id;
			nomeVelho=nome;
		}else if(id<idNovo) {
			idNovo=id;
			nomeNovo=nome;
		}System.out.println("Insira o quarto nome:");
		nome=in.next();
		System.out.println("Insira a quarta idade:");
		id=in.nextInt();
		if(id>idVelho) {
			idVelho=id;
			nomeVelho=nome;
		}else if(id<idNovo) {
			idNovo=id;
			nomeNovo=nome;
		}System.out.println("Insira o quinto nome:");
		nome=in.next();
		System.out.println("Insira a quinta idade:");
		id=in.nextInt();
		if(id>idVelho) {
			idVelho=id;
			nomeVelho=nome;
		}else if(id<idNovo) {
			idNovo=id;
			nomeNovo=nome;
		}
		System.out.println("O mais novo é "+nomeNovo+" com "+idNovo+" anos.");
		System.out.println("O mais velho é "+nomeVelho+" com "+idVelho+" anos.");
		in.close();
	}
}
