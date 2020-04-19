package pres;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import metier.Imetier;

public class presavecSpringAnnotations {

	public static void main(String[] args) {
		
		ApplicationContext ctx = new AnnotationConfigApplicationContext("dao","metier");
		Imetier metier = ctx.getBean(Imetier.class);
		System.out.println(metier.calcul());
	}
}
