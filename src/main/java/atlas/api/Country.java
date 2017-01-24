package atlas.api;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@XmlRootElement
public class Country {
	@Id
	protected String countryName;
	protected String capital;
	protected String currency;
	
	public Country(){
		
	}
	public Country(String countryName, String capital, String currency) {
		super();
		this.countryName = countryName;
		this.capital = capital;
		this.currency = currency;
	}
	public String getCountryName() {
		return countryName;
	}
	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}
	public String getCapital() {
		return capital;
	}
	public void setCapital(String capital) {
		this.capital = capital;
	}
	public String getCurrency() {
		return currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}
}
