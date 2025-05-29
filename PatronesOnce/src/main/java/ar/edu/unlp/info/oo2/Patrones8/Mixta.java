package ar.edu.unlp.info.oo2.Patrones8;

import java.util.ArrayList;

public class Mixta implements Topografia {
	private ArrayList<Topografia> listaPartes;

public Mixta (ArrayList<Topografia> partes) {
	this.listaPartes = partes;
}
public Mixta() {
	
}
public void add (Topografia t) {
	if (this.listaPartes.size() < 4) {
	this.listaPartes.add(t);
	}
}


public double proporcion () {
	return this.listaPartes.stream().mapToDouble(t -> t.proporcion()).sum() / 4;
}

public boolean equals (Object t) {
	if (t instanceof Mixta) {
	return this.esIgualMixta((Mixta)t);
	}
	else return false;
}

public boolean esIgualMixta(Mixta t) {
	return t.listaPartes == this.listaPartes;
	
	
}


}
