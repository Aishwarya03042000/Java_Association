class StateTester10
{
	public static void main(String[] args)
	{
		State10 stateA = new State10("Karnataka","Banglore");
		stateA.displayState10Properties();
		
		State10 stateB = new State10("Delhi", "Agra");
		stateB.displayState10Properties();
		
		State10[] states = {stateA, stateB};
		
		Country10 country = new Country10("INDIA", 110001);
		country.initStates(states);
		country.displayCountry10Properties();
		
		Address10 addressA = new Address10("Church Street", 125);
		addressA.initCountry(country);
		addressA.displayAddress10Properties();
		
		Address10 addressB = new Address10("South Avenue", 166);
		addressB.initCountry(country);
		addressB.displayAddress10Properties();
		
		Address10[] address = {addressA, addressB};
		
		Developer10 developer = new Developer10("Mukesh Bansal", "mukeshbansal@gmail.com");
		developer.initAddress10(address);
		developer.displayDeveloper10Properties();
		
		Application10 application = new Application10("Mynthra", 2.7f);
		application.initDeveloper(developer);
		application.displayApplication10Properties();
		
		application.displayDeveloperName();
		application.displayDeveloperAddressSize();
		application.displayDeveloperCountryStateSize();
		application.displayDeveloperAddressStreet();
		application.displayDeveloperCountry();
		application.displayDeveloperCityName();
	}
}