package ar.edu.unlp.info.oo2.Patrones8;

public class Adapter4G implements Connection{
	private fourGConnection adaptado;

	
	public Adapter4G(fourGConnection fourG) {
		this.adaptado = fourG;
	}


	public String sendData(String data, Integer crc) {
		return this.adaptado.transmit(data, crc);
	}


	public String pict() {
		return this.adaptado.getSymb();
	}
	
	
	
}
