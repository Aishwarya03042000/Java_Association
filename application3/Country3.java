class Country3
{
	String name;
	int code;
	State3[] states;
	
	Country3(String name, int code)
	{
		System.out.println("invoked Country3 in constructor");
		this.name = name;
		this.code = code;
	}
	void initStates(State3[] states)
	{
		if(states!=null)
		System.out.println("invoking method initStates()");
		this.states= states;
	}
	void displayCountry3Properties()
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