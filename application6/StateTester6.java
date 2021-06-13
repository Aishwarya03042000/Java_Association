class StateTester6
{
	public static void main(String[] args)
	{
		State6 stateA = new State6("Rajasthan","Jaipur");
		stateA.displayState6Properties();
		
		State6 stateB = new State6("Telangana", "Hyderabad");
		stateB.displayState6Properties();
		
		State6[] states = {stateA, stateB};
		
		Country6 country = new Country6("INDIA", 110001);
		country.initStates(states);
		country.displayCountry6Properties();
		
		Address6 addressA = new Address6("jodhpur street", 55);
		addressA.initCountry(country);
		addressA.displayAddress6Properties();
		
		Address6 addressB = new Address6("Charminar street", 956);
		addressB.initCountry(country);
		addressB.displayAddress6Properties();
		
		Address6[] address = {addressA, addressB};
		
		Developer6 developer = new Developer6("Nandan Reddy", "nandanreddy@gmail.com");
		developer.initAddress6(address);
		developer.displayDeveloper6Properties();
		
		Application6 application = new Application6("Swiggy", 5.7f);
		application.initDeveloper(developer);
		application.displayApplication6Properties();
		
		application.displayDeveloperName();
		application.displayDeveloperAddressSize();
		application.displayDeveloperCountryStateSize();
		application.displayDeveloperAddressStreet();
		application.displayDeveloperCountry();
		application.displayDeveloperCityName();
	}
}