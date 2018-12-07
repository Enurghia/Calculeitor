package Cal;
import java.util.Scanner;

public class Cal_Class {
	public static void cal_Aritm (){
		Scanner sc = new Scanner(System.in);
		double A = 0;
		double B = 0;
		String option = new String ();
		boolean Aux = true;
		System.out.print("Calculadora aritmética. . . "+"\n");
		while (Aux == true) {
			System.out.print("Ingrese la operación."+"\n"+"	+) Adición."+"\n"
					+ "	-) Sustracción."+"\n"+	"	*) Multiplicación."+"\n"
					+"	/) División."+"\n"+ "	%) Resto de división."+"\n"
					+"	^) Potencias."+"\n"
					+"Ingrese [0] y pulse [ENTER] para"
					+ " retroceder."+"\n");
			option = sc.next();
			switch(option){
				case "+":
					System.out.print("Ingrese un valor para someterlo a operación."+"\n");
					A = sc.nextDouble();
					System.out.println("Ingrese otro valor para continuar la operación.");
					B = sc.nextDouble();
					String X = new String (""+(A+B));
					X = String.format("%.10g%n", (A+B));
					System.out.println(A+" + "+B+" = "+X+"\n");
					break;
				case "-":
					System.out.print("Ingrese un valor para someterlo a operación."+"\n");
					A = sc.nextDouble();
					System.out.println("Ingrese otro valor para continuar la operación.");
					B = sc.nextDouble();
					String Y = new String (""+(A-B));
					X = String.format("%.10g%n", (A-B));
					System.out.println(A+" - "+B+" = "+Y+"\n");
					break;
				case "*":
					System.out.print("Ingrese un valor para someterlo a operación."+"\n");
					A = sc.nextDouble();
					System.out.println("Ingrese otro valor para continuar la operación.");
					B = sc.nextDouble();
					System.out.println(A+" * "+B+" = "+(Opera.multiply(A, B))+"\n");
					break;
				case "/":
					System.out.print("Ingrese un valor para someterlo a operación."+"\n");
					A = sc.nextDouble();
					System.out.println("Ingrese otro valor para continuar la operación.");
					B = sc.nextDouble();
					if (B==0){
						System.out.println("\nError.\nNo se puede dividir por 0.\n");
					}
					else {
					System.out.println(A+" / "+B+" = "+(Opera.division(A, B))+"\n");
					}
					break;
				case "%":
					System.out.print("Ingrese un valor para someterlo a operación."+"\n");
					A = sc.nextDouble();
					System.out.println("Ingrese otro valor para continuar la operación.");
					B = sc.nextDouble();
					System.out.println(A+" % "+B+" = "+(Opera.divMod(A, B))+"\n");
					break;
				case "^":
					System.out.print("Ingrese un valor para someterlo a operación."+"\n");
					A = sc.nextDouble();
					System.out.println("Ingrese otro valor para continuar la operación.");
					B = sc.nextDouble();
					System.out.println(A+" ^ "+B+" = "+(Opera.power(A, B))+"\n");
					break;
				case "0": System.out.println(". . . Atras . . ."+"\n"); Aux = false;break;
				default: System.out.println("Dato inválido, inténtelo otra vez."+"\n");break;
			}
		}
	}
	public static void cal_Bin () {
		Scanner sc = new Scanner(System.in);
		int A1 = 0;
		int B1 = 0;
		String A2 = new String ("");
		String B2 = new String ("");
		String option = new String ();
		boolean Aux = true;
		System.out.print("Calculadora de programador. . . "+"\n");
		while (Aux == true) {
			System.out.print("Ingrese la operación."+"\n"+"	BIN) Suma de binarios."+"\n"
					+ "	HEX) Suma de hexadecimales."+"\n"+	"	CBS) Cambiar de base."+"\n"+
					"	DAB) Decimal a otras bases."+"\n"
					+"Ingrese [0] y pulse [ENTER] para"
					+ " retroceder."+"\n");
			option = sc.next();
			switch(option.toUpperCase()){
				case "BIN": System.out.print("¿Desea sumar números decimales o binarios?"
											+"\n"+"	DEC) Decimales."
											+"\n"+"	BIN) Binarios."
											+"\n");
					option = sc.next();
					switch(option.toUpperCase()) {
						case "DEC":
							System.out.print("Ingrese un valor para someterlo a operación."+"\n");
							A1 = sc.nextInt();
							System.out.println("Ingrese otro valor para continuar la operación.");
							B1 = sc.nextInt();
							System.out.print("En Binario es: "+Bin.CambioBase(A1, 2)+" + "
							+Bin.CambioBase(B1, 2)+" = "+Bin.Suma_BinDec(A1, B1)
							+"\n"+"En Decimal es: "+A1+" + "+B1+" = "
							+(A1+B1)+"\n\n");
							break;
						case "BIN":
							System.out.print("Ingrese un valor para someterlo a operación."+"\n");
							A2 = sc.next();
							System.out.println("Ingrese otro valor para continuar la operación.");
							B2 = sc.next();
							System.out.print("En Binario es: "+A2+" + "+B2+" = "
							+Bin.CambioBase((Bin.BinADecimal(A2)+Bin.BinADecimal(B2)),2)
							+"\n"+"En Decimal es: "+Bin.BinADecimal(A2)+" + "+Bin.BinADecimal(B2)
							+" = "+((Bin.BinADecimal(A2)+Bin.BinADecimal(B2)))
							+"\n\n");
							break;
						default:
							System.out.println("Dato inválido,intentelo otra vez."+"\n");
							break;
					}
					break;
				case "HEX":
					System.out.print("¿Desea sumar números decimales o binarios?"
							+"\n"+"	DEC) Decimales."
							+"\n"+"	HEX) Binarios."
							+"\n");
					option = sc.next();
					switch(option.toUpperCase()) {
					case "DEC":
						System.out.print("Ingrese un valor para someterlo a operación."+"\n");
						A1 = sc.nextInt();
						System.out.println("Ingrese otro valor para continuar la operación.");
						B1 = sc.nextInt();
						System.out.print("En Hexadecimal es: "+Bin.CambioBase(A1, 16)+" + "
						+Bin.CambioBase(B1, 16)+" = "+Bin.Suma_HexDec(A1, B1)
						+"\n"+"En Decimal es: "+A1+" + "+B1+" = "
						+(A1+B1)+"\n\n");
						break;
					case "HEX":
						System.out.print("Ingrese un valor para someterlo a operación."+"\n");
						A2 = sc.next();
						System.out.println("Ingrese otro valor para continuar la operación.");
						B2 = sc.next();
						System.out.print("En Hexadecimal es: "+A2+" + "+B2+" = "
						+Bin.CambioBase((Bin.HexADecimal(A2)+Bin.HexADecimal(B2)),16)
						+"\n"+"En Decimal es: "+Bin.HexADecimal(A2)+" + "+Bin.HexADecimal(B2)+" = "
						+((Bin.HexADecimal(A2)+Bin.HexADecimal(B2)))
						+"\n\n");
						break;
					default:
						System.out.println("Dato inválido,intentelo otra vez."+"\n");
						break;
						}
					break;
				case "CBS":
					System.out.print("Ingrese el valor el cual desea transformar."+"\n");
					A2 = sc.next();
					System.out.print("Ingrese la base del valor (el rango permitido es de 2 a 16)."+"\n");
					A1 = sc.nextInt();
					System.out.println("Ingrese la base a la cual se quiere cambiar (el rango permitido es de 2 a 16).");
					B1 = sc.nextInt();
					System.out.println("("+A2.toUpperCase()	+")"+A1+" a ()"+B1+" es ("+(Bin.CambioBase(Bin.BaseADecimal(A2, A1), B1))+")"+B1+"\n");
					break;
				case "DAB":
					System.out.print("Ingrese la base a la que se desea cambiar."+"\n"
							+"	BIN) Binario."+"\n"+"	HEX) Hexadecimal."+"\n");
					A2 = sc.next();
					switch (A2.toUpperCase()){
					case "BIN":
						System.out.print("Ingrese la base del valor a transformar."+"\n");
						A1 = sc.nextInt();
						System.out.println("("+A1+")"+"10"+" a "
						+"()2"+" es ("+Bin.DecimalABin(A1)+")");
						break;
					case "HEX":
						System.out.print("Ingrese la base del valor a transformar."+"\n");
						A1 = sc.nextInt();
						System.out.println("("+A1+")"+"10"+" a "
						+"()16"+" es ("+Bin.DecimalAHex(A1)+")");
						break;
					default: System.out.println("Base no válida."+"\n");break;
					}
					break;
				case "0": System.out.println(". . . Atras . . ."+"\n"); Aux = false;break;
				default: System.out.println("Dato inválido, inténtelo otra vez."+"\n");break;
			}
		}
	}
	public static void cal_Prom () {
		Scanner sc = new Scanner(System.in);
	}
	public static void cal_Ord () {
		Scanner sc = new Scanner(System.in);
		String option = new String ();
		String A = new String("");
		int i;
		double [] B = new double [255];
		int j;
		Ord C = new Ord();
		boolean Aux = true;
		System.out.print("Ordenamiento de datos. . . "+"\n");
		while (Aux == true) {
			j = 0;
			System.out.print("Ingrese la operación."+"\n"
					+"	1) Ordenamiento de números ingresados."+"\n"
					+"	2) Ordenamiento de letras ingresadas."+"\n"
					+"	3) Ordenamiento de números aleatorios."+"\n"
					+"	4) Ordenamiento de letras aleatorias."+"\n"
					+"Ingrese [0] y pulse [ENTER] para"
					+ " retroceder."+"\n");
			option = sc.next();
			switch(option){
				case "1":
					System.out.print("Desea ordenar de manera ascendente"
								+ " o desendente?"+"\n"
								+ "	1) Ascendente."+"\n"
								+ "	2) Desendente."+"\n");
					option = sc.next();
					switch(option){
					case "1":
						for(i = 0; i < B.length; i++) {
							System.out.print("Ingrese valores para ordenar."+"\n"
								+"Llevas "+i+" de "+B.length+" valores ingresados."
								+"Si termina de ingresar valores, escriba"
								+ " [END] y pulse [ENTER]"+"\n");
							A = sc.next();
							A = A.toUpperCase();
							if(A.equals("END")) {
								break;
							}
							else {
								B[i] = Prom.Delta(A);
								j++;
							}
						}
						C.MinMax(B);
						for(i = 0; i < j; i++) {
							System.out.println(B[i]);
						}
						System.out.println("\n");
						break;
					case "2":
						for(i = 0; i < B.length; i++) {
							System.out.print("Ingrese valores para ordenar."+"\n"
							+"Llevas "+i+" de "+B.length+" valores ingresados."
							+"Si termina de ingresar valores, escriba"
							+ " [END] y pulse [ENTER]"+"\n");
							A = sc.next();
							A = A.toUpperCase();
							if(A.equals("END")) {
								break;
							}
							else {
								B[i] = Prom.Delta(A);
								j++;
							}
						}
						C.MaxMin(B);
						for(i = 0; i < j; i++) {
							System.out.println(B[i]);
						}
						System.out.println("\n");
						break;
					default:System.out.println("Dato inválido, inténtelo otra vez."+"\n"); break;
					}
					break;
				case "2":
					System.out.print("Desea ordenar de manera ascendente"
								+ " o desendente?"+"\n"
								+ "	1) Ascendente."+"\n"
								+ "	2) Desendente."+"\n");
					option = sc.next();
					switch(option){
					case "1":
						System.out.print("Ingrese una palabra o una frase."
						+" sin utilizar [ESPACIO]"+"\n"
						+"Todos los símbolos y caracteres que no sean letras serán"
						+" remplazados por [*]"+"\n"
						+"Pulse [ENTER] si ha acabado de ingresar la palabra o frase."
						+"\n");
						A = sc.next();
						A = A.toUpperCase();
						j++;
						C.MinMaxChar(A);
						break;
					case "2":
						System.out.print("Ingrese una palabra o una frase."
						+" sin utilizar [ESPACIO]"+"\n"
						+"Todos los símbolos y caracteres que no sean letras serán"
						+" remplazados por [*]"+"\n"
						+"Pulse [ENTER] si ha acabado de ingresar la palabra o frase."
						+"\n");
						A = sc.next();
						A = A.toUpperCase();
						j++;
						C.MaxMinChar(A);
						break;
					default:System.out.println("Dato inválido, inténtelo otra vez."+"\n"); break;
					}
					break;
				case "3":
					System.out.print("Desea ordenar de manera ascendente"
								+ " o desendente?"+"\n"
								+ "	1) Ascendente."+"\n"
								+ "	2) Desendente."+"\n");
					option = sc.next();
					switch(option){
					case "1":
						System.out.print("Ingrese la cantidad de valores a ordenar (Entre 0 y 255)"
							+" y pulse [ENTER]"+"\n"
							+"Los números estarán en intervalos entre 0 y 1023"+"\n");
						j = sc.nextInt();
						if((j < 0)||(j > 255)){
							j = 0;
						}
						for(i = 0; i < j; i++) {
							B[i] = Opera.multiply(Math.random(), 1024);
						}
						C.MinMax(B);
						for(i = 0; i < j; i++) {
							System.out.println(B[i]);
						}
						System.out.println("\n");
						break;
					case "2":
						System.out.print("Ingrese la cantidad de valores a ordenar"
							+" y pulse [ENTER]"+"\n"
							+"Los números estarán en intervalos entre 0 y 1023"+"\n");
						j = sc.nextInt();
						if((j < 0)||(j > 255)){
							j = 0;
						}
						for(i = 0; i < j; i++) {
							B[i] = Opera.multiply(Math.random(), 1024);
						}
						C.MaxMin(B);
						for(i = 0; i < j; i++) {
							System.out.println(B[i]);
						}
						System.out.println("\n");
						break;
					default:System.out.println("Dato inválido, inténtelo otra vez."+"\n"); break;
					}
					break;
				case "4":
					System.out.print("Desea ordenar de manera ascendente"
								+ " o desendente?"+"\n"
								+ "	1) Ascendente."+"\n"
								+ "	2) Desendente."+"\n");
					option = sc.next();
					switch(option){
					case "1":
						System.out.print("Ingrese la cantidad de letras a ordenar"
							+" y pulse [ENTER]"+"\n"
							+"Las letras se ordenarán de [*] a [Z]"+"\n");
						j = sc.nextInt();
						if((j < 0)||(j > 255)){
							j = 0;
						}
						for(i = 0; i < j; i++) {
							B[i] = Opera.multiply(Math.random(), 28);
						}
						C.MinMaxIntChar(B);
						break;
					case "2":
						System.out.print("Ingrese la cantidad de letras a ordenar"
							+" y pulse [ENTER]"+"\n"
							+"Las letras se ordenarán de [*] a [Z]"+"\n");
						j = sc.nextInt();
						if((j < 0)||(j > 255)){
							j = 0;
						}
						for(i = 0; i < j; i++) {
							B[i] = Opera.multiply(Math.random(), 28);
						}
						C.MaxMinIntChar(B);
						break;
					default:System.out.println("Dato inválido, inténtelo otra vez."+"\n"); break;
					}
					break;
				case "0": System.out.println(". . . Atras . . ."+"\n");
					Aux = false;
					break;
				default: System.out.println("Dato inválido, inténtelo otra vez."+"\n");break;
			}
		}
	}
}