package ar.edu.unlp.info.oo2.Patrones8;

public class WifiConn implements Connection{
private String pict;
	
	public WifiConn () {
		this.pict = "wifi";
		
	}
	
	public String sendData(String data, Integer crc) {
		return pict+data;
		
	}

	 public String pict () {
		return this.pict;
	 
	

	
	
}
}
