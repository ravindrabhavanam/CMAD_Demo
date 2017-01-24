package atlas.data;

import atlas.api.Country;

public interface DAO {

	Country get(String countryName);

}
