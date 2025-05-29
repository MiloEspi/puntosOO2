package ar.edu.unlp.info.oo2.Patrones8;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DispositivoTest {
	
	private Dispositivo dispositivo;
	private Calculator crc;
	private Connection conexion;

	
	@BeforeEach
	void setUp() {
		crc = new CRC16_Calculator();
		conexion = new WifiConn();
		dispositivo = new Dispositivo (conexion, crc);
	}
	
	
	@Test
	
	void testSendDataNormal () {
		String result = dispositivo.send("probando");
		assertTrue (result.contains("wifi:probando"));
		
	}
	

    @Test
    void testSend_DataVacia() {
        String result = dispositivo.send("");
        assertTrue(result.contains("wifi"));  
    }
    
    @Test
    void testSend_CaracteresEspeciales() {
        String result = dispositivo.send("@#$%");
        assertTrue(result.contains("@#$%"));
    }
    
    @Test 
    void testSendDataCambiandoCRC () {
    	dispositivo.setCalculator(new CRC32_Calculator());
        String result = dispositivo.send("con CRC32");
        assertTrue(result.contains("wifi:con CRC32"));
    }
    
    @Test
    void testSetConnection_WiFiTo4G() {
        fourGConnection fourG = new fourGConnection();
        Adapter4G adapter = new Adapter4G(fourG);
        
        dispositivo.setConnection(adapter);
        String result = dispositivo.send("4G");
        assertTrue(result.contains("4G: 4G"));  // Verifica que ahora usa 4G
    }

    @Test
    void testSetConnection_MismaConexion() {
        // WiFi ya está configurado en setUp()
        dispositivo.setConnection(conexion);  // No debería lanzar excepciones
        String result = dispositivo.send("wifi");
        assertTrue(result.contains("wifi: wifi"));
    }
	
	
}
