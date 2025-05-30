package ar.edu.unlp.info.oo2.Patrones8;

public class Permisos extends Aspecto{

	public Permisos (FileComponent componente) {
		super(componente);
	}
    
	
public String prettyPrint() {
		
		return this.getComponente().prettyPrint() + this.getPermisos();
	}

}
