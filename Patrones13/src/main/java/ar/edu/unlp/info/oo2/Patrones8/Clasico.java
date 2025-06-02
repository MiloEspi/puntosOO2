package ar.edu.unlp.info.oo2.Patrones8;

public class Clasico extends Builder {

	public Clasico () {
		this.reset();
		
	}
	
	
	
	public void agregarPan() {
		this.getSandwich().setPan("Brioche");
		
	}

	@Override
	public void agregarAderezo() {
		this.getSandwich().setAderezo("Mayonesa");		
	}

	@Override
	public void agregarPrincipal() {
		this.getSandwich().setPrincipal("Carne Ternera");		
	}

	@Override
	public void agregarAdicional() {
		this.getSandwich().setAdicional("Tomate");		
	}

}
