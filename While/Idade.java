import java.util.Scanner;
public class Idade {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int i=1, maior=0, menor=0, id;
		
		while(i<=10) {
			System.out.println("Insira a idade:");
			id=in.nextInt();
			if(id<18) {
				menor++;
			}else {
				maior++;
			}
			i++;
		}
		System.out.println(maior+" pessoas são maiores de idade e "+menor+" pessoas são menores de idade.");
		in.close();
	}

}



