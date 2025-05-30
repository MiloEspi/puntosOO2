package ar.edu.unlp.info.oo2.Patrones8;

public class Extension extends Aspecto {

	public Extension (FileComponent componente) {
		super(componente);
	}
    
public String prettyPrint() {
		
		return super.getComponente().prettyPrint() + this.getExtension();
	}

}
