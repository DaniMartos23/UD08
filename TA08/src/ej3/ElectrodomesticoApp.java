package ej3;

import java.util.Scanner;

public class ElectrodomesticoApp {

	public static void main(String[] args) {
		
		Electrodomestico elec1= new Electrodomestico();
		System.out.println("Electrodomestico 1 con constructor por defecto sin valores pasados por referencia:");
		System.out.println(elec1);
		
		Electrodomestico elec2=new Electrodomestico(200,50.8);
		System.out.println("Electrodomestico 2 con constructor especifico donde se pasan el precio y el peso:");
		System.out.println(elec2);
		
		System.out.println("Electrodomestico 3 con constructor especifico con todos los atributos pasados por referencia:");
		Electrodomestico elec3=insertaValores();
		
		System.out.println(elec3);
		

	}

	private static Electrodomestico insertaValores() {
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("Introduce precio del producto: ");
		double precio= Double.parseDouble(sc.nextLine());
		
		System.out.print("Introduce color del producto (blanco, negro, rojo, azul, gris): ");
		String color= sc.nextLine();
		
		System.out.print("Introduce consumo del producto (A,B,C,D,E,F): ");
		char consumo= sc.nextLine().charAt(0);
		
		System.out.print("Introduce peso del producto: ");
		double peso= Double.parseDouble(sc.nextLine());
		
		sc.close();
		return new Electrodomestico(precio,color,consumo,peso);
		
	}

}
