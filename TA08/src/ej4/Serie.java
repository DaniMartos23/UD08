package ej4;

public class Serie {

	private String m_titulo,m_genero,m_creador;
	private int m_numtemp;
	private Boolean m_entregado;
	
	public Serie() {
		
		this.setM_numtemp(3);
		this.setM_entregado(false);
		this.setM_creador("");
		this.setM_genero("");
		this.set_Titulo("");
		
	}
	
	public Serie(String titulo, String creador) {
		
		this.setM_numtemp(3);
		this.setM_entregado(false);
		this.setM_creador(creador);
		this.setM_genero("");
		this.set_Titulo(titulo);
	}
	
	public Serie(String titulo,int numtemp,String genero, String creador) {
		
		this.setM_numtemp(numtemp);
		this.setM_entregado(false);
		this.setM_creador(creador);
		this.setM_genero(genero);
		this.set_Titulo(titulo);
	}

	public String get_Titulo() {
		return m_titulo;
	}

	public void set_Titulo(String m_titulo) {
		this.m_titulo = m_titulo;
	}

	public String getM_genero() {
		return m_genero;
	}

	public void setM_genero(String m_genero) {
		this.m_genero = m_genero;
	}

	public String getM_creador() {
		return m_creador;
	}

	public void setM_creador(String m_creador) {
		this.m_creador = m_creador;
	}

	public int getM_numtemp() {
		return m_numtemp;
	}

	public void setM_numtemp(int m_numtemp) {
		this.m_numtemp = m_numtemp;
	}

	public Boolean getM_entregado() {
		return m_entregado;
	}

	public void setM_entregado(Boolean m_entregado) {
		this.m_entregado = m_entregado;
	}
	
	public String toString() {
		return ("El titulo de la serie es " +this.m_titulo+"\nEl numero de temporadas es "+ this.m_numtemp+"\nEl genero es "+this.m_genero
				+"\nEl estado de entregado es "+this.m_entregado+"\nEl creador es "+ this.m_creador);

	}
	
}
