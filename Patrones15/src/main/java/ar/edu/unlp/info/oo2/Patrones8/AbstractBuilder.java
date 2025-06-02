package ar.edu.unlp.info.oo2.Patrones8;

public abstract class AbstractBuilder {

	private Presupuesto presupuesto;
	
	public void reset () {
		this.presupuesto = new Presupuesto();
	}
	public  abstract void agregarProcesador (); 
	public  abstract void agregarRAM();
	public  abstract void agregarDisco();
	public  abstract void agregarTarjetaGrafica();
	public  abstract void agregarGabinete();
	
	public Presupuesto getPresupuesto() {
		return this.getPresupuesto();
	}
	
	public double calcularPrecio () {
		return this.presupuesto.calcularPrecio();
	}
	
	public double calcularConsumo() {
		return this.presupuesto.calcularConsumo();
	}
	
	public void setUsuario (String nombre) {
		this.presupuesto.setUsuario(nombre);
	}
	
	
}
