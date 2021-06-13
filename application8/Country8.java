class Country8
{
	String name;
	int code;
	State8[] states;
	
	Country8(String name, int code)
	{
		System.out.println("invoked Country8 in constructor");
		this.name = name;
		this.code = code;
	}
	void initStates(State8[] states)
	{
		if(states!=null)
		System.out.println("invoking method initStates()");
		this.states= states;
	}
	void displayCountry8Properties()
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