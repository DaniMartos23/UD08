package ej3;

public class Electrodomestico {
	static final double PRECIODEFAULT=100;
	static final String COLORDEFAULT="blanco";
	static final char CONSUMODEFAULT='F';
	static final double PESODEFAULT=5;
	private String[] colores = new String[] {"blanco", "negro", "rojo", "azul", "gris"};
	private String consumo = "A,B,C,D,E,F"; 
	
	private double m_preciobase,m_peso;
	private String m_color;
	private char m_conmsumo;
	
	
	public Electrodomestico() {
		
		this.m_preciobase=PRECIODEFAULT;
		this.m_color=COLORDEFAULT;
		this.m_peso=PESODEFAULT;
		this.m_conmsumo=CONSUMODEFAULT;
		
	}
	
	public Electrodomestico(double precio, double peso) {
		
		this.m_preciobase=precio;
		this.m_color=COLORDEFAULT;
		this.m_peso=peso;
		this.m_conmsumo=CONSUMODEFAULT;
	}
	
	public Electrodomestico(double precio, String color, char consumo, double peso) {
		
		this.m_preciobase=precio;
		this.m_color=findColor(color);
		this.m_peso=peso;
		this.m_conmsumo=compConsumo(consumo);
	}
	
	
	private char compConsumo(char consumos) {
		// Método que devuelve el consumo pasado por referencia si es el valor correcto y si no devuelve el valor por defecto.
		String sconsumo=""+consumos;
		if(consumo.contains(sconsumo.toUpperCase())) return Character.toUpperCase(consumos);
		else {
			System.out.println("valor incorrecto: Se inicializara con valor por defecto.");
			return CONSUMODEFAULT;
		}
	}

	private String findColor(String color) {
		//método que devuelve el color pasado por referencia si esta contenido en la cadena colores, si no devuelve el color por defecto
		int i=0;
		
		while(i<colores.length) {
			if(colores[i].equals(color.toLowerCase())) return color.toLowerCase();
			i++;
			
		}
		System.out.println("Color no admitido: se inicializará con el valor por defecto.");
		return COLORDEFAULT;
		
	}

	public String toString() {
		return ("El precio del electrodomestico es "+this.m_preciobase+"\nEl color del electrodomestico es "+this.m_color+"\nEl consumo del electrodomestico es "
				+this.m_conmsumo+"\nEl peso del electrodomestico es "+ this.m_peso);
	}

	
}
