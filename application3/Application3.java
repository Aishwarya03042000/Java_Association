class Application3
{
	String appName;
	float version;
	Developer3 developer;
	
	Application3(String appName, float version)
	{
		System.out.println("invoking Application3 in constructor");
		this.appName = appName;
		this.version = version;
	}
	void initDeveloper(Developer3 developer)
	{
		System.out.println("invoked method initDeveloper()");
		this.developer = developer;
	}
	void displayApplication3Properties()
	{
		System.out.println("AppName: "+this.appName);
		System.out.println("AppVersion: "+this.version);
		System.out.println("Developer: "+this.developer.name);
	}
	void displayDeveloperName()
	{
		System.out.println("Developer: "+this.developer.name);
	}
	void displayDeveloperAddressSize()
	{
		if(this.developer.address!=null)
		{
			System.out.println("DeveloperAddressSize: "+this.developer.address.length);
		}
	}
	void displayDeveloperCountryStateSize()
	{
		if(this.developer.address!=null)
		{
			for(int i=0; i<this.developer.address.length; i++)
			{
				Address3 address= developer.address[i];
				Country3 country = address.country;
				State3[] states =country.states;
				System.out.println("DeveloperCountryStateSize: "+states.length);
			}
		}
	}
	void displayDeveloperAddressStreet()
	{
		if(this.developer.address!=null)
		{
			for(int i=0; i<this.developer.address.length; i++)
			{
				Address3 address = developer.address[i];
				String street = address.street;
				System.out.println("DeveloperAddressStreet: "+street);
			}
		}
	}
	void displayDeveloperCountry()
	{
		if(this.developer.address!=null)
		{
			for(int i=0; i<this.developer.address.length; i++)
			{
				Address3 address = developer.address[i];
				Country3 country = address.country;
				System.out.println("DeveloperCountryName: "+country.name);
				System.out.println("DeveloperCountryCode: "+country.code);
			}
		}
	}
	void displayDeveloperCityName()
	{
		if(this.developer.address!=null)
		{
			for(int i=0;i<this.developer.address.length;i++)
			{
				Address3 address = developer.address[i];
				Country3 country = address.country;
				State3[] states = country.states;
				for(int j=0; j<states.length; j++)
				{
					State3 state = states[j];
					String capitalCityName = state.capitalCityName;
					System.out.println("DeveloperCityName: "+capitalCityName);
				}
			}
		}
	}
}