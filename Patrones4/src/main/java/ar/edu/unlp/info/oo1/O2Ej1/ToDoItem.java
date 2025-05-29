package ar.edu.unlp.info.oo1.O2Ej1;

import java.util.ArrayList;

public class ToDoItem {

	private String nombre;
	private ArrayList<String> comentarios;
	private State estado;
	
	public ToDoItem(String nombre) {
		this.nombre = nombre;
		this.comentarios = new ArrayList<String>();
		this.estado = new Pending (this);
	}
	
	
	public void Start () {
		this.estado.start();
		
	}
	
	public void changeState (State estado) {
		this.estado = estado;
		
	}


	
}
