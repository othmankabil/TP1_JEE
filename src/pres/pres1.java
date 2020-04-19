package pres;

import dao.DaoImpl;
import dao.DaoImpl2;
import metier.MetierImpl;

public class pres1 {

	public static void main(String[] args)
	{
		/* injection des depandances par instanciation statique => new */
		MetierImpl metier = new MetierImpl();
		metier.setDao(new DaoImpl());
		System.out.println(metier.calcul());
		metier.setDao(new DaoImpl2());
		System.out.println(metier.calcul());

	}

}
