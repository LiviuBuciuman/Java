import java.util.Scanner;
public class Rombos {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int i, j, k, m;
		
		for (i = 0; i <= 9; i++){
			for (j = i; j < 9; j++){
				System.out.print(".");
			}
			for (k = 9-i; k <= 9; k++){
				System.out.print(k);
			}
			for (m = 8; m >= 9-i; m--){
				System.out.print(m);
			}
			for (j = i; j < 9; j++){
				System.out.print(".");
			}
			System.out.println();
		}
		for (i = 8; i >= 0; i--){
			for (j = i; j < 9; j++){
				System.out.print(".");
			}
			for (k = 9-i; k <= 9; k++){
				System.out.print(k);
			}
			for (m = 8; m >= 9-i; m--){
				System.out.print(m);
			}
			for (j = i; j < 9; j++){
				System.out.print(".");
			}
			System.out.println();
		}		
		scan.close();
	}
}
