class Country10
{
	String name;
	int code;
	State10[] states;
	
	Country10(String name, int code)
	{
		System.out.println("invoked Country10 in constructor");
		this.name = name;
		this.code = code;
	}
	void initStates(State10[] states)
	{
		if(states!=null)
		System.out.println("invoking method initStates()");
		this.states= states;
	}
	void displayCountry10Properties()
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