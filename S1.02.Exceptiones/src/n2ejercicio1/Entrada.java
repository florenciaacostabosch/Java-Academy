package n2ejercicio1;
import java.util.Scanner;

public class Entrada {
	public static void main(String[] args) {
		
	byte edad = leerByte("Introduce tu edad: ");
    System.out.println("Edad ingresada: " + edad);
    int entero = leerInt("Introduce un número entero: ");
    System.out.println("Número entero ingresado: " + entero);
    float float1 = leerFloat("Introduce un float: ");
    System.out.println("Número float ingresado: " + float1);
    double double1 = leerDouble("Introduce un double: ");
    System.out.println("Número entero ingresado: " + double1);
    char caracter=leerChar("Introduce un caracter: ");
    System.out.println("Caracter ingresado: " + caracter);
    String cadena =leerString("Introduce una cadena: ");
    System.out.println("Cadena ingresada: " + cadena);
    boolean respuesta=leerSiNo("Introduce Si o No: ");
    System.out.println("Respuesta ingresada: "+ respuesta);
	}
	
	public static byte leerByte(String mensaje) {
		Scanner input = new Scanner(System.in);
		byte byte1 = 0;
		boolean entradaValida = false;
		do {
			System.out.print(mensaje);
			try {
				byte1 = input.nextByte();
				entradaValida = true;
				} catch (java.util.InputMismatchException e) {
					System.out.println("Error de formato. ");
					input.nextLine();
					}
			} while (!entradaValida);
		return byte1;
		}
	
	
	public static int leerInt(String mensaje) {
		Scanner input = new Scanner(System.in);
		int entero = 0;
		boolean entradaValida = false;
		do {
			System.out.print(mensaje);
			try {
				entero = input.nextInt();
				entradaValida = true;
				} catch (java.util.InputMismatchException e) {
					System.out.println("Error de formato. ");
					input.nextLine();
					}
			} while (!entradaValida);
		return entero;
		}
	
	
	public static float leerFloat(String mensaje) {
		Scanner input = new Scanner(System.in);
		float float1 = 0;
		boolean entradaValida = false;
		do {
			System.out.print(mensaje);
			try {
				float1 = input.nextFloat();
				entradaValida = true;
				} catch (java.util.InputMismatchException e) {
					System.out.println("Error de formato. ");
					input.nextLine();
					}
			} while (!entradaValida);
		return float1;
		}
	
	
	public static double leerDouble(String mensaje) {
		Scanner input = new Scanner(System.in);
		double double1 = 0;
		boolean entradaValida = false;
		do {
			System.out.print(mensaje);
			try {
				double1 = input.nextDouble();
				entradaValida = true;
				} catch (java.util.InputMismatchException e) {
					System.out.println("Error de formato. ");
					input.nextLine();
					}
			} while (!entradaValida);
		return double1;
		}
	
	 public static char leerChar(String mensaje) {
		 Scanner input = new Scanner(System.in);
		 char caracter = 0;
		 boolean entradaValida = false;
		 do {
			 System.out.print(mensaje);
			 try {
				 String inputLine = input.nextLine();
				 if (inputLine.length() == 1) {
					 caracter = inputLine.charAt(0);
					 entradaValida = true;
	                } else {
	                    System.out.println("Error de formato. ");
	                }
	            } catch (Exception e) {
	                System.out.println("Error de formato. ");
	                input.nextLine();
	            }
	        } while (!entradaValida);
		 return caracter;
		 }
	 
	 public static String leerString(String mensaje) {
		 Scanner input = new Scanner(System.in);
		 String cadena = "";
		 boolean entradaValida = false;
		 do {
			 System.out.print(mensaje);
			 try {
				 cadena = input.nextLine();
				 entradaValida = true;
				 } catch (Exception e) {
					 System.out.println("Error de formato. ");
					 input.nextLine();
					 }
			 } while (!entradaValida);
		 return cadena;
		 }
	 
	 public static boolean leerSiNo(String mensaje) {
		 Scanner input = new Scanner(System.in);
		 String entrada = "";
		 while (true) {
			 System.out.print(mensaje);
			 entrada = input.nextLine().toLowerCase();
			 try {
				 if (entrada.equals("si")) {
					 return true;
					 } else if (entrada.equals("no")) {
						 return false;
						 }
			 } catch (Exception e) {
				 System.out.println("Error de formato. ");
				 }
			 }
		 }   
	 }
	 
	




