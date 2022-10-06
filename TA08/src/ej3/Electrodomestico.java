package ej3;

public class Electrodomestico {
	static final double PRECIODEFAULT=100;
	static final String COLORDEFAULT="blanco";
	static final char CONSUMODEFAULT='F';
	static final double PESODEFAULT=5;
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
		this.m_color=color.toLowerCase();
		this.m_peso=peso;
		this.m_conmsumo=Character.toUpperCase(consumo);
	}
	
	
	public String toString() {
		return ("El precio del electrodomestico es "+this.m_preciobase+"\nEl color del electrodomestico es "+this.m_color+"\nEl consumo del electrodomestico es "
				+this.m_conmsumo+"\nEl peso del electrodomestico es "+ this.m_peso);
	}

	
}
