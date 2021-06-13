class StateTester9
{
	public static void main(String[] args)
	{
		State9 stateA = new State9("Karnataka","Banglore");
		stateA.displayState9Properties();
		
		State9 stateB = new State9("Delhi", "Agra");
		stateB.displayState9Properties();
		
		State9[] states = {stateA, stateB};
		
		Country9 country = new Country9("INDIA", 110001);
		country.initStates(states);
		country.displayCountry9Properties();
		
		Address9 addressA = new Address9("Church Street", 125);
		addressA.initCountry(country);
		addressA.displayAddress9Properties();
		
		Address9 addressB = new Address9("South Avenue", 166);
		addressB.initCountry(country);
		addressB.displayAddress9Properties();
		
		Address9[] address = {addressA, addressB};
		
		Developer9 developer = new Developer9("Charan Padmaraju", "charanpadmaraju@gmail.com");
		developer.initAddress9(address);
		developer.displayDeveloper9Properties();
		
		Application9 application = new Application9("RedBus", 4.2f);
		application.initDeveloper(developer);
		application.displayApplication9Properties();
		
		application.displayDeveloperName();
		application.displayDeveloperAddressSize();
		application.displayDeveloperCountryStateSize();
		application.displayDeveloperAddressStreet();
		application.displayDeveloperCountry();
		application.displayDeveloperCityName();
	}
}