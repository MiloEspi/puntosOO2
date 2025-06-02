package ar.edu.unlp.info.oo2.Patrones8;

public class Director {

		private AbstractBuilder builder;
		
		
		public Director (AbstractBuilder unBuilder) {
			this.builder = unBuilder;
			
		}
		
		public void setBuilder (AbstractBuilder otroBuilder) {
			this.builder = otroBuilder;
		}
		
		public Presupuesto crearPrespuesto () {
			this.builder.reset();
			this.builder.agregarProcesador();
			this.builder.agregarRAM();
			this.builder.agregarDisco();
			this.builder.agregarTarjetaGrafica();
			this.builder.agregarGabinete();
			return this.builder.getPresupuesto();
		}
		
}
