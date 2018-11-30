package Cal;
import java.util.Scanner;
public class Prom {
	private static Scanner sc;
	public static void Promedios () {
		sc = new Scanner(System.in);
		boolean aux = true;
		String num = new String ("");
		while (aux == true) {
			System.out.print("¿Se tiene una cantidad fija de cursos,"
					+ " estudiantes y notas?"
					+"\n"+"	1) Si."+"\n"+"	2) No."+"\n"+"	3) Atras."+"\n");
			num = sc.next();
			switch (num) {
			case "1": Prom_True(); break;
			case "2": Prom_False(); break;
			case "3": System.out.println(". . . Atras . . ."); aux = false; break;
			default: System.out.println("Opción no válida."); break;
			}
		}
	}
	private static void Prom_True () {
		sc = new Scanner(System.in);
	}
	private static void Prom_False () {
		sc = new Scanner(System.in);
	}
	public static double Delta (String valor) {
		String arreglar = new String ("");
		for(int i = 0; i < valor.length(); i++) {
			switch (valor.substring(i, i+1)){
			case "0": arreglar += "0"; break;
			case "1": arreglar += "1"; break;
			case "2": arreglar += "2"; break;
			case "3": arreglar += "3"; break;
			case "4": arreglar += "4"; break;
			case "5": arreglar += "5"; break;
			case "6": arreglar += "6"; break;
			case "7": arreglar += "7"; break;
			case "8": arreglar += "8"; break;
			case "9": arreglar += "9"; break;
			case ",": arreglar += "."; break;
			case ".": arreglar += "."; break;
			default: break;
			}
		}
		double resultado = Double.valueOf(arreglar);
		return resultado;
	}
}