package Cal;
import java.util.*;
public class Cal_Class {
	private static Scanner sc;
	public static void cal_Aritm (){
		sc = new Scanner(System.in);
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
		sc = new Scanner(System.in);
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
		System.out.print("Promedios. . . "+"\n");
		sc = new Scanner(System.in);
		String Estudiantes = new String ();
		int N_Curso = 0;
		int N_Estud = 0;
		int N_Notas = 0;
		String Dat = new String ();
		double acumulador = 0;
		double acumulador2 = 0;
		String A = new String();
		String B = new String();
		String C = new String();
		boolean aux = true;
		//Ciclo reiterativo hasta que se acaben de ingresar curso
		while (aux == true) {
			Dat += "Curso "+(N_Curso+1)+":"+"\n";
			N_Curso++;
			System.out.print("Ingrese la cantidad de cursos."
				+"\n"+"Si el número de cursos es indefinido, ingrese 0 para añadir gradualmente"
				+"\n"+"Tras ingresar la cantidad de cursos presione [ENTER]"
				+"\n");
			//Discriminar si es que se poseen los cursos.
			A = sc.next();
			//Cursos no definidos
			if((int)Prom.Delta(A) == 0) {
				while (aux == true) {
				while((int)Prom.Delta(A) == 0) {
					System.out.print("Ingrese el nombre el estudiante sin usar la tecla [ESPACIO]."
							+"\n"+"Tras ingresar el nombre, pulse [ENTER] para continuar."
							+"\n"+"Si ya acabó de ingresar estudiantes, pulse [0] y luego [ENTER]"
							+"\n"+"Lleva "+N_Estud+" estudiantes."
							+"\n");
					acumulador = 0;
					Estudiantes = sc.next();
					//Si es que se terminan de ingresar los estudiantes
					if(Estudiantes.equals("0")) {
						A = "1";
					}
					else {
						Dat += Estudiantes;
						N_Estud++;
						System.out.print("Ingrese la cantidad de notas del estudiante."
							+"\n"+"Si el número de notas es indefinido, ingrese 0 para añadir una a una"
							+"\n"+"Tras ingresar la cantidad de nota presione [ENTER]"
							+"\n");
						//Discriminar si es que se poseen las notas
						B = sc.next();
						N_Notas = 0;
						//Sin notas definidas
						if(B.equals("0")) {
							while((int)Prom.Delta(B) == 0) {
								System.out.println("Ingrese una nota del estudiante (entre 1 y 7)"
									+"\n"+"Tras ingresar una nota, pulse [ENTER] para continuar"
									+"\n"+"Si ya acabó de ingresar notas, pulse [0] y luego [ENTER]"
									+"\n"+"Lleva "+N_Notas+" notas."
									+"\n");
								C = sc.next();
								if((int)Prom.Delta(C) == 0) {
									Dat += "	"+"Promedio final:	"+Prom.PromedioAc(acumulador, N_Notas);
									acumulador2 += Prom.PromedioAc(acumulador, N_Notas);
									B = "1";
								}
								else {
									if((Prom.Delta(C)<1)||(Prom.Delta(C)>7)) {
										System.out.println("Esa nota no es válida.");
									}
									else {
										Dat += "	"+Prom.Delta(C);
										N_Notas++;
										acumulador += Prom.Delta(C);
									}
								}
							}
							Dat += "\n";
							System.out.println(Dat);
						}
						//Con notas definidas
						else {
							for(int i = 0; i < (int)Prom.Delta(B); i++) {
								System.out.println("Ingrese la nota número "+(i+1)+"."
										+"\n"+"Tras ingresar una nota, pulse [ENTER] para continuar");
								C = sc.next();
								if((Prom.Delta(C)<1)||(Prom.Delta(C)>7)) {
									i--;
									System.out.println("Esa nota no es válida.");
								}
								else {
									Dat += "	"+Prom.Delta(C);
									N_Notas++;
									acumulador += Prom.Delta(C);
								}
							}
							Dat += "	"+"Promedio final:	"+Prom.PromedioAc(acumulador, N_Notas)+"\n";
							acumulador2 += Prom.PromedioAc(acumulador, N_Notas);
							System.out.println(Dat);
						}
					}
				}
				//Acaba de ingresar datos de 1 curso
				System.out.print("¿Desea continuar?"
					+"\n"+"	0) No."+"\n"+"	1) Si."+"\n");
				A = sc.next();
				Dat += "\n"+"Promedio del curso "+N_Curso+":"+"	"+Prom.PromedioAc(acumulador2, N_Estud)+"\n";
				System.out.println(Dat);
				if(A.equals("0")) {
					aux = false;
				}
				else {
					A = "0";
					acumulador2 = 0;
					N_Estud = 0;
					Dat += "Curso "+(N_Curso+1)+":"+"\n";
					N_Curso++;
				}
			}
			}
			//Cursos definidos
			else {
				for(int i = 0; i < (int)Prom.Delta(A); i++) {
					while(aux == true) {
						System.out.print("Ingrese el nombre el estudiante sin usar la tecla [ESPACIO]."
								+"\n"+"Tras ingresar el nombre, pulse [ENTER] para continuar."
								+"\n"+"Si ya acabó de ingresar estudiantes, pulse [0] y luego [ENTER]"
								+"\n"+"Lleva "+N_Estud+" estudiantes."
								+"\n");
						acumulador = 0;
						Estudiantes = sc.next();
						//Si es que se terminan de ingresar los estudiantes
						if(Estudiantes.equals("0")) {
							break;
						}
						else {
							Dat += Estudiantes;
							N_Estud++;
							System.out.print("Ingrese la cantidad de notas del estudiante."
								+"\n"+"Si el número de notas es indefinido, ingrese 0 para añadir una a una"
								+"\n"+"Tras ingresar la cantidad de nota presione [ENTER]"
								+"\n");
							//Discriminar si es que se poseen las notas
							B = sc.next();
							N_Notas = 0;
							//Sin notas definidas
							if(B.equals("0")) {
								while((int)Prom.Delta(B) == 0) {
									System.out.println("Ingrese una nota del estudiante (entre 1 y 7)"
										+"\n"+"Tras ingresar una nota, pulse [ENTER] para continuar"
										+"\n"+"Si ya acabó de ingresar notas, pulse [0] y luego [ENTER]"
										+"\n"+"Lleva "+N_Notas+" notas."
										+"\n");
									C = sc.next();
									if((int)Prom.Delta(C) == 0) {
										Dat += "	"+"Promedio final:	"+Prom.PromedioAc(acumulador, N_Notas);
										acumulador2 += Prom.PromedioAc(acumulador, N_Notas);
										B = "1";
									}
									else {
										if((Prom.Delta(C)<1)||(Prom.Delta(C)>7)) {
											System.out.println("Esa nota no es válida.");
										}
										else {
											Dat += "	"+Prom.Delta(C);
											N_Notas++;
											acumulador += Prom.Delta(C);
										}
									}
								}
								Dat += "\n";
								System.out.println(Dat);
							}
							//Con notas definidas
							else {
								for(int j = 0; j < (int)Prom.Delta(B); j++) {
									System.out.println("Ingrese la nota número "+(N_Notas+1)+"."
											+"\n"+"Tras ingresar una nota, pulse [ENTER] para continuar");
									C = sc.next();
									if((Prom.Delta(C)<1)||(Prom.Delta(C)>7)) {
										j--;
										System.out.println("Esa nota no es válida.");
									}
									else {
										Dat += "	"+Prom.Delta(C);
										N_Notas++;
										acumulador += Prom.Delta(C);
									}
								}
								Dat += "	"+"Promedio final:	"+Prom.PromedioAc(acumulador, N_Notas)+"\n";
								acumulador2 += Prom.PromedioAc(acumulador, N_Notas);
								System.out.println(Dat);
								
							}
						}
					}
					//Acaba de ingresar datos de 1 curso
					Dat += "\n"+"Promedio del curso "+N_Curso+":"+"	"+Prom.PromedioAc(acumulador2, N_Estud)+"\n";
					System.out.println(Dat);
					acumulador2 = 0;
					N_Estud = 0;
					Dat += "Curso "+(N_Curso+1)+":"+"\n";
					N_Curso++;
				}
				//Para acabar de ingrear datos 
				System.out.print("¿Desea continuar?"
					+"\n"+"	0) No."+"\n"+"	1) Si."+"\n");
				A = sc.next();
				if(A.equals("0")) {
					aux = false;
				}
				else {
					A = "0";
					acumulador2 = 0;
					N_Estud = 0;
					Dat += "Curso "+(N_Curso+1)+":"+"\n";
					N_Curso++;
				}
			}
		}
	}
	public static void cal_Ord () {
		sc = new Scanner(System.in);
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
							+"\n"+"Si termina de ingresar valores, escriba"
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
							+"\n"+"Si termina de ingresar valores, escriba"
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