package beans;

public class Traductor {

	private InterpreteEspaniol interprete;
	private String nombre;
	
	public void hablar() {
		this.interprete.saludar();
		
		System.out.println(this.nombre);
		
		this.interprete.despedirse();
	}
	
	public InterpreteEspaniol getInterprete() {
		return this.interprete;
	}
	
	public void setInterprete(InterpreteEspaniol interprete) {
		this.interprete = interprete;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
}
