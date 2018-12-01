package Cal;
import java.util.*;
public class Codigod {
	private static Scanner sc;
	public static void main(String[] args) {
		sc = new Scanner(System.in);
		double numero = 0;
		double [][][]Promedios = new double [10][100][25];
		System.out.print("El límite de cursos es de 10."
				+"\n"+"El límite de estudiantes es de 100."
				+"\n"+"El límite de notas es de 25."
				+"\n");
		String num = new String ("");
		int c1 = 0;
		int c2 = 0;
		int c3 = 0;
		int [] aux1 = new int [25];
		int [] aux2 = new int [100];
		int aux3 = 1;
		for(c1 = 0; c1 < 10; c1++) {
			for(c2 = 0; c2 < 100; c2++){
				for(c3 = 0; c3 < 25; c3++){
					System.out.print("Ingrese la cantidad de notas de los estudiantes."
					+"\n"+"Una vez acabe de ingresar notas, escriba [END]"
					+ " y presione [ENTER]"+"\n"+"Lleva "+aux1[c2]+" de 25"
					+ " notas ingresados."+"\n");
					num = sc.next();
					num = num.toUpperCase();
					if(num.equals("END")) {
						break;
					}
					else {
						numero = Prom.Delta(num);
						if (numero == 0) {
							System.out.println("Nota no válida");
							c3 -= 1;
						}
						else {
							Promedios[c1][c2][c3] = numero;
							aux1[c2] += 1;
						}
					}
				}
				System.out.println("Si acabó de ingresar estudiantes, escriba [END]"
				+ " y presione [ENTER]"+"\n"+"Si no ha acabado, ingrese cualquier"
				+ " caracter y presione [ENTER]"+"\n"+"Lleva "+(aux2[aux3]+1)+" de 100"
				+ " estudiantes."+"\n");
				num = sc.next();
				num = num.toUpperCase();
				if(num.equals("END")) {
					break;
				}
				else {
					aux2[aux3] += 1;
				}
			}
			System.out.println("Una vez acabe de ingresar el curso, escriba [END]"
					+ " y presione [ENTER]"+"\n"+"Si no ha acabado, ingrese cualquier"
					+ " caracter y presione [ENTER]"+"\n"+"Lleva "+aux3+" de 10"
					+ " cursos."+"\n");
			num = sc.next();
			num = num.toUpperCase();
			if(num.equals("END")) {
				break;
			}
			else {
				aux3++;
			}
		}
		for(c1 = 0; c1 < aux3; c1++){
			for(c2 = 0; c2 < aux2[aux3]; c2++){
				for(c3 = 0; c3 < aux1[c2]; c3++){
					System.out.println(Promedios[c1][c2][c3]);
				}
			}
		}
	}
}