package ej1;

public class PersonaApp {

	public static void main(String[] args) {

		Persona persona1= new Persona("4764526Z");
		Persona persona2= new Persona("Dani",18,'H');
		Persona persona3= new Persona("Luna","4862124P",18,'M',57,1.58);
		//Persona persona4= new Persona(); no funciona ya que no hay un constructor por defecto vacio
		
		System.out.println(persona1);
		System.out.println(persona2);
		System.out.println(persona3);

	}

}
