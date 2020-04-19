package pres;
import java.awt.Image;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import metier.Imetier;

public class PresAvecSpring {

	public static void main(String[] args) throws FileNotFoundException 
	{
		
		ApplicationContext ctx = new FileSystemXmlApplicationContext("config.xml");
		Imetier metier = (Imetier) ctx.getBean("metier");
		System.out.println(metier.calcul());
	}

}
