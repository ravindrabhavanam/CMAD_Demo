package atlas.biz;

import atlas.api.Atlas;
import atlas.api.AtlasException;
import atlas.api.Country;
import atlas.api.CountryNotFoundException;
import atlas.data.DAO;
import atlas.data.JPADao;

public class BasicAtlas implements Atlas{
	private DAO dao;
	
	public BasicAtlas() {
		dao = new JPADao();
	}

	@Override
	public Country getCountry(String countryName) throws CountryNotFoundException, AtlasException {
		Country country = dao.get(countryName);
		if (country == null){
			throw new CountryNotFoundException();
		}
		return country;
	}


}
