package ej3;

public class ElectrodomesticoApp {

	public static void main(String[] args) {
		
		Electrodomestico elec1= new Electrodomestico();
		System.out.println("Electrodomestico 1 con constructor por defecto sin valores pasados por referencia:");
		System.out.println(elec1);
		
		Electrodomestico elec2=new Electrodomestico(200,50.8);
		System.out.println("Electrodomestico 2 con constructor especifico donde se pasan el precio y el peso:");
		System.out.println(elec2);
		
		Electrodomestico elec3=new Electrodomestico(200,"Naranja",'A',50.8);
		System.out.println("Electrodomestico 3 con constructor especifico con todos los atributos pasados por referencia:");
		System.out.println(elec3);
		

	}

}
