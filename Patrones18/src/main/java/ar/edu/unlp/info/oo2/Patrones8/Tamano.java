package ar.edu.unlp.info.oo2.Patrones8;

public class Tamano  extends Aspecto{

	public Tamano (FileComponent componente) {
		super(componente);
	}
    
public String prettyPrint() {
		
		return super.getComponente().prettyPrint() + this.getTamano();
	}

}
