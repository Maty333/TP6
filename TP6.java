package ejercicio6;

import java.util.*;


public class TP6 {

	public static void main(String[] args) {
		
	
		 operaciones aritmeticas = new operaciones();
		 	Scanner entrada = new Scanner(System.in);
		 	double n1, n2;
		 	double resultado;
		 	int opcion = 0;
		 	boolean op = true;
		  while(op){
		 	System.out.println("Menu Calculadora");
		 	System.out.println("1 - Sumar");
			System.out.println("2 - Restar");
			System.out.println("3 - Multiplicar");
			System.out.println("4 - Dividir");
			System.out.println("5 - Salir");
			System.out.println("Ingrese el numero de la operacion a realizar");
			opcion = entrada.nextInt();
			
		 
		 	if (opcion ==5) {
		 		System.out.println("Salio de la calculadora");	
		 		op = false;
		 	}else {
		 		switch(opcion) {
		 		
		 		case 1:
		 			System.out.println("Usted eligio Sumar");
		 			System.out.println("Ingrese el 1er número..");
					n1 = entrada.nextInt();
					System.out.println("Ingrese el 2do número..");
					n2 = entrada.nextInt();
					resultado = aritmeticas.suma(n1, n2);
					System.out.println("La suma es: " + resultado);
					System.out.println("*****************************");
					break;
		 		case 2:
		 			System.out.println("Usted eligio Restar");
		 			System.out.println("Ingrese el 1er número..");
					n1 = entrada.nextInt();
					System.out.println("Ingrese el 2do número..");
					n2 = entrada.nextInt();
					resultado = aritmeticas.resta(n1, n2);
					System.out.println("La resta es: " + resultado);
					System.out.println("*****************************");
					break;
		 		case 3:
		 			System.out.println("Usted eligio Multiplicar");
		 			System.out.println("Ingrese el 1er número..");
					n1 = entrada.nextInt();
					System.out.println("Ingrese el 2do número..");
					n2 = entrada.nextInt();
					resultado = aritmeticas.producto(n1, n2);
					System.out.println("El producto es: " + resultado);
					System.out.println("*****************************");
					break;
		 		case 4: 
		 			System.out.println("Usted eligio Dividir");
		 			System.out.println("Ingrese el 1er número..");
					n1 = entrada.nextInt();
					System.out.println("Ingrese el 2do número..");
					n2 = entrada.nextInt();
					if(n2 == 0) {
						System.out.println("No se puede dividir por 0");
						System.out.println("*****************************");
					}else {
					resultado = aritmeticas.division(n1, n2);
					System.out.println("La division: " + resultado);
					System.out.println("*****************************");
					}
					break;
				default:
					System.out.println("Opcion invalida");
					System.out.println("Elija una opcion del menu mostrado");
					System.out.println("*****************************");
		 		}
		 		
		 	}
		 	
		 
		 
		 }
			 
	}	 

	}
		 

