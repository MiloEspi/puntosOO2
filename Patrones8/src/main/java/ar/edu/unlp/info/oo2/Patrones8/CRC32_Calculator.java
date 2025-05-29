package ar.edu.unlp.info.oo2.Patrones8;
import java.util.zip.CRC32 ;
public class CRC32_Calculator implements Calculator{

	
	public CRC32_Calculator () {
		
		
	}
	
	
	//adapta la libreria java.util.zip.CRC32 
	
	public long crcFor(String data) {
		CRC32 crc = new CRC32();
		String datos = "un mensaje";
		crc.update(datos.getBytes());
		return crc.getValue();

	}
}
