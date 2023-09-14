import java.util.Scanner;
public class potencia {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i=0, x, exp ;
		long n=1;
		
		System.out.println("Digite o numero");
		x = sc.nextInt();
		System.out.println("Digite o expoente");
		exp = sc.nextInt();
		while(i< exp) {
			 n *= x;
             i++;
		}
		 System.out.println("A potência de " + x + " é " + n);
		sc.close();
	}
}

