package dao;

import org.springframework.stereotype.Component;

@Component("dao")
public class DaoImpl implements IDao
{

	@Override
	public double getTemperature() {
		// TODO Auto-generated method stub
		System.out.println("version base de donne");
		double t = 23;
		return t;
	}
	public void init()
	{
		System.out.println("instanciation de Dao impl");
	}

}
