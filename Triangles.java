import java.util.Scanner;
public class Triangles {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int num, n, i, j, k, m;
		
		System.out.print("Introduzca un numero: ");
		num = scan.nextInt();
		
		for(n = 0; n < num; n++) {
			for(i = 0; i <= 9; i++) {
				for(j = i; j < 9; j++) {
					System.out.print("·");
				}
				for(k = 9-i; k <= 9; k++) {
					System.out.print(k);
				}
				for(m = 8; m >= 9-i; m--) {
					System.out.print(m);
				}
				for(j = i; j < 9; j++) {
					System.out.print("·");
				}
				System.out.println();
			}
			System.out.println();
		}	
		scan.close();
	}
}
