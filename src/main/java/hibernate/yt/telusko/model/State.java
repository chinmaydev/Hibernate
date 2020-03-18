package hibernate.yt.telusko.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Transient;

@Entity
public class State {

	@Id
	private long stateId;
	private String stateName;
	@ManyToOne
	@JoinColumn(name="countryId")
	private Country country;
	
	@OneToOne(fetch=FetchType.EAGER)
	@JoinColumn(name ="capitalId")
	private City capitalCity;
	
	@OneToMany(targetEntity=City.class,mappedBy = "state")
	private List<City> cities = new ArrayList<City>();
	
	
	public long getStateId() {
		return stateId;
	}
	public void setStateId(long stateId) {
		this.stateId = stateId;
	}
	public String getStateName() {
		return stateName;
	}
	public void setStateName(String stateName) {
		this.stateName = stateName;
	}
	public Country getCountry() {
		return country;
	}
	public void setCountry(Country country) {
		this.country = country;
	}
	public City getCapitalCity() {
		return capitalCity;
	}
	public void setCapitalCity(City capitalCity) {
		this.capitalCity = capitalCity;
	}
	public List<City> getCities() {
		return cities;
	}
	public void setCities(List<City> cities) {
		this.cities = cities;
	}
	@Override
	public String toString() {
		return "State [stateId=" + stateId + ", stateName=" + stateName + ", country=" + country + ", capitalCity="
				+ capitalCity + "]";
	}
	
}
