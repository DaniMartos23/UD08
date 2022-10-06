package ej1;

public class Persona {
	static final char HOMBRE= 'H';
	static final char MUJER= 'M';
	private String m_nombre,m_DNI;
	private int m_edad;
	private char m_sexo;
	private double m_peso,m_altura;
	
	
	public Persona(String dni) {//Constructor por defecto que inicializa obligatoriamente el dni
		this.set_Sexo(HOMBRE);
		this.set_DNI(dni);
		this.set_Nombre("");
		this.set_Edad(0);
		this.set_Altura(0);
		this.set_Peso(0);
	}
	public Persona(String nombre, int edad, char sexo) {//Constructor inicializando solo los valores nombre, edad y sexo
		this.set_Sexo(sexo);
		this.set_Nombre(nombre);
		this.set_Edad(edad);
		this.set_Altura(0);
		this.set_Peso(0);
		this.set_DNI("");
	}
	public Persona (String nombre, String DNI, int edad, char sexo, double peso, double altura) {//Constructor inicializando todos los valores
		this.set_Sexo(sexo);
		this.set_DNI(DNI);
		this.set_Nombre(nombre);
		this.set_Edad(edad);
		this.set_Altura(altura);
		this.set_Peso(peso);
	}
	public String get_Nombre() {
		return m_nombre;
	}
	public void set_Nombre(String m_nombre) {
		this.m_nombre = m_nombre;
	}
	public String get_DNI() {
		return m_DNI;
	}
	public void set_DNI(String m_DNI) {
		this.m_DNI = m_DNI;
	}
	public int get_Edad() {
		return m_edad;
	}
	public void set_Edad(int m_edad) {
		this.m_edad = m_edad;
	}
	public char get_Sexo() {
		return m_sexo;
	}
	public void set_Sexo(char m_sexo) {
		this.m_sexo = m_sexo;
	}
	public double get_Peso() {
		return m_peso;
	}
	public void set_Peso(double m_peso) {
		this.m_peso = m_peso;
	}
	public double get_Altura() {
		return m_altura;
	}
	public void set_Altura(double m_altura) {
		this.m_altura = m_altura;
	}
	public String toString() {//método toString para imprimir por pantalla la clase con sus atributos
		
		String print;
		print= "nombre= "+this.m_nombre+"\nDNI= "+this.m_DNI+"\nedad= "+this.m_edad+"\nsexo= "+this.m_sexo+"\npeso= "+this.m_peso+"\naltura= "+this.m_altura+"\n";
		return print;
		
	}
}
