import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int num, aux = 1;
		
		System.out.println("Introduzca un numero: ");
		num = scan.nextInt();
		
		System.out.print(num + "! = ");
		for (int i = 1; i <= num; i++) {
			aux *= i;
			if (i == num) {
				System.out.print(i + " = " + aux);
			}
			else {
				System.out.print(i + " x ");
			}
		}
		scan.close();
	}
}
