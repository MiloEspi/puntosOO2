package ar.edu.unlp.info.oo2.Patrones8;

public class AdapterRC4 implements Cifrador {
		private RC4 adaptado;
		private String key;
	
	public void cifrar(String mensaje) {
		adaptado.encriptar(mensaje, this.key);
		
	}

	
	public String descifrar(String mensaje) {
			return adaptado.desencriptar(mensaje, this.key);
		
	}

}
