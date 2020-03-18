package hibernate.yt.telusko.dao;

import java.util.List;

import hibernate.yt.telusko.model.Country;

public interface CountryDAO {

	void save(Country country);
	
	void update(Country country);
	
	Country getCountryByCode(String code);

	List<Country> getAllCountries();
}
