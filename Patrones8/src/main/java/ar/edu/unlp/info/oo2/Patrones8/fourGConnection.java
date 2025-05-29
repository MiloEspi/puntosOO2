package ar.edu.unlp.info.oo2.Patrones8;

public class fourGConnection {
	private String symb;
	
	public fourGConnection () {
		this.symb =  "4G";
		
	}
	
  String transmit (String data, Integer crc) {
		return getSymb()+data;
	}
	
	public String getSymb() {
		return this.symb;
	}
}
