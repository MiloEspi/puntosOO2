package ar.edu.unlp.info.oo2.Patrones8;

public class PCBasica extends AbstractBuilder{

	
	public PCBasica () {
		this.reset();
	}
	
	
	
	public void agregarProcesador() {
		this.getPresupuesto().setProcesador(Catalogo.getComponente("Basico"));
	}

	
	public void agregarRAM() {
		this.getPresupuesto().setRAM(Catalogo.getComponente("Basico"));
		
	}

	
	public void agregarDisco() {
		this.getPresupuesto().setDisco(Catalogo.getComponente("500 GB"));
		
	}

	
	public void agregarTarjetaGrafica() {
		this.getPresupuesto().setProcesador(Catalogo.getComponente("Integrada"));
		
	}

	
	public void agregarGabinete() {
		this.getPresupuesto().setGabinete(Catalogo.getComponente("Gabinete Estandar"));
		
	}

	
	
}
