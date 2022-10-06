package ej2;

public class Password {

	private int m_longitud;
	private String m_password;
	
	public Password() {
		this.set_Longitud(8);
		this.m_password=generaPassword();
	}
	
	public Password(int longitud) {
		this.set_Longitud(longitud);
		this.m_password=generaPassword();
	}

	public int get_Longitud() {
		return m_longitud;
	}

	public void set_Longitud(int m_longitud) {
		this.m_longitud = m_longitud;
	}
	
	public String get_Password() {
		return this.m_password;
	}
	
	private String generaPassword() {
		// Método que genera una contrasena aleatoria
		String pass="";
		int random;
		for(int i=0;i<this.get_Longitud();i++) {
			random=(int) (Math.random()*(126-33+1)+33);
			pass+=(char)random;
		}
		
		return pass;
	}
	
	public String toString() {
		return ("La password generada es: "+this.get_Password());
	}
}
