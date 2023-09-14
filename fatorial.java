import java.util.Scanner;
public class fatorial {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i=1, x ;
		long n=1;
		
		System.out.println("Digite o numero");
		x = sc.nextInt();
		while(i<=x) {
			 n *= i;
             i++;
		}
		 System.out.println("O fatorial de " + x + " é " + n);
		sc.close();
	}
}
