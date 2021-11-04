import java.util.Scanner;
public class MenorMaior {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int A, B, C;
		System.out.println("Insira o primeiro valor: ");
		A=in.nextInt();
		System.out.println("Insira o segundo valor: ");
		B=in.nextInt();
		System.out.println("Insira o terceiro valor: ");
		C=in.nextInt();
		if(A<=B && B<=C) {
			System.out.println(A+" "+B+" "+C);
		}else if(A<=C && C<=B) {
			System.out.println(A+" "+C+" "+B);
		}else if(B<=A && A<=C) {
			System.out.println(B+" "+A+" "+C);
		}else if(B<=C && C<=A) {
			System.out.println(B+" "+C+" "+A);
		}else if(C<=A && A<=B) {
			System.out.println(C+" "+A+" "+B);
		}else {
			System.out.println(C+" "+B+" "+A);
		}
		in.close();
	}

}




