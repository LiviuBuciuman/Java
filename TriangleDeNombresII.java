import java.util.Scanner;
public class TriangleDeNombresII {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int num;
		boolean fin = true;
		
		System.out.print("Introduzca un numero: ");
		num = scan.nextInt();
		
		while(fin) {
			if(num > 0) {
				for(int i = 1; i <= num; i++) {
					for(int j = i; j >= 1; j--) {
						if(j == 1) {
							System.out.print(j);
						}
						else {
							System.out.print(j + ", ");
						}
					}
					System.out.println();
				}
				fin = false;
			}
			else {
				System.out.print("Vuelva a introducir un numero: ");
				num = scan.nextInt();
			}
		}
		scan.close();
	}
}
