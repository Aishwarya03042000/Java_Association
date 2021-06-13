class StateTester8
{
	public static void main(String[] args)
	{
		State8 stateA = new State8("Maharastra","Mumbai");
		stateA.displayState8Properties();
		
		State8 stateB = new State8("Delhi", "Agra");
		stateB.displayState8Properties();
		
		State8[] states = {stateA, stateB};
		
		Country8 country = new Country8("INDIA", 110001);
		country.initStates(states);
		country.displayCountry8Properties();
		
		Address8 addressA = new Address8("Church Street", 125);
		addressA.initCountry(country);
		addressA.displayAddress8Properties();
		
		Address8 addressB = new Address8("South Avenue", 166);
		addressB.initCountry(country);
		addressB.displayAddress8Properties();
		
		Address8[] address = {addressA, addressB};
		
		Developer8 developer = new Developer8("Prashan Agarwal", "prashanagarwalal@gmail.com");
		developer.initAddress8(address);
		developer.displayDeveloper8Properties();
		
		Application8 application = new Application8("Gaana", 3.9f);
		application.initDeveloper(developer);
		application.displayApplication8Properties();
		
		application.displayDeveloperName();
		application.displayDeveloperAddressSize();
		application.displayDeveloperCountryStateSize();
		application.displayDeveloperAddressStreet();
		application.displayDeveloperCountry();
		application.displayDeveloperCityName();
	}
}