package ar.edu.unlp.info.oo1.O2Ej1;

public abstract class State {
 //Como necsito guardarme la tarea tiene que ser abstracta
	private ToDoItem tarea;
	
	
	public State (ToDoItem tarea) {
		this.tarea = tarea;
	}
	
	public ToDoItem getTarea() {
		return this.tarea;
	}
	
	public  void start () { }
		
	public abstract void togglePause(); 
}
