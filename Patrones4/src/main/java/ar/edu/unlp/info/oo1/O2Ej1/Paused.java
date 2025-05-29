package ar.edu.unlp.info.oo1.O2Ej1;

public class Paused extends State{

	
	public Paused (ToDoItem tarea) {
		super(tarea);
	}
	
	public void togglePause () {
		ToDoItem tarea = super.getTarea();
		tarea.changeState(new InProgress (tarea));
		
	}
	
	
}
