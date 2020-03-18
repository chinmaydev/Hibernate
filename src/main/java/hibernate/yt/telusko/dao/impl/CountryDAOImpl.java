package hibernate.yt.telusko.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import hibernate.yt.telusko.dao.CountryDAO;
import hibernate.yt.telusko.model.City;
import hibernate.yt.telusko.model.Country;
import hibernate.yt.telusko.model.State;

public class CountryDAOImpl implements CountryDAO {
	
	private static SessionFactory factory;
	private static Session session;
	
	static {
		Configuration con = new Configuration().configure().addAnnotatedClass(Country.class).addAnnotatedClass(State.class).addAnnotatedClass(City.class);

		factory = con.buildSessionFactory();
		
	}

	public void save(Country country) {
		
		Session session = getSession();
		
		Transaction transaction =session.beginTransaction();		
       
		session.save(country.getStates().get(0).getCapitalCity());
		session.save(country); 
		session.save(country.getStates().get(0));
		
        transaction.commit();
        
	}

	public void update(Country country) {
		// TODO Auto-generated method stub

	}

	public Country getCountryByCode(String code) {
		//Caching
		Country country = getSession().get(Country.class, Long.valueOf(code));
		System.out.println(country);
		country = getSession().get(Country.class, Long.valueOf(code));
		System.out.println(country);
		System.out.println(country.getStates().get(0));
		return getSession().get(Country.class, Long.valueOf(code));
	}

	public List<Country> getAllCountries() {
		// TODO Auto-generated method stub
		return null;
	}
	
	private static Session getSession() {
		if(session == null || !session.isConnected() ) {
			session = factory.openSession();
		}
	return session;
		//return  factory.openSession();
	}

}
