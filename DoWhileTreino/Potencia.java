import java.util.Scanner;
public class Potencia {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int i=1, b, r, e;
		
		b=in.nextInt();
		r=b;
		e=in.nextInt();
		
		do {
			
			r=r*b;
			i++;
			
		}while(i<e);
		System.out.println(r);
		
		in.close();
	}
	
}




