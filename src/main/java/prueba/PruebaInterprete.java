package prueba;

import beans.InterpreteEspaniol;
import beans.Traductor;

public class PruebaInterprete {
	
	public static void main(String [] args) {
		Traductor traductor = new Traductor();		
		//Inyeccion manual del interprete.
		//Obligado a solo un idioma
		traductor.setInterprete(new InterpreteEspaniol());
		traductor.setNombre("Johnny");
		traductor.hablar();
	}
}
