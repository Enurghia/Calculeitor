package Cal;

import java.util.Scanner;

public class Prom {
	private static Scanner sc;
	public static void Promedios () {
		sc = new Scanner(System.in);
		boolean aux = true;
		String num = new String ("");
		while (aux == true) {
			System.out.print("¿Se tiene una cantidad fija de estudiantes?"
					+"\n"+"	1) Si."+"\n"+"	2) No."+"\n"+"	3) Atras.");
			num = sc.next();
			switch (num) {
			case "1": Prom_True(); break;
			case "2": Prom_False(); break;
			case "3": System.out.println(". . .Atras. . ."); aux = false; break;
			default: System.out.println("Opción no válida."); break;
			}
		}
	}
	private static void Prom_True () {
		sc = new Scanner(System.in);
		boolean aux = true;
		System.out.println("Ingrese la cantidad de estudiantes.");
		int est = sc.nextInt();
		double [] cantidades = new double [est];
	}
	private static void Prom_False () {
		sc = new Scanner(System.in);
		boolean aux = true;
		String num = new String ("");
		System.out.print("Ingrese la cantidad de notas de los estudiantes."+
		"\n"+"Una vez acabe de ingresar notas, escriba [END] y presione [ENTER]."
		+"\n");
		while(aux == true){
			num = sc.next();
			num = num.toUpperCase();
			if (num.equals("END")) {
				aux = false;
			}
		}
	}
	private static void Prom_Know () {
		
	}
	private static void Prom_Unknow () {
		
	}
}