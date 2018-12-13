package  Cal;
import java.util.*;
import java.awt.Color;
public class Calculadora {
	private static Scanner sc;
	public static void main(String[] args) {
		sc = new Scanner(System.in);
		String option = new String();
		boolean Aux = true;
		System.out.print("Bienvenido a la Calculeitor del futureichon!"+"\n");
		while(Aux == true){
			System.out.print("Ingrese la función que desea."+"\n"+
			"	1) Calculadora matemática."+"\n"+
			"	2) Calculadora de programador."+"\n"+"	3) Promedios."+"\n"+
			"	4) Ordenamiento de datos."+"\n"+"Ingrese [0] y pulse [ENTER] para"+
			" salir del programa."+"\n");
			option = sc.nextLine();
			switch(option){
			case "1": Cal_Class.cal_Aritm();break;
			case "2": Cal_Class.cal_Bin();break;
			case "3": Cal_Class.cal_Prom();break;
			case "4": Cal_Class.cal_Ord();break;
			case "0": System.out.println(". . . CERRANDO . . ."); System.exit(0);break;
			default: System.out.println("Dato inválido, inténtelo otra vez.");break;
			}
		}
	}
}