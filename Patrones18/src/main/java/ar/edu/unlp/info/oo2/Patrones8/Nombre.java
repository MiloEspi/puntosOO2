package ar.edu.unlp.info.oo2.Patrones8;

public class Nombre extends Aspecto{
	
	
	public Nombre (FileComponent componente) {
		super(componente);
	}
    
	public String prettyPrint() {
		
		return super.getComponente().prettyPrint() + this.getNombre();
	}
	

}
