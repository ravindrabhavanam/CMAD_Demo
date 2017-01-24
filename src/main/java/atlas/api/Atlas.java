package atlas.api;

public interface Atlas {
	public Country getCountry(String countryName) throws CountryNotFoundException, AtlasException;
}
