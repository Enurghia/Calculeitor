package Cal;
import java.util.Scanner;

public class CAL_Class {
	public static void cal_Aritm (){
		Scanner sc = new Scanner(System.in);
		double A = 0;
		double B = 0;
		String option = new String ();
		boolean Aux = true;
		while(Aux == true){
		System.out.print("Calculadora aritmética. . . "+"\n"+
					"Ingrese un valor para someterlo a operación."+"\n");
		A = sc.nextDouble();
		System.out.print("Ingrese la operación."+"\n"+"	+) Sumar."+"\n"
		+ "	-) Restar."+"\n"+	"	*) Multiplicar"+"\n"+"	/) Dividir"+"\n"
		+ "	^) Potencia."+"\n"+"Ingrese [0] y pulse [ENTER] para"
		+ " retroceder."+"\n");
		option = sc.next();
		switch(option){
		case "+": System.out.println("Ingrese otro valor para terminar la operación");
			B = sc.nextDouble();
			System.out.println(A+" + "+B+" = "+(A+B));
			break;
		case "-": System.out.println("Ingrese otro valor para terminar la operación");
			B = sc.nextDouble();
			System.out.println(A+" - "+B+" = "+(A-B));
			break;
		case "*": System.out.println("Ingrese otro valor para terminar la operación");
			B = sc.nextDouble();
			System.out.println(A+" * "+B+" = "+(Opera.multiply(A, B)));
			break;
		case "/": System.out.println("Ingrese otro valor para terminar la operación");
			B = sc.nextDouble();
			System.out.println(A+" / "+B+" = "+(Opera.division(A, B)));
			break;
		case "^": System.out.println("Ingrese otro valor para terminar la operación");
			B = sc.nextDouble();
			System.out.println(A+" ^ "+B+" = "+(Opera.power(A, B)));
			break;
		case "0": System.out.println(". . . Atras . . ."); Aux = false;break;
		default: System.out.println("Dato inválido, inténtelo otra vez.");break;
		}
		}
	}
}
