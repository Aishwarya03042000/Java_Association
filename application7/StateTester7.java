class StateTester7
{
	public static void main(String[] args)
	{
		State7 stateA = new State7("Karnataka","Banglore");
		stateA.displayState7Properties();
		
		State7 stateB = new State7("Delhi", "Agra");
		stateB.displayState7Properties();
		
		State7[] states = {stateA, stateB};
		
		Country7 country = new Country7("INDIA", 110001);
		country.initStates(states);
		country.displayCountry7Properties();
		
		Address7 addressA = new Address7("Church Street", 125);
		addressA.initCountry(country);
		addressA.displayAddress7Properties();
		
		Address7 addressB = new Address7("South Avenue", 166);
		addressB.initCountry(country);
		addressB.displayAddress7Properties();
		
		Address7[] address = {addressA, addressB};
		
		Developer7 developer = new Developer7("Vijay Shekar", "vijayshekar@gmail.com");
		developer.initAddress7(address);
		developer.displayDeveloper7Properties();
		
		Application7 application = new Application7("Paytm", 1.7f);
		application.initDeveloper(developer);
		application.displayApplication7Properties();
		
		application.displayDeveloperName();
		application.displayDeveloperAddressSize();
		application.displayDeveloperCountryStateSize();
		application.displayDeveloperAddressStreet();
		application.displayDeveloperCountry();
		application.displayDeveloperCityName();
	}
}