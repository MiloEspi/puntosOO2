package ar.edu.unlp.info.oo2.Patrones8;

public class FechaModificacion extends Aspecto{

	public FechaModificacion (FileComponent componente) {
		super(componente);
	}
    
	
public String prettyPrint() {
		
		return super.getComponente().prettyPrint() + this.getFechaMod();
	}

}
