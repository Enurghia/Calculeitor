package Cal;
import java.util.*;
public class Codigod2 {
	private static Scanner sc;
	public static void main(String[] args) {
		sc = new Scanner(System.in);
		int A = sc.nextInt();
		double [] prueba = new double [A];
		for(int i = 0; i < A; i++) {
			prueba[i] = (int)(Math.random()*28);
		}
		Ord C = new Ord();
		C.MinMaxIntChar(prueba);
		for(int i = 0; i < A; i++) {
			System.out.println(prueba[i]);
		}
	}
}