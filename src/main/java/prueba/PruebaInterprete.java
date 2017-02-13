package prueba;

import beans.InterpreteIngles;
import beans.Traductor;

public class PruebaInterprete {
	
	public static void main(String [] args) {
		Traductor traductor = new Traductor();		
		//Inyeccion manual del interprete.
		//Obligado a solo un idioma
		traductor.setInterprete(new InterpreteIngles());
		traductor.setNombre("Johnny");
		traductor.hablar();
	}
}
