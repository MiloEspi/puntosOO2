package ar.edu.unlp.info.oo1.O2Ej1;

public class Pending extends State {

	public Pending (ToDoItem tarea) {
		super(tarea);
	}
	@Override
	public void start () {
		ToDoItem tarea = super.getTarea();
		tarea.changeState(new InProgress(tarea));
		
	}
	
	public void togglePause() {
		
		
	}
}
