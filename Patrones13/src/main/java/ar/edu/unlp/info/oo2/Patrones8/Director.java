package ar.edu.unlp.info.oo2.Patrones8;

public class Director {
	private Builder builder; 
	
	public Director (Builder unBuilder) {
		this.builder = unBuilder;
	}
	
	public Sandwich construirSandwich() {
		this.builder.reset();
		this.builder.agregarPan();
		this.builder.agregarAderezo();
		this.builder.agregarPrincipal();
		this.builder.agregarAdicional();
		return this.builder.getSandwich();
	}
	
	
	
}
