package ej4;

public class SerieApp {

	public static void main(String[] args) {
		
		Serie serie1= new Serie();
		System.out.println("Serie 1 con constructor por defecto sin valores pasados por referencia:");
		System.out.println(serie1);
		
		Serie serie2=new Serie("Pepita la flaca","Pepito");
		System.out.println("Serie 2 con constructor especifico donde se pasan el titulo y el creador:");
		System.out.println(serie2);
		
		Serie serie3=new Serie("Pepito en Tarragona",5,"Aventura","Carlitos");
		System.out.println("Serie 3 con constructor especifico con todos los atributos pasados por referencia menos entregado:");
		System.out.println(serie3);

	}

}
