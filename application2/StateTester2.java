class StateTester2
{
	public static void main(String[] args)
	{
		State2 stateA = new State2("Kerala","Thrivendrum");
		stateA.displayState2Properties();
		
		State2 stateB = new State2("TamilNadu", "Chennai");
		stateB.displayState2Properties();
		
		State2[] states = {stateA, stateB};
		
		Country2 country = new Country2("INDIA", 110001);
		country.initStates(states);
		country.displayCountry2Properties();
		
		Address2 addressA = new Address2("Fort road", 125);
		addressA.initCountry(country);
		addressA.displayAddress2Properties();
		
		Address2 addressB = new Address2("Siruvani road", 166);
		addressB.initCountry(country);
		addressB.displayAddress2Properties();
		
		Address2[] address = {addressA, addressB};
		
		Developer2 developer = new Developer2("Mukesh Ambani", "mukeshambani@gmail.com");
		developer.initAddress2(address);
		developer.displayDeveloper2Properties();
		
		Application2 application = new Application2("Jio", 1.7f);
		application.initDeveloper(developer);
		application.displayApplication2Properties();
		
		application.displayDeveloperName();
		application.displayDeveloperAddressSize();
		application.displayDeveloperCountryStateSize();
		application.displayDeveloperAddressStreet();
		application.displayDeveloperCountry();
		application.displayDeveloperCityName();
	}
}