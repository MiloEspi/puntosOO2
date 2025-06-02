package ar.edu.unlp.info.oo2.Patrones8;

public abstract class Builder {
	
	private Sandwich sandwich;
	
	public void reset() {
		this.sandwich  = new Sandwich();
	}
	public Sandwich getSandwich () {
		return this.sandwich;
		
	}
	
	public abstract void agregarPan();
	public abstract void agregarAderezo();
	public abstract void agregarPrincipal() ;
	public abstract void agregarAdicional();
}
