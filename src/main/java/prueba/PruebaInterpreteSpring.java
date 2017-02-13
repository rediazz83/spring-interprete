package prueba;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import beans.Traductor;

public class PruebaInterpreteSpring {

	public static void main(String [] args) {
		BeanFactory factory = new ClassPathXmlApplicationContext("spring-context.xml");
		
		Traductor traductor = (Traductor) factory.getBean("traductorEspaniol");
		traductor.hablar();
		
		traductor = (Traductor) factory.getBean("traductorIngles");
		traductor.hablar();
		
		traductor = (Traductor) factory.getBean("traductorFrances");
		traductor.hablar();
	}
	
}
