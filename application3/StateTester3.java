class StateTester3
{
	public static void main(String[] args)
	{
		State3 stateA = new State3("Maharastra","Mumbai");
		stateA.displayState3Properties();
		
		State3 stateB = new State3("Delhi", "Agra");
		stateB.displayState3Properties();
		
		State3[] states = {stateA, stateB};
		
		Country3 country = new Country3("INDIA", 110001);
		country.initStates(states);
		country.displayCountry3Properties();
		
		Address3 addressA = new Address3("Apollo street", 156);
		addressA.initCountry(country);
		addressA.displayAddress3Properties();
		
		Address3 addressB = new Address3("South Avenue", 96);
		addressB.initCountry(country);
		addressB.displayAddress3Properties();
		
		Address3[] address = {addressA, addressB};
		
		Developer3 developer = new Developer3("Deepinder Goyal", "deepindergoyal@gmail.com");
		developer.initAddress3(address);
		developer.displayDeveloper3Properties();
		
		Application3 application = new Application3("Zomato", 2.5f);
		application.initDeveloper(developer);
		application.displayApplication3Properties();
		
		application.displayDeveloperName();
		application.displayDeveloperAddressSize();
		application.displayDeveloperCountryStateSize();
		application.displayDeveloperAddressStreet();
		application.displayDeveloperCountry();
		application.displayDeveloperCityName();
	}
}