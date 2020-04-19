package metier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import dao.IDao;
@Component("metier")
public class MetierImpl implements Imetier
{
	/* pour injecter 
	*/
	public void setDao(IDao dao) {
		this.dao = dao;
		System.out.println("injection de dao");
	}
	
	/*couplage faible*/
	@Autowired
	private IDao dao;
	@Override
	public double calcul() {
		double t = dao.getTemperature();
		double res = t * 66;
		return res;
	}
	public void init()
	{
		System.out.println("initiqlitqtion de Metier impl");
	}

}
