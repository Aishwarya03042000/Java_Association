class StateTester5
{
	public static void main(String[] args)
	{
		State5 stateA = new State5("Karnataka","Banglore");
		stateA.displayState5Properties();
		
		State5 stateB = new State5("Delhi", "Agra");
		stateB.displayState5Properties();
		
		State5[] states = {stateA, stateB};
		
		Country5 country = new Country5("INDIA", 110001);
		country.initStates(states);
		country.displayCountry5Properties();
		
		Address5 addressA = new Address5("HSR Layout", 345);
		addressA.initCountry(country);
		addressA.displayAddress5Properties();
		
		Address5 addressB = new Address5("Sansad Marg", 12);
		addressB.initCountry(country);
		addressB.displayAddress5Properties();
		
		Address5[] address = {addressA, addressB};
		
		Developer5 developer = new Developer5("Pankaj Chhaparwal", "pankajchhaparwal@gmail.com");
		developer.initAddress5(address);
		developer.displayDeveloper5Properties();
		
		Application5 application = new Application5("Cricbuzz", 1.5f);
		application.initDeveloper(developer);
		application.displayApplication5Properties();
		
		application.displayDeveloperName();
		application.displayDeveloperAddressSize();
		application.displayDeveloperCountryStateSize();
		application.displayDeveloperAddressStreet();
		application.displayDeveloperCountry();
		application.displayDeveloperCityName();
	}
}