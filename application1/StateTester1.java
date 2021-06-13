class StateTester1
{
	public static void main(String[] args)
	{
		State1 stateA = new State1("Karnataka","Banglore");
		stateA.displayState1Properties();
		
		State1 stateB = new State1("Delhi", "Agra");
		stateB.displayState1Properties();
		
		State1[] states = {stateA, stateB};
		
		Country1 country = new Country1("INDIA", 110001);
		country.initStates(states);
		country.displayCountry1Properties();
		
		Address1 addressA = new Address1("Church Street", 125);
		addressA.initCountry(country);
		addressA.displayAddress1Properties();
		
		Address1 addressB = new Address1("South Avenue", 166);
		addressB.initCountry(country);
		addressB.displayAddress1Properties();
		
		Address1[] address = {addressA, addressB};
		
		Developer1 developer = new Developer1("Sachin Bansal", "sachinbansal@gmail.com");
		developer.initAddress1(address);
		developer.displayDeveloper1Properties();
		
		Application1 application = new Application1("Flipkart", 7.12f);
		application.initDeveloper(developer);
		application.displayApplication1Properties();
		
		application.displayDeveloperName();
		application.displayDeveloperAddressSize();
		application.displayDeveloperCountryStateSize();
		application.displayDeveloperAddressStreet();
		application.displayDeveloperCountry();
		application.displayDeveloperCityName();
	}
}