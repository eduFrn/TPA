import java.util.Scanner;
public class Fatorial {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int i=1, n, r=1;
		
		System.out.println("Insira um número inteiro: ");
		n=in.nextInt();
		
		while(i<=n) {
			r=r*i;
			i++;
		}
		
		System.out.println("O fatorial do número "+n+" é: "+r);
		in.close();
	}

}





