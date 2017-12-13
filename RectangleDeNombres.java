import java.util.Scanner;
public class RectangleDeNombres {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int num1, num2;
		boolean fin = true;
		
		System.out.print("Introduzca el primer numero: ");
		num1 = scan.nextInt();
		System.out.print("Introduzca el segundo numero: ");
		num2 = scan.nextInt();
		
		while(fin == true) {
			if (num1 > 0 && num2 > 0) {
				for(int i = 1; i <= num2; i++) {
					for(int j = 1; j <= num1; j++) {
						System.out.print(j + " ");
					}
					System.out.println();
				}
				fin = false;
			}
			else {
				System.out.print("Vuelve a introducir el primer numero: ");
				num1 = scan.nextInt();
				System.out.print("Vuelve a introducir el segundo numero: ");
				num2 = scan.nextInt();
			}
		}
		scan.close();
	}
}
