class StateTester4
{
	public static void main(String[] args)
	{
		State4 stateA = new State4("Punjab","Chandigarh");
		stateA.displayState4Properties();
		
		State4 stateB = new State4("WestBengal", "Kolkata");
		stateB.displayState4Properties();
		
		State4[] states = {stateA, stateB};
		
		Country4 country = new Country4("INDIA", 110001);
		country.initStates(states);
		country.displayCountry4Properties();
		
		Address4 addressA = new Address4("Dekka steet", 646);
		addressA.initCountry(country);
		addressA.displayAddress4Properties();
		
		Address4 addressB = new Address4("Bengal street", 755);
		addressB.initCountry(country);
		addressB.displayAddress4Properties();
		
		Address4[] address = {addressA, addressB};
		
		Developer4 developer = new Developer4("Bhavish Agarwal", "bhavishagarwalal@gmail.com");
		developer.initAddress4(address);
		developer.displayDeveloper4Properties();
		
		Application4 application = new Application4("Ola", 1.2f);
		application.initDeveloper(developer);
		application.displayApplication4Properties();
		
		application.displayDeveloperName();
		application.displayDeveloperAddressSize();
		application.displayDeveloperCountryStateSize();
		application.displayDeveloperAddressStreet();
		application.displayDeveloperCountry();
		application.displayDeveloperCityName();
	}
}