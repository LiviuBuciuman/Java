import java.util.Scanner;
public class TriangleDeNombres {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int num;
		boolean fin = true;
		
		System.out.print("Introduzca un numero: ");
		num = scan.nextInt();
		
		while(fin) {
			if(num > 0) {
				for(int i = 1; i <= num; i++) {
					for(int j = 1; j <= i; j++) {
						System.out.print("*");
					}
					System.out.println();
				}
				fin = false;
			}
			else {
				System.out.print("Vuelve a introducir un numero > 0: ");
				num = scan.nextInt();
			}
		}
		scan.close();
	}
}
