package ar.edu.unlp.info.oo1.O2Ej1;

public class InProgress extends State{

	
	public InProgress (ToDoItem tarea) {
		super(tarea);
	}
	
	public void togglePause () {
		ToDoItem tarea = super.getTarea();
		tarea.changeState(new Paused (tarea));
		
	}
}

