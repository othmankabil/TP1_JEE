package pres;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Scanner;

import dao.IDao;
import metier.Imetier;
public class pres2
{

	public static void main(String[] args) throws FileNotFoundException, ClassNotFoundException, 
	InstantiationException, IllegalAccessException, NoSuchMethodException, SecurityException,
	IllegalArgumentException, InvocationTargetException 
	{
		/*	injection des depandances par instanciation dynamique  */
		Scanner Scanner = new Scanner(new File("config.txt")) ;
		
		String doaClassName = Scanner.nextLine();		
		Class<?> cDao = Class.forName(doaClassName);
		IDao dao =(IDao) cDao.newInstance();
		 
		String metierClassName = Scanner.nextLine();		
		Class<?> cMetier = Class.forName(metierClassName);
		Imetier metier =(Imetier) cMetier.newInstance();
		
		Method m = cMetier.getMethod("setDao",IDao.class);
		m.invoke(metier, dao);		
		Method m1 = cMetier.getMethod("calcul");
		System.out.println(m1.invoke(metier));
		 		
		Scanner.close();
	}

}
