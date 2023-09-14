import java.util.Scanner;
public class fibonacci {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n, i=3;
		long t1=1,t2=1,pt;
		  System.out.println("Digite um valor para calcular a série de Fibonacci:");
	       n = sc.nextInt();
	       
	       while (i <= n) {
               pt = t1 + t2;
               System.out.println(pt);
               t1 = t2;
               t2 = pt;
               i++;
           }

           System.out.println();
       

       sc.close();
	       
	}
}
