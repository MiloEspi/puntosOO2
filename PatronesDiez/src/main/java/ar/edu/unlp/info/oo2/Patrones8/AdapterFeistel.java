package ar.edu.unlp.info.oo2.Patrones8;

public class AdapterFeistel implements Cifrador {
		private FeistelCipher adaptado;
	
	public void cifrar(String mensaje) {
		adaptado.encode(mensaje);
		
	}


	public String descifrar(String mensaje) {
		return adaptado.encode(mensaje);
	}

}
