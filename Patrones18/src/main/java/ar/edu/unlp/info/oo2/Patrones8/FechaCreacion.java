package ar.edu.unlp.info.oo2.Patrones8;

public class FechaCreacion  extends Aspecto{

	public FechaCreacion (FileComponent componente) {
		super(componente);
	}
    
public String prettyPrint() {
		
		return super.getComponente().prettyPrint() + this.getFechaCreacion();
	}

}
