package ar.edu.unlp.info.oo2.Patrones8;

public class Dispositivo {
	private Connection conexion;
	private Ringer ringer;
	private Display display; 
	private Calculator crcCalculador;
	
	public Dispositivo (Connection conexion, Calculator crcCalculador) {    //Ringer y display se inician adentro 
		this.conexion = conexion; 
		this.crcCalculador = crcCalculador; 
		this.ringer = new Ringer ();
		this.display = new Display();
		
	}
	
	public String send (String data) {
		long crcLong = this.crcCalculador.crcFor(data);
		Integer crc = Integer.valueOf((int) crcLong);
		return this.conexion.sendData(data,crc);
		
	}
	
	public void setCalculator (Calculator calculador) {
		this.crcCalculador= calculador;
		this.ringer.ring();
		this.display.showBanner(conexion.pict());
	}
	
	
	public void setConnection (Connection conexion) {
		this.conexion = conexion;
		this.ringer.ring();
		this.display.showBanner(conexion.pict());
	}
	
}
