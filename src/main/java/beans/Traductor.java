package beans;

public class Traductor {

	private Interprete interprete;
	private String nombre;
	
	public void hablar() {
		this.interprete.saludar();
		
		System.out.println(this.nombre);
		
		this.interprete.despedirse();
	}
	
	public Interprete getInterprete() {
		return this.interprete;
	}
	
	public void setInterprete(Interprete interprete) {
		this.interprete = interprete;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
}
