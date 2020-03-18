package hibernate.yt.telusko;

import java.util.List;

import hibernate.yt.telusko.dao.CountryDAO;
import hibernate.yt.telusko.dao.impl.CountryDAOImpl;
import hibernate.yt.telusko.model.City;
import hibernate.yt.telusko.model.Country;
import hibernate.yt.telusko.model.State;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main(String[] args )
    {
     
    	CountryDAO countryDAO = new CountryDAOImpl();
/*        Country country = new Country();
        country.setCountryCode("IN");
        //country.setCountryId(114);
        country.setCountryName("India");
        country.setPopulation(1000000);
        
        State state = new State();
        state.setStateName("PNB");
        state.setStateId(115);
        state.setCountry(country);
     
        City city = new City();
        city.setCityId(115);
        city.setCityName("ABC");
        city.setState(state);
        
        country.getStates().add(state);
        state.setCapitalCity(city);*/
       
        
        //countryDAO.save(country);
    	
      /*  Country countryByCode = countryDAO.getCountryByCode("2");
    	System.out.println(countryByCode);
    	
    	List<State> states = countryByCode.getStates();
    	
    	for (State state : states) {
			System.out.println(state);
			List<City> cities = state.getCities();
			for (City city : cities) {
				System.out.println(city);
			}
		}*/
       
    	//Caching
        countryDAO.getCountryByCode("2");
    }
}
