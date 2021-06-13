class Country6
{
	String name;
	int code;
	State6[] states;
	
	Country6(String name, int code)
	{
		System.out.println("invoked Country6 in constructor");
		this.name = name;
		this.code = code;
	}
	void initStates(State6[] states)
	{
		if(states!=null)
		System.out.println("invoking method initStates()");
		this.states= states;
	}
	void displayCountry6Properties()
	{
		System.out.println("CountryName: "+this.name);
		System.out.println("CountryCode: "+this.code);
		
		if(this.states!=null)
		{
			System.out.println("SizeOfState: "+this.states.length);
			
			for(int index=0; index<this.states.length; index++)
			{
				System.out.println(this.states[index]);
			}
		}
	}
}